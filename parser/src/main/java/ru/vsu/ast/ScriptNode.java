package ru.vsu.ast;

public class ScriptNode extends BasicAstNode {

    public ScriptNode(CodeBlockNode block) {

        super(null);
        this.block = block;

        block.setParent(this);
    }

    private CodeBlockNode block;

    public CodeBlockNode getBlock() {
        return block;
    }

    @Override
    public void replace(BasicAstNode oldNode, BasicAstNode newNode) {

        if(oldNode == block){

            block = (CodeBlockNode)newNode;
        }
    }

    @Override
    public <T> T accept(AstTreeVisitor<T> visitor) {

        return visitor.visit(this);
    }
}
