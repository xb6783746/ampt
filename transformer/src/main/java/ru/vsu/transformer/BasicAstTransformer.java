package ru.vsu.transformer;

import ru.vsu.ast.*;
import ru.vsu.ast.command.*;
import ru.vsu.ast.expression.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BasicAstTransformer implements AstTransformer, AstVisitor<Void> {


    private List<String> variableNames = new ArrayList<>();
    private boolean isInsideIndex = false;

    @Override
    public BasicAstNode transform(BasicAstNode tree) {

        tree.accept(this);

        return tree;
    }


    @Override
    public Void visit(ScriptNode node) {

        iterate(node.getNodes());

        return null;
    }

    @Override
    public Void visit(CodeBlockNode node) {

        iterate(node.getCommandNodeList());

        return null;
    }

    @Override
    public Void visit(FunctionNode node) {

        node.getBlock().accept(this);
        iterate(node.getArgs());

        FunctionArgumentNode nargin = new FunctionArgumentNode(
                null,
                "nargin"
        );
        FunctionArgumentNode nargout = new FunctionArgumentNode(
                new NumberNode("1"),
                "nargout"
        );

        node.getArgs().add(nargin);
        node.getArgs().add(nargout);

        return null;
    }

    @Override
    public Void visit(AssignCommandNode node) {

        node.getLvalue().accept(this);
        node.getRvalue().accept(this);

        for(BasicAstNode lvalue: node.getLvalue().getExpressions()){

            if (lvalue instanceof IdentifierExpressionNode) {

                String varName = ((IdentifierExpressionNode) lvalue).getIdName();
                variableNames.add(varName);
            }

            if (lvalue instanceof IndexExpressionNode) {

                ((IndexExpressionNode) lvalue).setGetter(false);
            }
        }

        if(node.getLvalue().isUnpackExpression()
                && node.getRvalue() instanceof FunctionCallNode){

            LValueNode lvalue = node.getLvalue();
            FunctionCallNode rvalue = (FunctionCallNode)node.getRvalue();

            FunctionArgumentNode nargout = createNargoutNode(lvalue.getExpressions().size());

            rvalue.getArgs().add(nargout);
        }

        return null;
    }

    @Override
    public Void visit(LValueNode node) {

        iterate(node.getExpressions());

        return null;
    }

    @Override
    public Void visit(ConditionalOperatorNode node) {

        node.getCondition().accept(this);
        node.getBlock().accept(this);

        iterate(node.getElseIfNodeList());

        if(node.getElseNode() != null) {

            node.getElseNode().accept(this);
        }

        return null;
    }

    @Override
    public Void visit(ElseIfNode node) {

        node.getCondition().accept(this);
        node.getBlock().accept(this);

        return null;
    }

    @Override
    public Void visit(SwitchOperatorNode node) {

        node.getCases().forEach(x -> x.accept(this));

        return null;
    }

    @Override
    public Void visit(SwitchCaseNode node) {

        node.getCondition().accept(this);
        node.getBlock().accept(this);

        return null;
    }

    @Override
    public Void visit(WhileLoopNode node) {

        node.getCondition().accept(this);
        node.getBlock().accept(this);

        return null;
    }

    @Override
    public Void visit(ForLoopNode node) {

        String idName = node.getId().getIdName();

        variableNames.add(idName);

        node.getExpression().accept(this);
        node.getBlock().accept(this);

        variableNames.remove(idName);

        return null;
    }

    @Override
    public Void visit(FunctionHandleExpression node) {
        return null;
    }

    @Override
    public Void visit(AnonymousFunctionExpression node) {

        node.getExpressionNode().accept(this);

        FunctionArgumentNode nargin = new FunctionArgumentNode(
                null,
                "nargin"
        );
        FunctionArgumentNode nargout = new FunctionArgumentNode(
                new NumberNode("1"),
                "nargout"
        );

        node.getArgs().add(nargin);
        node.getArgs().add(nargout);

        return null;
    }

    @Override
    public Void visit(BinaryExpressionNode node) {

        node.getLeft().accept(this);
        node.getRight().accept(this);

        return null;
    }

    @Override
    public Void visit(UnaryExpressionNode node) {

        node.getExpression().accept(this);

        return null;
    }

    @Override
    public Void visit(IdentifierExpressionNode node) {

        return null;
    }

    @Override
    public Void visit(NumberNode node) {

        return null;
    }

    @Override
    public Void visit(StringNode node) {

        return null;
    }

    @Override
    public Void visit(ArrayExpressionNode node) {

        iterate(node.getRows());

        return null;
    }

    @Override
    public Void visit(ArrayExpressionNode.ArrayRowNode node) {

        iterate(node.getRowExpressions());

        return null;
    }

    @Override
    public Void visit(RangeExpressionNode node) {

        if(isInsideIndex){

            SliceExpressionNode slice = new SliceExpressionNode(
                    node.getParent(),
                    node.getStartExpression(),
                    node.getStepExpression(),
                    node.getEndExpression()
            );

            node.getParent().replace(node, slice);

            node = slice;
        }

        if(node.getStartExpression() != null){

            node.getStartExpression().accept(this);
        }

        if(node.getStepExpression() != null){

            node.getStepExpression().accept(this);
        }

        if(node.getEndExpression() != null){

            node.getEndExpression().accept(this);
        }


        return null;
    }

    @Override
    public Void visit(SliceExpressionNode node) {

        return visit((RangeExpressionNode)node);
    }

    @Override
    public Void visit(IndexExpressionNode node) {

        isInsideIndex = true;

        if(node.getExpression() instanceof IdentifierExpressionNode){

            // possible function call
            // if there is no variable named id, it is function call

            IdentifierExpressionNode identNode = (IdentifierExpressionNode)node.getExpression();
            String id = identNode.getIdName();

            if(!variableNames.contains(id)){

                //replace with FunctionCallNode

                List<FunctionArgumentNode> args =
                        node.getIndexes()
                                .stream()
                                .map(FunctionArgumentNode::new)
                                .collect(Collectors.toList());

                FunctionCallNode funcCallNode =
                        new FunctionCallNode(node.getParent(), id, args);

                node.getParent().replace(node, funcCallNode);
            }
        } else{

            node.getExpression().accept(this);
        }

        for(BasicAstNode expressionNode : node.getIndexes()){

            expressionNode.accept(this);
        }

        isInsideIndex = false;
        return null;
    }

    @Override
    public Void visit(FunctionCallNode node) {

        if(node.getObject() != null) {

            node.getObject().accept(this);
        }

        iterate(node.getArgs());

        return null;
    }

    @Override
    public Void visit(FunctionArgumentNode node) {

        if(node.getExpression() != null) {

            node.getExpression().accept(this);
        }
        return null;
    }

    private <T extends BasicAstNode> void iterate(List<T> list){

        for(int i = 0; i < list.size(); i++){

            list.get(i).accept(this);
        }
    }

    private FunctionArgumentNode createNargoutNode(int count){

        return new FunctionArgumentNode(
                new NumberNode(String.valueOf(count)),
                "nargout"
        );
    }
}
