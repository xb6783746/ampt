package ru.vsu.ast.command;

import ru.vsu.ast.AstVisitor;
import ru.vsu.ast.BasicAstNode;
import ru.vsu.ast.CodeBlockNode;
import ru.vsu.ast.expression.ExpressionNode;
import ru.vsu.ast.expression.IdentifierExpressionNode;

public class ForLoopNode extends BasicAstNode {


    public ForLoopNode(IdentifierExpressionNode id,
                       ExpressionNode expression,
                       CodeBlockNode block) {
        this.id = id;
        this.expression = expression;
        this.block = block;

        id.setParent(this);
        expression.setParent(this);
        block.setParent(this);
    }

    private IdentifierExpressionNode id;
    private ExpressionNode expression;
    private CodeBlockNode block;

    public IdentifierExpressionNode getId() {
        return id;
    }

    public ExpressionNode getExpression() {
        return expression;
    }

    public CodeBlockNode getBlock() {
        return block;
    }

    @Override
    public void replace(BasicAstNode oldNode, BasicAstNode newNode) {

        if(id == oldNode){

            id = (IdentifierExpressionNode) newNode;
        }

        if(expression == oldNode){

            expression = (ExpressionNode) newNode;
        }

        if(block == oldNode){

            block = (CodeBlockNode) newNode;
        }
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {

        return visitor.visit(this);
    }
}
