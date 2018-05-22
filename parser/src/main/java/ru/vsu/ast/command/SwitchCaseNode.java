package ru.vsu.ast.command;

import ru.vsu.ast.AstTreeVisitor;
import ru.vsu.ast.BasicAstNode;
import ru.vsu.ast.CodeBlockNode;
import ru.vsu.ast.expression.ExpressionNode;

public class SwitchCaseNode extends BasicAstNode {

    public SwitchCaseNode(BasicAstNode parent, ExpressionNode condition, CodeBlockNode codeBlockNode) {
        super(parent);
        this.condition = condition;
        this.codeBlockNode = codeBlockNode;

        condition.setParent(this);
        codeBlockNode.setParent(this);
    }

    private ExpressionNode condition;
    private CodeBlockNode codeBlockNode;

    public ExpressionNode getCondition() {
        return condition;
    }

    public CodeBlockNode getCodeBlockNode() {
        return codeBlockNode;
    }

    @Override
    public void replace(BasicAstNode oldNode, BasicAstNode newNode) {

        if(condition == oldNode){

            condition = (ExpressionNode) newNode;
        }

        if(codeBlockNode == oldNode){

            codeBlockNode = (CodeBlockNode) newNode;
        }
    }

    @Override
    public <T> T accept(AstTreeVisitor<T> visitor) {

        return visitor.visit(this);
    }
}
