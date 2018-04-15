package ru.vsu.ast.command;

import ru.vsu.ast.AstTreeVisitor;
import ru.vsu.ast.BasicAstNode;
import ru.vsu.ast.CodeBlockNode;
import ru.vsu.ast.expression.ExpressionNode;

import java.util.List;

public class ConditionalOperatorNode extends CommandNode {

    public ConditionalOperatorNode(boolean isEscaped,
                                   ExpressionNode condition,
                                   CodeBlockNode block,
                                   List<ElseIfNode> elseIfNodeList,
                                   CodeBlockNode elseNode) {
        super(isEscaped);
        this.condition = condition;
        this.block = block;
        this.elseIfNodeList = elseIfNodeList;
        this.elseNode = elseNode;
    }

    private ExpressionNode condition;
    private CodeBlockNode block;

    private List<ElseIfNode> elseIfNodeList;
    private CodeBlockNode elseNode;

    public ExpressionNode getCondition() {
        return condition;
    }
    public CodeBlockNode getBlock() {
        return block;
    }
    public List<ElseIfNode> getElseIfNodeList() {
        return elseIfNodeList;
    }
    public CodeBlockNode getElseNode() {
        return elseNode;
    }

    @Override
    public <T> T accept(AstTreeVisitor<T> visitor) {

       return visitor.visit(this);
    }
}
