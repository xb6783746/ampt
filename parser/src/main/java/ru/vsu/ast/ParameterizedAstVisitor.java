package ru.vsu.ast;

import ru.vsu.ast.command.*;
import ru.vsu.ast.expression.*;

public interface ParameterizedAstVisitor<T, ParamType> {

    T visit(ScriptNode node, ParamType param);

    T visit(CodeBlockNode node, ParamType param);
    T visit(FunctionNode node, ParamType param);

    T visit(AssignCommandNode node, ParamType param);

    T visit(LValueNode node, ParamType param);

    T visit(ConditionalOperatorNode node, ParamType param);
    T visit(ElseIfNode node, ParamType param);
    T visit(SwitchOperatorNode node, ParamType param);
    T visit(SwitchCaseNode node, ParamType param);
    T visit(WhileLoopNode node, ParamType param);
    T visit(ForLoopNode node, ParamType param);

    T visit(FunctionHandleExpression node, ParamType param);
    T visit(AnonymousFunctionExpression node, ParamType param);

    T visit(BinaryExpressionNode node, ParamType param);
    T visit(UnaryExpressionNode node, ParamType param);
    T visit(IdentifierExpressionNode node, ParamType param);
    T visit(NumberNode node, ParamType param);
    T visit(StringNode node, ParamType param);
    T visit(ArrayExpressionNode node, ParamType param);
    T visit(ArrayExpressionNode.ArrayRowNode node, ParamType param);
    T visit(RangeExpressionNode node, ParamType param);
    T visit(SliceExpressionNode node, ParamType param);
    T visit(IndexExpressionNode node, ParamType param);
    T visit(FunctionCallNode node, ParamType param);
    T visit(FunctionArgumentNode node, ParamType param);
}
