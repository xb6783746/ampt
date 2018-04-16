package ru.vsu.ast.expression;

import ru.vsu.ast.BasicAstNode;

public abstract class ExpressionNode extends BasicAstNode {


    public ExpressionNode(BasicAstNode parent) {
        super(parent);
    }
}
