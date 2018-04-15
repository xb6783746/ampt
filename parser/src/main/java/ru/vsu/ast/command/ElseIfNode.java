package ru.vsu.ast.command;

import ru.vsu.ast.AstTreeVisitor;
import ru.vsu.ast.BasicAstNode;
import ru.vsu.ast.CodeBlockNode;
import ru.vsu.ast.expression.ExpressionNode;

public class ElseIfNode extends BasicAstNode {

    public ElseIfNode(ExpressionNode condition, CodeBlockNode block) {
        this.condition = condition;
        this.block = block;
    }

    private ExpressionNode condition;
    private CodeBlockNode block;

    public ExpressionNode getCondition() {
        return condition;
    }
    public CodeBlockNode getBlock() {
        return block;
    }

    @Override
    public <T> T accept(AstTreeVisitor<T> visitor) {

        return visitor.visit(this);
    }
}
