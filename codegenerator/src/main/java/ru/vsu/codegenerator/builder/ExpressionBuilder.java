package ru.vsu.codegenerator.builder;

import ru.vsu.ast.BinaryOperator;

import java.util.Hashtable;
import java.util.Map;

public class ExpressionBuilder {


    //TODO move to BinaryOperator enum?
    private static Map<BinaryOperator, Integer> precedenceTable = new Hashtable<>();
    static {

        precedenceTable.put(BinaryOperator.Plus, 3);
        precedenceTable.put(BinaryOperator.Minus, 3);

        precedenceTable.put(BinaryOperator.Prod, 2);
        precedenceTable.put(BinaryOperator.Div, 2);

        precedenceTable.put(BinaryOperator.Greater, 1);
        precedenceTable.put(BinaryOperator.Less, 1);
        precedenceTable.put(BinaryOperator.GreaterOrEqual, 1);
        precedenceTable.put(BinaryOperator.LessOrEqual, 1);

        precedenceTable.put(BinaryOperator.Equal, 0);
        precedenceTable.put(BinaryOperator.NotEqual, 0);
    }

    public ExpressionBuilder(String expression, int precedence) {

        this.expression = new StringBuilder(expression);
        this.precedence = precedence;
    }

    private StringBuilder expression;
    private int precedence;

    public ExpressionBuilder apply(BinaryOperator op, ExpressionBuilder expr){

        int opPrecedence = precedenceTable.get(op);

        ExpressionBuilder left = opPrecedence < precedence? this.wrap() : this;
        ExpressionBuilder right = opPrecedence < expr.precedence? expr.wrap() : expr;

        return new ExpressionBuilder(
                String.format("%s %s %s", left.expression, op.getOperator(), right.expression),
                opPrecedence
        );
    }

    private ExpressionBuilder wrap(){

        expression.insert(0, '(');
        expression.append(')');

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
