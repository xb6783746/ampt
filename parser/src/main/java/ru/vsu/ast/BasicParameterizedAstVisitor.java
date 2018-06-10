package ru.vsu.ast;

import ru.vsu.ast.command.*;
import ru.vsu.ast.expression.*;

public class BasicParameterizedAstVisitor<T, ParamType> implements ParameterizedAstVisitor<T, ParamType> {
    @Override
    public T visit(ScriptNode node, ParamType param) {

        node.getNodes().forEach(x -> x.accept(this, param));

        return null;
    }

    @Override
    public T visit(CodeBlockNode node, ParamType param) {

        node.getCommandNodeList().forEach(x -> x.accept(this, param));
        return null;
    }

    @Override
    public T visit(AssignCommandNode node, ParamType param) {

        node.getLvalue().accept(this, param);
        node.getRvalue().accept(this, param);

        return null;
    }

    @Override
    public T visit(LValueNode node, ParamType param) {

        node.getExpressions().forEach(x -> x.accept(this, param));

        return null;
    }

    @Override
    public T visit(ConditionalOperatorNode node, ParamType param) {

        node.getCondition().accept(this, param);
        node.getBlock().accept(this, param);

        node.getElseIfNodeList().forEach(x -> x.accept(this, param));

        if(node.getElseNode() != null) {

            node.getElseNode().accept(this, param);
        }

        return null;
    }

    @Override
    public T visit(ElseIfNode node, ParamType param) {

        node.getCondition().accept(this, param);
        node.getBlock().accept(this, param);

        return null;
    }

    @Override
    public T visit(SwitchOperatorNode node, ParamType param) {

        node.getCases().forEach(x -> x.accept(this, param));

        return null;
    }

    @Override
    public T visit(SwitchCaseNode node, ParamType param) {

        node.getCondition().accept(this, param);
        node.getBlock().accept(this, param);

        return null;
    }

    @Override
    public T visit(WhileLoopNode node, ParamType param) {

        node.getCondition().accept(this, param);
        node.getBlock().accept(this, param);

        return null;
    }

    @Override
    public T visit(ForLoopNode node, ParamType param) {

        node.getId().accept(this, param);
        node.getExpression().accept(this, param);
        node.getBlock().accept(this, param);

        return null;
    }

    @Override
    public T visit(FunctionHandleExpression node, ParamType param) {
        return null;
    }

    @Override
    public T visit(AnonymousFunctionExpression node, ParamType param) {

        node.getExpressionNode().accept(this, param);

        return null;
    }

    @Override
    public T visit(BinaryExpressionNode node, ParamType param) {

        node.getLeft().accept(this, param);
        node.getRight().accept(this, param);

        return null;
    }

    @Override
    public T visit(UnaryExpressionNode node, ParamType param) {

        node.getExpression().accept(this, param);

        return null;
    }

    @Override
    public T visit(IdentifierExpressionNode node, ParamType param) {

        return null;
    }

    @Override
    public T visit(NumberNode node, ParamType param) {

        return null;
    }

    @Override
    public T visit(ArrayExpressionNode node, ParamType param) {

        node.getRows().forEach(x -> x.accept(this, param));

        return null;
    }

    @Override
    public T visit(ArrayExpressionNode.ArrayRowNode node, ParamType param) {

        node.getRowExpressions().forEach(x -> x.accept(this, param));

        return null;
    }

    @Override
    public T visit(RangeExpressionNode node, ParamType param) {

        if(node.getStartExpression() != null){

            node.getStartExpression().accept(this, param);
        }

        if(node.getStepExpression() != null){

            node.getStepExpression().accept(this, param);
        }

        if(node.getEndExpression() != null){

            node.getEndExpression().accept(this, param);
        }

        return null;
    }

    @Override
    public T visit(IndexExpressionNode node, ParamType param) {

        node.getExpression().accept(this, param);
        node.getIndexes().forEach(x -> x.accept(this, param));

        return null;
    }

    @Override
    public T visit(EndExpressionNode node, ParamType param) {
        return null;
    }

    @Override
    public T visit(StringNode node, ParamType param) {

        return null;
    }

    @Override
    public T visit(FunctionCallNode node, ParamType param) {

        if(node.getObject() != null){

            node.getObject().accept(this, param);
        }

        node.getArgs().forEach(x -> x.getExpression().accept(this, param));

        return null;
    }

    @Override
    public T visit(FunctionArgumentNode node, ParamType param) {

        node.getExpression().accept(this, param);

        return null;
    }

    @Override
    public T visit(FunctionNode node, ParamType param) {

        node.getBlock().accept(this, param);

        return null;
    }

    @Override
    public T visit(SliceExpressionNode node, ParamType param) {

        if(node.getStartExpression() != null){

            node.getStartExpression().accept(this, param);
        }

        if(node.getStepExpression() != null){

            node.getStepExpression().accept(this, param);
        }

        if(node.getEndExpression() != null){

            node.getEndExpression().accept(this, param);
        }
        return null;
    }
}
