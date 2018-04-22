package ru.vsu.ast;

import ru.vsu.ast.command.*;
import ru.vsu.ast.expression.*;

public abstract class BasicAstVisitor<T> implements AstTreeVisitor<T> {
    
    @Override
    public T visit(ScriptNode node) {

        return node.getBlock().accept(this);
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
    public T visit(BinaryExpressionNode node) {

        node.getLeft().accept(this);
        node.getRight().accept(this);

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

        node.getStartExpression().accept(this);

        if(node.getStepExpression() != null){

            node.getStepExpression().accept(this);
        }

        node.getEndExpression().accept(this);

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
    public T visit(FunctionCallNode.FunctionArgumentNode node) {

        node.getExpression().accept(this);

        return null;
    }

    @Override
    public T visit(TupleExpressionNode node) {

        node.getExpressions().forEach(x -> x.accept(this));

        return null;
    }
}
