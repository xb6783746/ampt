package ru.vsu.visitor;

import ru.vsu.ast.AstTreeVisitor;
import ru.vsu.ast.CodeBlockNode;
import ru.vsu.ast.ScriptNode;
import ru.vsu.ast.command.*;
import ru.vsu.ast.expression.*;
import ru.vsu.codegenerator.builder.ExpressionBuilder;

import java.util.List;
import java.util.stream.Collectors;

public class ExpressionVisitor implements AstTreeVisitor<ExpressionBuilder> {

    @Override
    public ExpressionBuilder visit(BinaryExpressionNode node) {

        ExpressionBuilder left = node.getLeft().accept(this);
        ExpressionBuilder right = node.getRight().accept(this);

        return left.apply(node.getOperator(), right);
    }

    @Override
    public ExpressionBuilder visit(IdentifierExpressionNode node) {

        return new ExpressionBuilder(node.getIdName(), 0, true);
    }

    @Override
    public ExpressionBuilder visit(NumberNode node) {

        return new ExpressionBuilder(node.getNumber(), 0, true);
    }

    @Override
    public ExpressionBuilder visit(StringNode node) {

        return ExpressionBuilder.createString(node.getValue());
    }

    @Override
    public ExpressionBuilder visit(ArrayExpressionNode node) {

        List<ExpressionBuilder> rows =
                node.getRows()
                        .stream()
                        .map((x) -> x.accept(this))
                        .collect(Collectors.toList());

        return ExpressionBuilder.createArray(rows);
    }

    @Override
    public ExpressionBuilder visit(ArrayExpressionNode.ArrayRowNode node) {

        List<ExpressionBuilder> expressions =
                node.getRowExpressions()
                        .stream()
                        .map((x) -> x.accept(this))
                        .collect(Collectors.toList());

        return ExpressionBuilder.createRow(expressions);
    }

    @Override
    public ExpressionBuilder visit(RangeExpressionNode node) {

        ExpressionBuilder start = node.getStartExpression().accept(this);
        ExpressionBuilder end = node.getEndExpression().accept(this);

        ExpressionBuilder step = null;
        if(node.getStepExpression() != null){

            step = node.getStepExpression().accept(this);
        }

        return ExpressionBuilder.createRange(start, step, end);
    }

    @Override
    public ExpressionBuilder visit(IndexExpressionNode node) {

        ExpressionBuilder expression = node.getExpression().accept(this);

        List<ExpressionBuilder> indexes =
                node.getIndexes()
                        .stream()
                        .map((x) -> x.accept(this))
                        .collect(Collectors.toList());

        return expression.index(indexes);
    }

    @Override
    public ExpressionBuilder visit(FunctionCallNode node) {

        List<ExpressionBuilder> args =
                node.getArgs()
                        .stream()
                        .map((x) -> x.accept(this))
                        .collect(Collectors.toList());

        return ExpressionBuilder.createFunction(node.getFunctionName(), args);
    }

    @Override
    public ExpressionBuilder visit(ScriptNode node) {
        return null;
    }
    @Override
    public ExpressionBuilder visit(CodeBlockNode node) {
        return null;
    }
    @Override
    public ExpressionBuilder visit(AssignCommandNode node) {
        return null;
    }
    @Override
    public ExpressionBuilder visit(ConditionalOperatorNode node) {
        return null;
    }
    @Override
    public ExpressionBuilder visit(ElseIfNode node) {
        return null;
    }
    @Override
    public ExpressionBuilder visit(WhileLoopNode node) {
        return null;
    }

    @Override
    public ExpressionBuilder visit(ForLoopNode node) {
        return null;
    }
}
