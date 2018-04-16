package ru.vsu.ast.expression;

import ru.vsu.ast.BasicAstNode;
import ru.vsu.ast.command.CommandNode;

public abstract class ExpressionNode extends CommandNode {

    public ExpressionNode(BasicAstNode parent) {
        super(parent, true);
    }

    public ExpressionNode(BasicAstNode parent, boolean isEscaped) {
        super(parent, isEscaped);
    }
}
