package ru.vsu.ast;

import ru.vsu.ast.command.AssignCommandNode;
import ru.vsu.ast.command.ConditionalOperatorNode;
import ru.vsu.ast.command.ElseIfNode;
import ru.vsu.ast.command.WhileLoopNode;
import ru.vsu.ast.expression.BinaryExpressionNode;
import ru.vsu.ast.expression.IdentifierExpressionNode;
import ru.vsu.ast.expression.NumberNode;

public interface AstTreeVisitor {

    void visit(ScriptNode node);

    void visit(CodeBlockNode node);

    void visit(AssignCommandNode node);
    void visit(ConditionalOperatorNode node);
    void visit(ElseIfNode node);
    void visit(WhileLoopNode node);

    void visit(BinaryExpressionNode node);
    void visit(IdentifierExpressionNode node);
    void visit(NumberNode node);
}
