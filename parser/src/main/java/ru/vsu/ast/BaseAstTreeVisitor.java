package ru.vsu.ast;

import ru.vsu.ast.command.AssignCommandNode;
import ru.vsu.ast.command.ConditionalOperatorNode;
import ru.vsu.ast.command.ElseIfNode;
import ru.vsu.ast.command.WhileLoopNode;
import ru.vsu.ast.expression.BinaryExpressionNode;
import ru.vsu.ast.expression.IdentifierExpressionNode;
import ru.vsu.ast.expression.NumberNode;

public class BaseAstTreeVisitor implements AstTreeVisitor {

    @Override
    public void visit(ScriptNode node) {

    }

    @Override
    public void visit(CodeBlockNode node) {

    }

    @Override
    public void visit(AssignCommandNode node) {

    }

    @Override
    public void visit(ConditionalOperatorNode node) {

    }

    @Override
    public void visit(ElseIfNode node) {

    }

    @Override
    public void visit(WhileLoopNode node) {

    }

    @Override
    public void visit(BinaryExpressionNode node) {

    }

    @Override
    public void visit(IdentifierExpressionNode node) {

    }

    @Override
    public void visit(NumberNode node) {

    }
}
