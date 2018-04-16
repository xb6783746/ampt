package ru.vsu.ast.expression;

import ru.vsu.ast.AstTreeVisitor;
import ru.vsu.ast.BasicAstNode;

import java.util.List;

public class FunctionCallNode extends ExpressionNode {

    public FunctionCallNode(String functionName, List<ExpressionNode> args) {

        this(null, functionName, args);
    }

    public FunctionCallNode(BasicAstNode parent, String functionName, List<ExpressionNode> args) {
        super(parent);
        this.functionName = functionName;
        this.args = args;

        args.forEach((x) -> x.setParent(this));
    }

    private String functionName;
    private List<ExpressionNode> args;

    public String getFunctionName() {
        return functionName;
    }

    public List<ExpressionNode> getArgs() {
        return args;
    }

    @Override
    public void replace(BasicAstNode oldNode, BasicAstNode newNode) {

        replaceInList(args, oldNode, newNode);
    }

    @Override
    public <T> T accept(AstTreeVisitor<T> visitor) {

        return visitor.visit(this);
    }
}
