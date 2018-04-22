package ru.vsu.codegenerator.builder.expression;

import ru.vsu.ast.BinaryOperator;

import java.util.List;

public class ExpressionBuilder {



    ExpressionBuilder(String expression, int precedence) {

        this(expression, precedence, false);
    }

    ExpressionBuilder(String expression, int precedence, boolean isWrapped) {

        this.expression = new StringBuilder(expression);
        this.precedence = precedence;
        this.isWrapped = isWrapped;
    }

    private StringBuilder expression;
    private boolean isWrapped;
    private int precedence;

    public ExpressionBuilder apply(BinaryOperator op, ExpressionBuilder expr){

        PythonOperators.PythonOperator pOp = PythonOperators.getOperator(op);

        ExpressionBuilder left =
                pOp.getPrecedence() < precedence && !pOp.isAsFunction()?
                        this.wrap() : this;

        ExpressionBuilder right =
                pOp.getPrecedence() < expr.precedence && !pOp.isAsFunction()?
                        expr.wrap() : expr;

        return new ExpressionBuilder(
                String.format(pOp.getTemplate(), left.expression, right.expression),
                pOp.getPrecedence()
        );
    }
    public ExpressionBuilder index(List<ExpressionBuilder> indexes){

        PythonOperators.PythonOperator pOp = PythonOperators.getOperator(BinaryOperator.Index);

        ExpressionBuilder left =
                pOp.getPrecedence() < precedence?
                        this.wrap() : this;

        StringBuilder builder = ExpressionFactory.makeExpressionList(indexes);

        return new ExpressionBuilder(
                String.format(pOp.getTemplate(), left, builder),
                0
        );
    }

    private ExpressionBuilder wrap(){

        if(!isWrapped) {
            isWrapped = true;

            expression.insert(0, '(');
            expression.append(')');
        }
        return this;
    }

    public String getExpression() {
        return expression.toString();
    }

    public int getPrecedence() {
        return precedence;
    }

    @Override
    public String toString() {

        return expression.toString();
    }

}
