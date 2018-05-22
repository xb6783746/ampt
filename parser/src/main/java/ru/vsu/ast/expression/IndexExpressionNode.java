package ru.vsu.ast.expression;

import ru.vsu.ast.AstVisitor;
import ru.vsu.ast.BasicAstNode;

import java.util.List;

public class IndexExpressionNode extends ExpressionNode {

    public IndexExpressionNode(ExpressionNode expression, List<ExpressionNode> indexes) {
        this(null, expression, indexes);
    }

    public IndexExpressionNode(BasicAstNode parent, ExpressionNode expression, List<ExpressionNode> indexes) {
        super(parent);
        this.expression = expression;
        this.indexes = indexes;

        expression.setParent(this);

        indexes.forEach((x) -> x.setParent(this));
    }

    private ExpressionNode expression;
    private List<ExpressionNode> indexes;
    private boolean isGetter = true;

    public ExpressionNode getExpression() {
        return expression;
    }

    public List<ExpressionNode> getIndexes() {
        return indexes;
    }

    public boolean isGetter() {
        return isGetter;
    }

    public void setGetter(boolean getter) {
        isGetter = getter;
    }

    @Override
    public void replace(BasicAstNode oldNode, BasicAstNode newNode) {

        if(expression == oldNode){

            expression = (ExpressionNode)newNode;
        }

        replaceInList(indexes, oldNode, newNode);
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {

        return visitor.visit(this);
    }
}
