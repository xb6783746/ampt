package ru.vsu.transformer;

import ru.vsu.ast.AstTreeVisitor;
import ru.vsu.ast.BasicAstNode;
import ru.vsu.ast.CodeBlockNode;
import ru.vsu.ast.ScriptNode;
import ru.vsu.ast.command.*;
import ru.vsu.ast.expression.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionTransformer implements AstTransformer, AstTreeVisitor<Void>  {


    private List<String> variableNames = new ArrayList<>();

    @Override
    public BasicAstNode transform(BasicAstNode tree) {

        tree.accept(this);

        return tree;
    }


    @Override
    public Void visit(ScriptNode node) {

        return node.getBlock().accept(this);
    }

    @Override
    public Void visit(CodeBlockNode node) {

        iterate(node.getCommandNodeList());

        return null;
    }

    @Override
    public Void visit(AssignCommandNode node) {

        if(node.getLvalue() instanceof IndexExpressionNode){

            IndexExpressionNode expr = (IndexExpressionNode)node.getLvalue();

            List<FunctionCallNode.FunctionArgumentNode> indices =
                    expr.getIndexes()
                            .stream()
                            .map(FunctionCallNode.FunctionArgumentNode::new)
                            .collect(Collectors.toList());

            FunctionCallNode.FunctionArgumentNode value =
                    new FunctionCallNode.FunctionArgumentNode(node.getRvalue(), "val");

            indices.add(value);

            FunctionCallNode func = new FunctionCallNode(
                    node.getParent(),
                    expr.getExpression(),
                    "mset",
                    indices
            );

            node.getParent().replace(node, func);

            func.accept(this);
        } else {

            node.getLvalue().accept(this);
            node.getRvalue().accept(this);

            if (node.getLvalue() instanceof IdentifierExpressionNode) {

                String varName = ((IdentifierExpressionNode) node.getLvalue()).getIdName();
                variableNames.add(varName);
            }
        }

        return null;
    }

    @Override
    public Void visit(ConditionalOperatorNode node) {

        node.getCondition().accept(this);
        node.getBlock().accept(this);

        iterate(node.getElseIfNodeList());

        node.getElseNode().accept(this);

        return null;
    }

    @Override
    public Void visit(ElseIfNode node) {

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

        node.getExpressionNode().accept(this);
        node.getBlock().accept(this);

        variableNames.remove(idName);

        return null;
    }

    @Override
    public Void visit(BinaryExpressionNode node) {

        node.getLeft().accept(this);
        node.getRight().accept(this);

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

        node.getStartExpression().accept(this);

        if(node.getStepExpression() != null){

            node.getStepExpression().accept(this);
        }

        node.getEndExpression().accept(this);

        return null;
    }

    @Override
    public Void visit(TupleExpressionNode node) {

        node.getExpressions().forEach(x -> x.accept(this));

        return null;
    }

    @Override
    public Void visit(IndexExpressionNode node) {

        if(node.getExpression() instanceof IdentifierExpressionNode){

            // possible function call
            // if there is no variable named id, it is function call

            IdentifierExpressionNode identNode = (IdentifierExpressionNode)node.getExpression();
            String id = identNode.getIdName();

            if(!variableNames.contains(id)){

                //replace with FunctionCallNode

                List<FunctionCallNode.FunctionArgumentNode> args =
                        node.getIndexes()
                                .stream()
                                .map(FunctionCallNode.FunctionArgumentNode::new)
                                .collect(Collectors.toList());

                FunctionCallNode funcCallNode =
                        new FunctionCallNode(node.getParent(), id, args);

                node.getParent().replace(node, funcCallNode);
            }
        } else{

            node.getExpression().accept(this);
        }

        for(ExpressionNode expressionNode : node.getIndexes()){

            expressionNode.accept(this);
        }

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
    public Void visit(FunctionCallNode.FunctionArgumentNode node) {

        node.getExpression().accept(this);
        return null;
    }

    private <T extends BasicAstNode> void iterate(List<T> list){

        for(int i = 0; i < list.size(); i++){

            list.get(i).accept(this);
        }
    }
}
