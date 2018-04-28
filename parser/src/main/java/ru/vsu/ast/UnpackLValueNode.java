package ru.vsu.ast;

import ru.vsu.ast.expression.ExpressionNode;

import java.util.List;

public class UnpackLValueNode extends LValueNode {


    public UnpackLValueNode(List<ExpressionNode> expressions) {

        super(expressions);

        expressions.forEach(x -> x.setParent(this));
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
