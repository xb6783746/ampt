package ru.vsu.ast;

import java.util.List;

public class FunctionNode extends BasicAstNode {

    public FunctionNode(String name, List<String> outArgs, List<String> args, CodeBlockNode block) {
        this.name = name;
        this.outArgs = outArgs;
        this.args = args;
        this.block = block;
    }

    private String name;
    private List<String> outArgs;
    private List<String> args;
    private CodeBlockNode block;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getOutArgs() {
        return outArgs;
    }

    public void setOutArgs(List<String> outArgs) {
        this.outArgs = outArgs;
    }

    public List<String> getArgs() {
        return args;
    }

    public void setArgs(List<String> args) {
        this.args = args;
    }

    public CodeBlockNode getBlock() {
        return block;
    }

    @Override
    public void replace(BasicAstNode oldNode, BasicAstNode newNode) {

        if(block == oldNode){

            block = (CodeBlockNode) newNode;
        }
    }

    @Override
    public <T> T accept(AstTreeVisitor<T> visitor) {

        return visitor.visit(this);
    }
}
