package ru.vsu.ast.expression;

import ru.vsu.ast.AstVisitor;
import ru.vsu.ast.BasicAstNode;

public class FunctionHandleExpression extends ExpressionNode {


    public FunctionHandleExpression(String functionName) {
        this(null, functionName);
    }

    public FunctionHandleExpression(BasicAstNode parent, String functionName) {
        super(parent);
        this.functionName = functionName;
    }

    private String functionName;

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    @Override
    public void replace(BasicAstNode oldNode, BasicAstNode newNode) {

    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {

        return visitor.visit(this);
    }
}
