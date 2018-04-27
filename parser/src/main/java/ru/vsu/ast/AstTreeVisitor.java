package ru.vsu.ast;

import ru.vsu.ast.command.*;
import ru.vsu.ast.expression.*;

public interface AstTreeVisitor<T> {

    T visit(ScriptNode node);

    T visit(CodeBlockNode node);
    T visit(FunctionNode node);

    T visit(AssignCommandNode node);
    T visit(ConditionalOperatorNode node);
    T visit(ElseIfNode node);
    T visit(WhileLoopNode node);
    T visit(ForLoopNode node);

    T visit(BinaryExpressionNode node);
    T visit(UnaryExpressionNode node);
    T visit(IdentifierExpressionNode node);
    T visit(NumberNode node);
    T visit(StringNode node);
    T visit(ArrayExpressionNode node);
    T visit(ArrayExpressionNode.ArrayRowNode node);
    T visit(RangeExpressionNode node);
    T visit(SliceExpressionNode node);
    T visit(TupleExpressionNode node);
    T visit(IndexExpressionNode node);
    T visit(FunctionCallNode node);
    T visit(FunctionCallNode.FunctionArgumentNode node);
}
