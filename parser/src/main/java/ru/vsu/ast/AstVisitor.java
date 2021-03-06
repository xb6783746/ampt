package ru.vsu.ast;

import ru.vsu.ast.command.*;
import ru.vsu.ast.expression.*;

public interface AstVisitor<T> {

    T visit(ScriptNode node);

    T visit(CodeBlockNode node);
    T visit(FunctionNode node);

    T visit(AssignCommandNode node);

    T visit(LValueNode node);

    T visit(ConditionalOperatorNode node);
    T visit(ElseIfNode node);
    T visit(SwitchOperatorNode node);
    T visit(SwitchCaseNode node);
    T visit(WhileLoopNode node);
    T visit(ForLoopNode node);

    T visit(FunctionHandleExpression node);
    T visit(AnonymousFunctionExpression node);

    T visit(BinaryExpressionNode node);
    T visit(UnaryExpressionNode node);
    T visit(IdentifierExpressionNode node);
    T visit(NumberNode node);
    T visit(StringNode node);
    T visit(ArrayExpressionNode node);
    T visit(ArrayExpressionNode.ArrayRowNode node);
    T visit(RangeExpressionNode node);
    T visit(SliceExpressionNode node);
    T visit(IndexExpressionNode node);
    T visit(EndExpressionNode node);
    T visit(FunctionCallNode node);
    T visit(FunctionArgumentNode node);
}
