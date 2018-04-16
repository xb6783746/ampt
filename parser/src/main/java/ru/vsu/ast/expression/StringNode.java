package ru.vsu.ast.expression;

import ru.vsu.ast.AstTreeVisitor;
import ru.vsu.ast.BasicAstNode;

public class StringNode extends ExpressionNode {


    public StringNode(String value) {
        this(null, value);
    }

    public StringNode(BasicAstNode parent, String value) {
        super(parent);
        this.value = value;
    }

    private String value;

    public String getValue() {
        return value;
    }

    @Override
    public void replace(BasicAstNode oldNode, BasicAstNode newNode) {

    }

    @Override
    public <T> T accept(AstTreeVisitor<T> visitor) {

        return visitor.visit(this);
    }
}
