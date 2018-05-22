package ru.vsu.ast.command;

import ru.vsu.ast.AstVisitor;
import ru.vsu.ast.BasicAstNode;
import ru.vsu.ast.CodeBlockNode;
import ru.vsu.ast.expression.ExpressionNode;

import java.util.List;

public class ConditionalOperatorNode extends BasicAstNode {

    public ConditionalOperatorNode(ExpressionNode condition,
                                   CodeBlockNode block,
                                   List<ElseIfNode> elseIfNodeList,
                                   CodeBlockNode elseNode) {
        this.condition = condition;
        this.block = block;
        this.elseIfNodeList = elseIfNodeList;
        this.elseNode = elseNode;

        condition.setParent(this);
        block.setParent(this);
        elseIfNodeList.forEach((x) -> x.setParent(this));
        elseNode.setParent(this);
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
    public void replace(BasicAstNode oldNode, BasicAstNode newNode) {


        if(condition == oldNode){

            condition = (ExpressionNode) newNode;
        }

        if(block == oldNode){

            block = (CodeBlockNode) newNode;
        }

        replaceInList(elseIfNodeList, oldNode, newNode);

        if(elseNode == oldNode){

            elseNode = (CodeBlockNode) newNode;
        }
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {

       return visitor.visit(this);
    }
}
