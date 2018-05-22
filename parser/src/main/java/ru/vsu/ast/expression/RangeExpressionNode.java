package ru.vsu.ast.expression;

import ru.vsu.ast.AstVisitor;
import ru.vsu.ast.BasicAstNode;

public class RangeExpressionNode extends ExpressionNode {

    public RangeExpressionNode(ExpressionNode startExpression, ExpressionNode stepExpression, ExpressionNode endExpression) {

        this(null, startExpression, stepExpression, endExpression);
    }

    public RangeExpressionNode(
            BasicAstNode parent,
            ExpressionNode startExpression, ExpressionNode stepExpression, ExpressionNode endExpression) {

        super(parent);
        this.startExpression = startExpression;
        this.stepExpression = stepExpression;
        this.endExpression = endExpression;

        if(startExpression != null){

            startExpression.setParent(this);
        }

        if(stepExpression != null){

            stepExpression.setParent(this);
        }

        if(endExpression != null){

            endExpression.setParent(this);
        }

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
    public void replace(BasicAstNode oldNode, BasicAstNode newNode) {

        if(oldNode == startExpression){

            startExpression = (ExpressionNode)newNode;
        }

        if(oldNode == stepExpression){

            stepExpression = (ExpressionNode)newNode;
        }

        if(oldNode == endExpression){

            endExpression = (ExpressionNode)newNode;
        }
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {

        return visitor.visit(this);
    }
}
