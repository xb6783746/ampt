package ru.vsu.ast;

public class ScriptNode extends BasicAstNode {

    public ScriptNode(CodeBlockNode block) {
        this.block = block;
    }

    private CodeBlockNode block;

    public CodeBlockNode getBlock() {
        return block;
    }

    @Override
    public <T> T accept(AstTreeVisitor<T> visitor) {

        return visitor.visit(this);
    }
}
