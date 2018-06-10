package ru.vsu.ast.expression;

import ru.vsu.ast.AstVisitor;
import ru.vsu.ast.BasicAstNode;
import ru.vsu.ast.ParameterizedAstVisitor;

public class EndExpressionNode extends ExpressionNode {


    public EndExpressionNode() {
        this(null);
    }

    public EndExpressionNode(BasicAstNode parent) {
        super(parent);
    }

    @Override
    public void replace(BasicAstNode oldNode, BasicAstNode newNode) {

    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public <T, P> T accept(ParameterizedAstVisitor<T, P> visitor, P param) {
        return visitor.visit(this, param);
    }
}
