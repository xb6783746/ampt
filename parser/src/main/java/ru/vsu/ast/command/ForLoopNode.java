package ru.vsu.ast.command;

import ru.vsu.ast.AstTreeVisitor;
import ru.vsu.ast.BasicAstNode;
import ru.vsu.ast.CodeBlockNode;
import ru.vsu.ast.expression.ExpressionNode;
import ru.vsu.ast.expression.IdentifierExpressionNode;

public class ForLoopNode extends CommandNode {


    public ForLoopNode(boolean isEscaped,
                       IdentifierExpressionNode id,
                       ExpressionNode expressionNode,
                       CodeBlockNode block) {
        super(isEscaped);
        this.id = id;
        this.expressionNode = expressionNode;
        this.block = block;

        id.setParent(this);
        expressionNode.setParent(this);
        block.setParent(this);
    }

    private IdentifierExpressionNode id;
    private ExpressionNode expressionNode;
    private CodeBlockNode block;

    public IdentifierExpressionNode getId() {
        return id;
    }

    public ExpressionNode getExpressionNode() {
        return expressionNode;
    }

    public CodeBlockNode getBlock() {
        return block;
    }

    @Override
    public void replace(BasicAstNode oldNode, BasicAstNode newNode) {

        if(id == oldNode){

            id = (IdentifierExpressionNode) newNode;
        }

        if(expressionNode == oldNode){

            expressionNode = (ExpressionNode) newNode;
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
