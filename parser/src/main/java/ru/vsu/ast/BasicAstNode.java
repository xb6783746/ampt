package ru.vsu.ast;

import java.util.List;

public abstract class BasicAstNode {

    public BasicAstNode() {

    }

    public BasicAstNode(BasicAstNode parent) {
        this.parent = parent;
    }

    protected BasicAstNode parent;

    public BasicAstNode getParent() {
        return parent;
    }

    public void setParent(BasicAstNode parent) {
        this.parent = parent;
    }

    public abstract void replace(BasicAstNode oldNode, BasicAstNode newNode);
    public abstract <T> T accept(AstVisitor<T> visitor);

    protected <T extends BasicAstNode> void replaceInList(
            List<T> list, BasicAstNode oldNode, BasicAstNode newNode){

        for(int i = 0; i < list.size(); i++){

            if(list.get(i) == oldNode){

                list.set(i, (T)newNode);
            }
        }
    }

}
