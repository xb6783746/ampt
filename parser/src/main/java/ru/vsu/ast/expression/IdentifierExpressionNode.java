package ru.vsu.ast.expression;

import ru.vsu.ast.AstTreeVisitor;
import ru.vsu.ast.BasicAstNode;

public class IdentifierExpressionNode extends ExpressionNode {

    public IdentifierExpressionNode(String idName) {
        this.idName = idName;
    }

    private String idName;

    public String getIdName() {
        return idName;
    }

    @Override
    public void accept(AstTreeVisitor visitor) {

        visitor.visit(this);
    }
}
