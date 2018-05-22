package ru.vsu.ast;

import ru.vsu.ast.expression.ExpressionNode;

public class FunctionArgumentNode extends ExpressionNode {

    public FunctionArgumentNode(ExpressionNode expression) {

        this(null, expression, null);
    }

    public FunctionArgumentNode(ExpressionNode expression, String argName) {

        this(null, expression, argName);
    }

    public FunctionArgumentNode(BasicAstNode parent, ExpressionNode expression, String argName) {
        super(parent);
        this.expression = expression;
        this.argName = argName;

        if(expression != null) {

            expression.setParent(this);
        }
    }

    private ExpressionNode expression;
    private String argName;

    public ExpressionNode getExpression() {
        return expression;
    }

    public String getArgName() {
        return argName;
    }

    @Override
    public void replace(BasicAstNode oldNode, BasicAstNode newNode) {

        if(expression == oldNode){

            expression = (ExpressionNode)newNode;
        }
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {

        return visitor.visit(this);
    }
}
