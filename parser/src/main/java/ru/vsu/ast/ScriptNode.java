package ru.vsu.ast;

import java.util.List;

public class ScriptNode extends BasicAstNode {

    public ScriptNode(List<BasicAstNode> nodes) {

        super(null);
        this.nodes = nodes;

        nodes.forEach(x -> x.setParent(this));
    }

    private List<BasicAstNode> nodes;

    public List<BasicAstNode> getNodes() {
        return nodes;
    }

    @Override
    public void replace(BasicAstNode oldNode, BasicAstNode newNode) {

        replaceInList(nodes, oldNode, newNode);
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {

        return visitor.visit(this);
    }
}
