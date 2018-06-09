package ru.vsu.ast.expression;

import ru.vsu.ast.AstVisitor;
import ru.vsu.ast.BasicAstNode;
import ru.vsu.ast.ParameterizedAstVisitor;

import java.util.List;

public class IndexExpressionNode extends ExpressionNode {

    public IndexExpressionNode(ExpressionNode expression, List<ExpressionNode> indexes, boolean isCell) {
        this(null, expression, indexes, isCell);
    }

    public IndexExpressionNode(BasicAstNode parent,
                               ExpressionNode expression,
                               List<ExpressionNode> indexes,
                               boolean isCell) {
        super(parent);
        this.expression = expression;
        this.indexes = indexes;
        this.isCell = isCell;

        expression.setParent(this);

        indexes.forEach((x) -> x.setParent(this));
    }

    private boolean isCell;
    private ExpressionNode expression;
    private List<ExpressionNode> indexes;
    private boolean isGetter = true;

    public boolean isCell() {
        return isCell;
    }

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

    @Override
    public <T, P> T accept(ParameterizedAstVisitor<T, P> visitor, P param) {

        return visitor.visit(this, param);
    }
}
