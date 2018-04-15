package ru.vsu.ast.expression;

import ru.vsu.ast.AstTreeVisitor;

public class RangeExpressionNode extends ExpressionNode {


    public RangeExpressionNode(ExpressionNode startExpression, ExpressionNode stepExpression, ExpressionNode endExpression) {
        this.startExpression = startExpression;
        this.stepExpression = stepExpression;
        this.endExpression = endExpression;
    }

    private ExpressionNode startExpression;
    private ExpressionNode stepExpression;
    private ExpressionNode endExpression;

    public ExpressionNode getStartExpression() {
        return startExpression;
    }

    public ExpressionNode getStepExpression() {
        return stepExpression;
    }

    public ExpressionNode getEndExpression() {
        return endExpression;
    }

    @Override
    public <T> T accept(AstTreeVisitor<T> visitor) {

        return visitor.visit(this);
    }
}
