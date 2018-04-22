package ru.vsu.ast.expression;

import ru.vsu.ast.AstTreeVisitor;
import ru.vsu.ast.BasicAstNode;

import java.util.List;

public class TupleExpressionNode extends ExpressionNode {


    public TupleExpressionNode(List<ExpressionNode> expressions) {
        this(null, expressions);
    }

    public TupleExpressionNode(BasicAstNode parent, List<ExpressionNode> expressions) {
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
