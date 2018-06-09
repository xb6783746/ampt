package ru.vsu.ast;


import java.util.List;

public class CodeBlockNode extends BasicAstNode {

    public CodeBlockNode(List<BasicAstNode> commandNodeList) {

        this(null, commandNodeList);
    }

    public CodeBlockNode(BasicAstNode parent, List<BasicAstNode> commandNodeList) {

        super(parent);
        this.commandNodeList = commandNodeList;

        commandNodeList.forEach((x) -> x.setParent(this));
    }

    private List<BasicAstNode> commandNodeList;

    public List<BasicAstNode> getCommandNodeList() {
        return commandNodeList;
    }

    @Override
    public void replace(BasicAstNode oldNode, BasicAstNode newNode) {

        replaceInList(commandNodeList, oldNode, newNode);
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {

        return visitor.visit(this);
    }

    @Override
    public <T, P> T accept(ParameterizedAstVisitor<T, P> visitor, P param) {

        return visitor.visit(this, param);
    }
}
