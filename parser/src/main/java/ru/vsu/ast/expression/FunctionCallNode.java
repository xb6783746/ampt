package ru.vsu.ast.expression;

import ru.vsu.ast.AstTreeVisitor;

import java.util.List;

public class FunctionCallNode extends ExpressionNode {


    public FunctionCallNode(String functionName, List<ExpressionNode> args) {
        this.functionName = functionName;
        this.args = args;
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
    public <T> T accept(AstTreeVisitor<T> visitor) {

        return visitor.visit(this);
    }
}
