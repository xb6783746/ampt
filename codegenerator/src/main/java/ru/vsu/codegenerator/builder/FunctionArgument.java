package ru.vsu.codegenerator.builder;

import ru.vsu.codegenerator.builder.expression.ExpressionBuilder;

public class FunctionArgument {

    public FunctionArgument(String name, ExpressionBuilder expressionBuilder) {
        this.name = name;
        this.expressionBuilder = expressionBuilder;
    }

    private String name;
    private ExpressionBuilder expressionBuilder;

    public String getName() {
        return name;
    }

    public ExpressionBuilder getExpressionBuilder() {
        return expressionBuilder;
    }

    @Override
    public String toString() {

        String expression = expressionBuilder == null?
                "" : " = " + expressionBuilder.getExpression();

        return name + expression;
    }
}
