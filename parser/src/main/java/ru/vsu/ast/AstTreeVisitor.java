package ru.vsu.ast;

import ru.vsu.ast.command.AssignCommandNode;
import ru.vsu.ast.command.ConditionalOperatorNode;
import ru.vsu.ast.command.ElseIfNode;
import ru.vsu.ast.command.WhileLoopNode;
import ru.vsu.ast.expression.*;

public interface AstTreeVisitor<T> {

    T visit(ScriptNode node);

    T visit(CodeBlockNode node);

    T visit(AssignCommandNode node);
    T visit(ConditionalOperatorNode node);
    T visit(ElseIfNode node);
    T visit(WhileLoopNode node);

    T visit(BinaryExpressionNode node);
    T visit(IdentifierExpressionNode node);
    T visit(NumberNode node);
    T visit(ArrayExpressionNode node);
    T visit(ArrayExpressionNode.ArrayRowNode node);
    T visit(IndexExpressionNode node);
}
