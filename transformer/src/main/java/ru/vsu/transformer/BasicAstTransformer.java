package ru.vsu.transformer;

import ru.vsu.ast.*;
import ru.vsu.ast.command.*;
import ru.vsu.ast.expression.*;

import java.util.*;
import java.util.stream.Collectors;

public class BasicAstTransformer 
        implements AstTransformer, ParameterizedAstVisitor<Void, BasicAstTransformer.Context> {


    class Context {

        Set<String> variableNames = new HashSet<>();
        Set<String> notDeclaredVars = new HashSet<>();
    }

    @Override
    public BasicAstNode transform(BasicAstNode tree) {

        tree.accept(this, null);

        return tree;
    }


    private BasicAstNode createPredeclaredVar(String varName){

        FunctionCallNode functionCallNode =
                new FunctionCallNode(
                        "stub",
                        new ArrayList<>()
                );

        IdentifierExpressionNode identifierExpressionNode = new IdentifierExpressionNode(varName);
        LValueNode lValueNode = new LValueNode(false, identifierExpressionNode);

        return new AssignCommandNode(lValueNode, functionCallNode);
    }

    @Override
    public Void visit(ScriptNode node, Context ctx) {

        Context context = new Context();

        iterate(node.getNodes(), context);

        List<BasicAstNode> vars = context.notDeclaredVars
                .stream()
                .map(this::createPredeclaredVar)
                .collect(Collectors.toList());
        CodeBlockNode codeBlockNode = new CodeBlockNode(vars);
        node.getNodes().add( 0, codeBlockNode);

        return null;
    }

    @Override
    public Void visit(CodeBlockNode node, Context ctx) {

        iterate(node.getCommandNodeList(), ctx);

        return null;
    }

    @Override
    public Void visit(FunctionNode node, Context ctx) {

        Context context = new Context();

        node.getBlock().accept(this, context);
        iterate(node.getArgs(), context);

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


        List<BasicAstNode> vars = context.notDeclaredVars
                .stream()
                .map(this::createPredeclaredVar)
                .collect(Collectors.toList());
        node.getBlock().getCommandNodeList().addAll( 0, vars);

        return null;
    }

    @Override
    public Void visit(AssignCommandNode node, Context ctx) {

        for(BasicAstNode lvalue: node.getLvalue().getExpressions()) {

            if (lvalue instanceof IndexExpressionNode) {

                IndexExpressionNode indexExpressionNode = (IndexExpressionNode)lvalue;

                if(indexExpressionNode.getExpression() instanceof IdentifierExpressionNode){

                    String varName = ((IdentifierExpressionNode) indexExpressionNode.getExpression()).getIdName();
                    if(!ctx.variableNames.contains(varName)) {
                        ctx.notDeclaredVars.add(varName);
                        ctx.variableNames.add(varName);
                    }
                }
            }
        }
        node.getLvalue().accept(this, ctx);
        node.getRvalue().accept(this, ctx);

        for(BasicAstNode lvalue: node.getLvalue().getExpressions()){

            if (lvalue instanceof IdentifierExpressionNode) {

                String varName = ((IdentifierExpressionNode) lvalue).getIdName();
                ctx.variableNames.add(varName);
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

        if(node.getRvalue() instanceof IdentifierExpressionNode
                || node.getRvalue() instanceof IndexExpressionNode){

            ExpressionNode oldRvalue = node.getRvalue();
            FunctionCallNode copy = createCopyNode(node.getRvalue());

            node.replace(oldRvalue, copy);
        }

        return null;
    }

    @Override
    public Void visit(LValueNode node, Context ctx) {

        iterate(node.getExpressions(), ctx);

        return null;
    }

    @Override
    public Void visit(ConditionalOperatorNode node, Context ctx) {

        node.getCondition().accept(this, ctx);
        node.getBlock().accept(this, ctx);

        iterate(node.getElseIfNodeList(), ctx);

        if(node.getElseNode() != null) {

            node.getElseNode().accept(this, ctx);
        }

        return null;
    }

    @Override
    public Void visit(ElseIfNode node, Context ctx) {

        node.getCondition().accept(this, ctx);
        node.getBlock().accept(this, ctx);

        return null;
    }

    @Override
    public Void visit(SwitchOperatorNode node, Context ctx) {

        node.getCases().forEach(x -> x.accept(this, ctx));

        return null;
    }

    @Override
    public Void visit(SwitchCaseNode node, Context ctx) {

        node.getCondition().accept(this, ctx);
        node.getBlock().accept(this, ctx);

        return null;
    }

    @Override
    public Void visit(WhileLoopNode node, Context ctx) {

        node.getCondition().accept(this, ctx);
        node.getBlock().accept(this, ctx);

        return null;
    }

    @Override
    public Void visit(ForLoopNode node, Context ctx) {

        String idName = node.getId().getIdName();

        ctx.variableNames.add(idName);

        node.getExpression().accept(this, ctx);
        node.getBlock().accept(this, ctx);

        ctx.variableNames.remove(idName);

        return null;
    }

    @Override
    public Void visit(FunctionHandleExpression node, Context ctx) {
        return null;
    }

    @Override
    public Void visit(AnonymousFunctionExpression node, Context ctx) {

        node.getExpressionNode().accept(this, ctx);

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
    public Void visit(BinaryExpressionNode node, Context ctx) {

        node.getLeft().accept(this, ctx);
        node.getRight().accept(this, ctx);

        return null;
    }

    @Override
    public Void visit(UnaryExpressionNode node, Context ctx) {

        node.getExpression().accept(this, ctx);

        return null;
    }

    @Override
    public Void visit(IdentifierExpressionNode node, Context ctx) {

        return null;
    }

    @Override
    public Void visit(NumberNode node, Context ctx) {

        return null;
    }

    @Override
    public Void visit(StringNode node, Context ctx) {

        return null;
    }

    @Override
    public Void visit(ArrayExpressionNode node, Context ctx) {

        iterate(node.getRows(), ctx);

        return null;
    }

    @Override
    public Void visit(ArrayExpressionNode.ArrayRowNode node, Context ctx) {

        iterate(node.getRowExpressions(), ctx);

        return null;
    }

    @Override
    public Void visit(RangeExpressionNode node, Context ctx) {

//        if(node.getStartExpression() == null || node.getEndExpression() == null){
//
//            SliceExpressionNode slice = new SliceExpressionNode(
//                    node.getParent(),
//                    node.getStartExpression(),
//                    node.getStepExpression(),
//                    node.getEndExpression()
//            );
//
//            node.getParent().replace(node, slice);
//
//            node = slice;
//        }

        if(node.getStartExpression() != null){

            node.getStartExpression().accept(this, ctx);
        }

        if(node.getStepExpression() != null){

            node.getStepExpression().accept(this, ctx);
        }

        if(node.getEndExpression() != null){

            node.getEndExpression().accept(this, ctx);
        }


        return null;
    }

    @Override
    public Void visit(SliceExpressionNode node, Context ctx) {

        return visit((RangeExpressionNode)node, ctx);
    }

    @Override
    public Void visit(IndexExpressionNode node, Context ctx) {

        if(node.getExpression() instanceof IdentifierExpressionNode){

            // possible function call
            // if there is no variable named id, it is function call

            IdentifierExpressionNode identNode = (IdentifierExpressionNode)node.getExpression();
            String id = identNode.getIdName();

            if(!ctx.variableNames.contains(id)){

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

            node.getExpression().accept(this, ctx);
        }

        for(BasicAstNode expressionNode : node.getIndexes()){

            expressionNode.accept(this, ctx);
        }

        return null;
    }

    @Override
    public Void visit(FunctionCallNode node, Context ctx) {

        if(node.getObject() != null) {

            node.getObject().accept(this, ctx);
        }

        iterate(node.getArgs(), ctx);

        return null;
    }

    @Override
    public Void visit(FunctionArgumentNode node, Context ctx) {

        if(node.getExpression() != null) {

            node.getExpression().accept(this, ctx);
        }
        return null;
    }

    private <T extends BasicAstNode> void iterate(List<T> list, Context ctx){

        for(int i = 0; i < list.size(); i++){

            list.get(i).accept(this, ctx);
        }
    }

    private FunctionArgumentNode createNargoutNode(int count){

        return new FunctionArgumentNode(
                new NumberNode(String.valueOf(count)),
                "nargout"
        );
    }

    private FunctionCallNode createCopyNode(ExpressionNode arg){

        List<FunctionArgumentNode> args =
                Collections.singletonList(new FunctionArgumentNode(arg));

        return new FunctionCallNode(
                "copy",
                args
        );
    }
}
