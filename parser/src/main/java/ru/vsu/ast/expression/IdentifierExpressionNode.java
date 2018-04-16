package ru.vsu.ast.expression;

import ru.vsu.ast.AstTreeVisitor;
import ru.vsu.ast.BasicAstNode;

public class IdentifierExpressionNode extends ExpressionNode {

    public IdentifierExpressionNode(String idName) {

        this(null, idName);
    }

    public IdentifierExpressionNode(BasicAstNode parent, String idName) {

        super(parent);
        this.idName = idName;
    }

    private String idName;

    public String getIdName() {
        return idName;
    }

    @Override
    public void replace(BasicAstNode oldNode, BasicAstNode newNode) {

    }

    @Override
    public <T> T accept(AstTreeVisitor<T> visitor) {

        return visitor.visit(this);
    }
}
