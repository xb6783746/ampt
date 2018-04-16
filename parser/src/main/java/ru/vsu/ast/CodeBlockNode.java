package ru.vsu.ast;

import ru.vsu.ast.command.CommandNode;

import java.util.List;

public class CodeBlockNode extends BasicAstNode {

    public CodeBlockNode(List<CommandNode> commandNodeList) {

        this(null, commandNodeList);
    }

    public CodeBlockNode(BasicAstNode parent, List<CommandNode> commandNodeList) {

        super(parent);
        this.commandNodeList = commandNodeList;

        commandNodeList.forEach((x) -> x.setParent(this));
    }

    private List<CommandNode> commandNodeList;

    public List<CommandNode> getCommandNodeList() {
        return commandNodeList;
    }

    @Override
    public void replace(BasicAstNode oldNode, BasicAstNode newNode) {

        replaceInList(commandNodeList, oldNode, newNode);
    }

    @Override
    public <T> T accept(AstTreeVisitor<T> visitor) {

        return visitor.visit(this);
    }
}
