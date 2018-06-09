package ru.vsu.ast;

import ru.vsu.ast.expression.ExpressionNode;

import java.util.List;

public class LValueNode extends ExpressionNode {


    public LValueNode(boolean isUnpackExpression, List<ExpressionNode> expressions) {
        this(null, isUnpackExpression, expressions);
    }

    public LValueNode(BasicAstNode parent, boolean isUnpackExpression, List<ExpressionNode> expressions) {
        super(parent);
        this.expressions = expressions;

        expressions.forEach(x -> x.setParent(this));
    }

    private boolean isUnpackExpression;
    private List<ExpressionNode> expressions;

    public List<ExpressionNode> getExpressions() {
        return expressions;
    }

    public boolean isUnpackExpression() {
        return isUnpackExpression;
    }

    @Override
    public void replace(BasicAstNode oldNode, BasicAstNode newNode) {

        replaceInList(expressions, oldNode, newNode);
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
