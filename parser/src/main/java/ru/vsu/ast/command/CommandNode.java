package ru.vsu.ast.command;

import ru.vsu.ast.BasicAstNode;

public abstract class CommandNode extends BasicAstNode {

    public CommandNode(boolean isEscaped) {
        this.isEscaped = isEscaped;
    }
    public CommandNode(BasicAstNode parent, boolean isEscaped) {
        super(parent);
        this.isEscaped = isEscaped;
    }

    private boolean isEscaped;

    public boolean isEscaped() {
        return isEscaped;
    }
}
