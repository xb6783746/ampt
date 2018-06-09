package ru.vsu.ast;

import java.util.List;

public class FunctionNode extends BasicAstNode {

    public FunctionNode(String name, List<String> outArgs, List<FunctionArgumentNode> args, CodeBlockNode block) {
        this.name = name;
        this.outArgs = outArgs;
        this.args = args;
        this.block = block;
    }

    private String name;
    private List<String> outArgs;
    private List<FunctionArgumentNode> args;
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

    public List<FunctionArgumentNode> getArgs() {
        return args;
    }

    public void setArgs(List<FunctionArgumentNode> args) {
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

        replaceInList(args, oldNode, newNode);
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
