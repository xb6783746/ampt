package ru.vsu.ast.command;

import ru.vsu.ast.AstVisitor;
import ru.vsu.ast.BasicAstNode;

import java.util.List;

public class SwitchOperatorNode extends BasicAstNode {


    public SwitchOperatorNode(BasicAstNode parent, List<SwitchCaseNode> cases) {
        super(parent);
        this.cases = cases;

        cases.forEach(x -> x.setParent(this));
    }

    private List<SwitchCaseNode> cases;

    public List<SwitchCaseNode> getCases() {
        return cases;
    }

    @Override
    public void replace(BasicAstNode oldNode, BasicAstNode newNode) {

        replaceInList(cases, oldNode, newNode);
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {

        return visitor.visit(this);
    }
}
