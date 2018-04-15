package ru.vsu.visitor;

import ru.vsu.ast.AstTreeVisitor;
import ru.vsu.ast.CodeBlockNode;
import ru.vsu.ast.ScriptNode;
import ru.vsu.ast.command.AssignCommandNode;
import ru.vsu.ast.command.ConditionalOperatorNode;
import ru.vsu.ast.command.ElseIfNode;
import ru.vsu.ast.command.WhileLoopNode;
import ru.vsu.ast.expression.BinaryExpressionNode;
import ru.vsu.ast.expression.IdentifierExpressionNode;
import ru.vsu.ast.expression.NumberNode;
import ru.vsu.codegenerator.builder.ExpressionBuilder;

public class ExpressionVisitor implements AstTreeVisitor<ExpressionBuilder> {

    @Override
    public ExpressionBuilder visit(BinaryExpressionNode node) {

        ExpressionBuilder left = node.getLeft().accept(this);
        ExpressionBuilder right = node.getRight().accept(this);

        return left.apply(node.getOperator(), right);
    }

    @Override
    public ExpressionBuilder visit(IdentifierExpressionNode node) {

        return new ExpressionBuilder(node.getIdName(), 0);
    }

    @Override
    public ExpressionBuilder visit(NumberNode node) {

        return new ExpressionBuilder(node.getNumber(), 0);
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
}
