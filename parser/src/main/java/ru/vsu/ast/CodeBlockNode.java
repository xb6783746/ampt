package ru.vsu.ast;

import ru.vsu.ast.command.CommandNode;

import java.util.List;

public class CodeBlockNode extends BasicAstNode {

    public CodeBlockNode(List<CommandNode> commandNodeList) {
        this.commandNodeList = commandNodeList;
    }

    private List<CommandNode> commandNodeList;

    public List<CommandNode> getCommandNodeList() {
        return commandNodeList;
    }

    @Override
    public void accept(AstTreeVisitor visitor) {

        visitor.visit(this);
    }
}
