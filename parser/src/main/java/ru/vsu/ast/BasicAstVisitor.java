package ru.vsu.ast;

import ru.vsu.ast.command.*;
import ru.vsu.ast.expression.*;

public abstract class BasicAstVisitor<T> implements AstTreeVisitor<T> {
    
    @Override
    public T visit(ScriptNode node) {

        node.getNodes().forEach(x -> x.accept(this));

        return null;
    }

    @Override
    public T visit(CodeBlockNode node) {

        node.getCommandNodeList().forEach(x -> x.accept(this));
        return null;
    }

    @Override
    public T visit(AssignCommandNode node) {

        node.getLvalue().accept(this);
        node.getRvalue().accept(this);

        return null;
    }

    @Override
    public T visit(LValueNode node) {

        node.getExpressions().forEach(x -> x.accept(this));

        return null;
    }

    @Override
    public T visit(UnpackLValueNode node) {

        node.getExpressions().forEach(x -> x.accept(this));

        return null;
    }

    @Override
    public T visit(ConditionalOperatorNode node) {

        node.getCondition().accept(this);
        node.getBlock().accept(this);

        node.getElseIfNodeList().forEach(x -> x.accept(this));

        node.getElseNode().accept(this);

        return null;
    }

    @Override
    public T visit(ElseIfNode node) {
        
        node.getCondition().accept(this);
        node.getBlock().accept(this);
        
        return null;
    }

    @Override
    public T visit(WhileLoopNode node) {

        node.getCondition().accept(this);
        node.getBlock().accept(this);

        return null;
    }

    @Override
    public T visit(ForLoopNode node) {

        node.getId().accept(this);
        node.getExpressionNode().accept(this);
        node.getBlock().accept(this);

        return null;
    }

    @Override
    public T visit(FunctionHandleExpression node) {
        return null;
    }

    @Override
    public T visit(AnonymousFunctionExpression node) {

        node.getExpressionNode().accept(this);

        return null;
    }

    @Override
    public T visit(BinaryExpressionNode node) {

        node.getLeft().accept(this);
        node.getRight().accept(this);

        return null;
    }

    @Override
    public T visit(UnaryExpressionNode node) {

        node.getExpression().accept(this);

        return null;
    }

    @Override
    public T visit(IdentifierExpressionNode node) {

        return null;
    }

    @Override
    public T visit(NumberNode node) {
        
        return null;
    }

    @Override
    public T visit(ArrayExpressionNode node) {

        node.getRows().forEach(x -> x.accept(this));

        return null;
    }

    @Override
    public T visit(ArrayExpressionNode.ArrayRowNode node) {

        node.getRowExpressions().forEach(x -> x.accept(this));

        return null;
    }

    @Override
    public T visit(RangeExpressionNode node) {

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
    public T visit(IndexExpressionNode node) {

        node.getExpression().accept(this);
        node.getIndexes().forEach(x -> x.accept(this));

        return null;
    }

    @Override
    public T visit(StringNode node) {

        return null;
    }

    @Override
    public T visit(FunctionCallNode node) {

        if(node.getObject() != null){

            node.getObject().accept(this);
        }

        node.getArgs().forEach(x -> x.getExpression().accept(this));

        return null;
    }

    @Override
    public T visit(FunctionArgumentNode node) {

        node.getExpression().accept(this);

        return null;
    }

    @Override
    public T visit(TupleExpressionNode node) {

        node.getExpressions().forEach(x -> x.accept(this));

        return null;
    }

    @Override
    public T visit(FunctionNode node) {

        node.getBlock().accept(this);

        return null;
    }

    @Override
    public T visit(SliceExpressionNode node) {

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
}
