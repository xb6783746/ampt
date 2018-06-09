package ru.vsu.ast.expression;

import ru.vsu.ast.AstVisitor;
import ru.vsu.ast.BasicAstNode;
import ru.vsu.ast.BinaryOperator;
import ru.vsu.ast.ParameterizedAstVisitor;

public class BinaryExpressionNode extends ExpressionNode {

    public BinaryExpressionNode(ExpressionNode left, ExpressionNode right, BinaryOperator operator) {

        this(null, left, right, operator);
    }

    public BinaryExpressionNode(BasicAstNode parent,
                                ExpressionNode left, ExpressionNode right, BinaryOperator operator) {
        super(parent);
        this.left = left;
        this.right = right;
        this.operator = operator;

        left.setParent(this);
        right.setParent(this);
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
    public void replace(BasicAstNode oldNode, BasicAstNode newNode) {

        if(left == oldNode){

            left = (ExpressionNode) newNode;
        }

        if(right == oldNode){

            right = (ExpressionNode) newNode;
        }
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
