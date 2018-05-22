package ru.vsu.ast.expression;

import ru.vsu.ast.AstVisitor;
import ru.vsu.ast.BasicAstNode;

public class NumberNode extends ExpressionNode {

    public NumberNode(String number) {

        this(null, number);
    }

    public NumberNode(BasicAstNode parent, String number) {

        super(parent);
        this.number = number;
    }

    private String number;

    public String getNumber() {
        return number;
    }

    @Override
    public void replace(BasicAstNode oldNode, BasicAstNode newNode) {


    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {

        return visitor.visit(this);
    }
}
