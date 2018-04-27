package ru.vsu.visitor;

import ru.vsu.ast.*;
import ru.vsu.ast.command.*;
import ru.vsu.ast.expression.*;
import ru.vsu.codegenerator.builder.expression.ExpressionBuilder;
import ru.vsu.codegenerator.builder.expression.ExpressionFactory;

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
    public ExpressionBuilder visit(UnaryExpressionNode node) {

        ExpressionBuilder expr = node.getExpression().accept(this);

        return expr.apply(node.getOperator());
    }

    @Override
    public ExpressionBuilder visit(IdentifierExpressionNode node) {

        return ExpressionFactory.createVariable(node.getIdName());
    }

    @Override
    public ExpressionBuilder visit(NumberNode node) {

        return ExpressionFactory.createNumber(node.getNumber());
    }

    @Override
    public ExpressionBuilder visit(StringNode node) {

        return ExpressionFactory.createString(node.getValue());
    }

    @Override
    public ExpressionBuilder visit(ArrayExpressionNode node) {

        List<ExpressionBuilder> rows =
                node.getRows()
                        .stream()
                        .map((x) -> x.accept(this))
                        .collect(Collectors.toList());

        return ExpressionFactory.createArray(rows);
    }

    @Override
    public ExpressionBuilder visit(ArrayExpressionNode.ArrayRowNode node) {

        List<ExpressionBuilder> expressions =
                node.getRowExpressions()
                        .stream()
                        .map((x) -> x.accept(this))
                        .collect(Collectors.toList());

        return ExpressionFactory.createRow(expressions);
    }

    @Override
    public ExpressionBuilder visit(RangeExpressionNode node) {

        ExpressionBuilder start = node.getStartExpression().accept(this);
        ExpressionBuilder end = node.getEndExpression().accept(this);

        ExpressionBuilder step = null;
        if(node.getStepExpression() != null){

            step = node.getStepExpression().accept(this);
        }

        return ExpressionFactory.createRange(start, step, end);
    }

    @Override
    public ExpressionBuilder visit(SliceExpressionNode node) {

        ExpressionBuilder start = null, stop = null, step = null;

        if(node.getStartExpression() != null){

            start = node.getStartExpression().accept(this);
        }

        if(node.getEndExpression() != null){

            stop = node.getEndExpression().accept(this);
        }

        if(node.getStepExpression() != null){

            step = node.getStepExpression().accept(this);
        }

        return ExpressionFactory.createSlice(start, step, stop);
    }

    @Override
    public ExpressionBuilder visit(TupleExpressionNode node) {

        List<ExpressionBuilder> expressions =
                node.getExpressions()
                        .stream()
                        .map(x -> x.accept(this))
                        .collect(Collectors.toList());

        return ExpressionFactory.createTuple(expressions);
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

        if(node.getObject() != null){

            ExpressionBuilder obj = node.getObject().accept(this);
            List<ExpressionFactory.ExpressionArg> args =
                    node.getArgs()
                            .stream()
                            .map(x ->
                                    new ExpressionFactory.ExpressionArg(
                                            x.getExpression().accept(this),
                                            x.getArgName())
                            ).collect(Collectors.toList());

            return ExpressionFactory.createCall(obj, node.getFunctionName(), args);
        } else {

            List<ExpressionBuilder> args =
                    node.getArgs()
                            .stream()
                            .map((x) -> x.getExpression().accept(this))
                            .collect(Collectors.toList());

            return ExpressionFactory.createFunction(node.getFunctionName(), args);
        }
    }

    @Override
    public ExpressionBuilder visit(FunctionArgumentNode node) {

        return null;
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
    public ExpressionBuilder visit(FunctionNode node) {
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
