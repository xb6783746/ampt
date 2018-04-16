package ru.vsu.ast.command;

import ru.vsu.ast.AstTreeVisitor;
import ru.vsu.ast.BasicAstNode;
import ru.vsu.ast.CodeBlockNode;
import ru.vsu.ast.expression.ExpressionNode;

public class WhileLoopNode extends CommandNode {

    public WhileLoopNode(boolean isEscaped,
                         ExpressionNode condition,
                         CodeBlockNode block) {
        super(isEscaped);
        this.condition = condition;
        this.block = block;

        condition.setParent(this);
        block.setParent(this);
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
    public void replace(BasicAstNode oldNode, BasicAstNode newNode) {

        if(condition == oldNode){

            condition = (ExpressionNode) newNode;
        }

        if(block == oldNode){

            block = (CodeBlockNode) newNode;
        }
    }

    @Override
    public <T> T accept(AstTreeVisitor<T> visitor) {

        return visitor.visit(this);
    }
}
