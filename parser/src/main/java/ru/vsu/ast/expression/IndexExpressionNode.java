package ru.vsu.ast.expression;

import ru.vsu.ast.AstTreeVisitor;

import java.util.List;

public class IndexExpressionNode extends ExpressionNode {


    public IndexExpressionNode(ExpressionNode expression, List<ExpressionNode> indexes) {
        this.expression = expression;
        this.indexes = indexes;
    }

    private ExpressionNode expression;
    private List<ExpressionNode> indexes;

    public ExpressionNode getExpression() {
        return expression;
    }

    public List<ExpressionNode> getIndexes() {
        return indexes;
    }

    @Override
    public <T> T accept(AstTreeVisitor<T> visitor) {

        return visitor.visit(this);
    }
}
