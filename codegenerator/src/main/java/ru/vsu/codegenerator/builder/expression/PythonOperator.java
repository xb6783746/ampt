package ru.vsu.codegenerator.builder.expression;

public class PythonOperator {

    public PythonOperator(String template,
                          int precedence,
                          boolean isAsFunction) {
        this.template = template;
        this.precedence = precedence;
        this.isAsFunction = isAsFunction;
    }

    private String template;
    private int precedence;
    private boolean isAsFunction;


    public String getTemplate() {
        return template;
    }

    public int getPrecedence() {
        return precedence;
    }

    public boolean isAsFunction() {
        return isAsFunction;
    }
}
