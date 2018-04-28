package ru.vsu.ast;

import ru.vsu.ast.expression.ExpressionNode;

import java.util.List;

public class UnpackLValueNode extends ExpressionNode {


    public UnpackLValueNode(List<ExpressionNode> expressions) {
        this(null, expressions);
    }

    public UnpackLValueNode(BasicAstNode parent, List<ExpressionNode> expressions) {
        super(parent);
        this.expressions = expressions;

        expressions.forEach(x -> x.setParent(this));
    }

    private List<ExpressionNode> expressions;

    public List<ExpressionNode> getExpressions() {
        return expressions;
    }

    @Override
    public void replace(BasicAstNode oldNode, BasicAstNode newNode) {

        replaceInList(expressions, oldNode, newNode);
    }

    @Override
    public <T> T accept(AstTreeVisitor<T> visitor) {

        return visitor.visit(this);
    }
}
