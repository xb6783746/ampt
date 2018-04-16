package ru.vsu.codegenerator.builder;

import ru.vsu.ast.BinaryOperator;

import java.util.Hashtable;
import java.util.List;
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


    public static ExpressionBuilder createRow(List<ExpressionBuilder> expressions){

        StringBuilder builder = new StringBuilder("[");

        if(expressions.size() > 0) {

            builder.append(expressions.get(0).getExpression());

            for (int i = 1; i < expressions.size(); i++) {

                builder.append(", ").append(expressions.get(i).getExpression());
            }
        }

        builder.append(']');

        return new ExpressionBuilder(builder.toString(), 0);
    }

    public static ExpressionBuilder createArray(List<ExpressionBuilder> rows){

        StringBuilder builder = new StringBuilder();

        if(rows.size() > 0) {

            builder.append(rows.get(0).getExpression());

            for (int i = 1; i < rows.size(); i++) {

                builder.append(", ").append(rows.get(i).getExpression());
            }
        }

        String template = rows.size() > 1? "np.array([%s])" : "np.array(%s)";

        return new ExpressionBuilder(
                String.format(template, builder), 0
        );
    }

    public static ExpressionBuilder createRange(ExpressionBuilder start,
                                                ExpressionBuilder step,
                                                ExpressionBuilder end){

        end = end.apply(BinaryOperator.Plus, new ExpressionBuilder("1", 0));
        String str;

        if(step != null){

            str = String.format("range(%s, %s, %s)", start, end, step);
        } else {

            str = String.format("range(%s, %s)", start, end);
        }

        return new ExpressionBuilder(str, 0);
    }

    public static ExpressionBuilder createFunction(String funcName, List<ExpressionBuilder> args){

        StringBuilder builder = makeExpressionList(args);

        return new ExpressionBuilder(
                String.format("%s(%s)", funcName, builder),
                0
        );
    }

    public ExpressionBuilder(String expression, int precedence) {

        this(expression, precedence, false);
    }

    public ExpressionBuilder(String expression, int precedence, boolean isWrapped) {

        this.expression = new StringBuilder(expression);
        this.precedence = precedence;
        this.isWrapped = isWrapped;
    }

    private StringBuilder expression;
    private boolean isWrapped;
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
    public ExpressionBuilder index(List<ExpressionBuilder> indexes){

        wrap();

        StringBuilder builder = makeExpressionList(indexes);

        return new ExpressionBuilder(
                String.format("%s[%s]", expression, builder),
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

    private static StringBuilder makeExpressionList(List<ExpressionBuilder> indexes){

        StringBuilder builder = new StringBuilder();

        if(indexes.size() > 0) {

            builder.append(indexes.get(0).getExpression());

            for (int i = 1; i < indexes.size(); i++) {

                builder.append(", ").append(indexes.get(i).getExpression());
            }

        }

        return builder;
    }
}
