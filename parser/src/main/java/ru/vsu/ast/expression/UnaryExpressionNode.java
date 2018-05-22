package ru.vsu.ast.expression;

import ru.vsu.ast.AstVisitor;
import ru.vsu.ast.BasicAstNode;
import ru.vsu.ast.UnaryOperator;

public class UnaryExpressionNode extends ExpressionNode {


    public UnaryExpressionNode(ExpressionNode expressionNode, UnaryOperator operator) {
        this(null, expressionNode, operator);
    }

    public UnaryExpressionNode(BasicAstNode parent, ExpressionNode expressionNode, UnaryOperator operator) {
        super(parent);
        this.expression = expressionNode;
        this.operator = operator;
    }

    private ExpressionNode expression;
    private UnaryOperator operator;

    public ExpressionNode getExpression() {
        return expression;
    }

    public UnaryOperator getOperator() {
        return operator;
    }

    @Override
    public void replace(BasicAstNode oldNode, BasicAstNode newNode) {

        if(expression == oldNode){

            expression = (ExpressionNode)newNode;
        }
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {

        return visitor.visit(this);
    }
}
