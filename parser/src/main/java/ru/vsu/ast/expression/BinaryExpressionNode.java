package ru.vsu.ast.expression;

import ru.vsu.ast.AstTreeVisitor;
import ru.vsu.ast.BinaryOperator;

public class BinaryExpressionNode extends ExpressionNode {

    public BinaryExpressionNode(ExpressionNode left, ExpressionNode right, BinaryOperator operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    private ExpressionNode left;
    private ExpressionNode right;
    private BinaryOperator operator;

    public ExpressionNode getLeft() {
        return left;
    }
    public ExpressionNode getRight() {
        return right;
    }
    public BinaryOperator getOperator() {
        return operator;
    }

    @Override
    public <T> T accept(AstTreeVisitor<T> visitor) {

        return visitor.visit(this);
    }
}
