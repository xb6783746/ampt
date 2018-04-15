package ru.vsu.ast.expression;

import ru.vsu.ast.AstTreeVisitor;
import ru.vsu.ast.BasicAstNode;

public class NumberNode extends ExpressionNode {

    public NumberNode(String number) {
        this.number = number;
    }

    private String number;

    public String getNumber() {
        return number;
    }

    @Override
    public <T> T accept(AstTreeVisitor<T> visitor) {

        return visitor.visit(this);
    }
}
