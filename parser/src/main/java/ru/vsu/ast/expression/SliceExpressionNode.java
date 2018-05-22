package ru.vsu.ast.expression;

import ru.vsu.ast.AstVisitor;
import ru.vsu.ast.BasicAstNode;

public class SliceExpressionNode extends RangeExpressionNode {


    public SliceExpressionNode(ExpressionNode startExpression, ExpressionNode stepExpression, ExpressionNode endExpression) {
        super(startExpression, stepExpression, endExpression);
    }

    public SliceExpressionNode(BasicAstNode parent, ExpressionNode startExpression, ExpressionNode stepExpression, ExpressionNode endExpression) {
        super(parent, startExpression, stepExpression, endExpression);
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {

        return visitor.visit(this);
    }
}
