package ru.vsu.codegenerator.builder.expression;

import ru.vsu.ast.BinaryOperator;

import java.util.Hashtable;
import java.util.Map;

public class PythonOperators {

    public static class PythonOperator{

        public PythonOperator(BinaryOperator operator,
                              String template,
                              int precedence,
                              boolean isAsFunction) {
            this.operator = operator;
            this.template = template;
            this.precedence = precedence;
            this.isAsFunction = isAsFunction;
        }

        private BinaryOperator operator;
        private String template;
        private int precedence;
        private boolean isAsFunction;

        public BinaryOperator getOperator() {
            return operator;
        }

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

    private static Map<BinaryOperator, PythonOperator> operatorTable = new Hashtable<>();

    static {


        add(BinaryOperator.And, "%s and %s", -1, false);
        add(BinaryOperator.Or, "%s or %s", -1, false);

        add(BinaryOperator.Plus, "%s + %s", 4, false);
        add(BinaryOperator.Minus, "%s - %s", 4, false);

        add(BinaryOperator.ElemProd, "dotmul(%s, %s)", 3, false);
        add(BinaryOperator.ElemDiv, "dotdiv(%s, %s)", 3, false);
        add(BinaryOperator.Prod, "%s * %s", 3, false);
        add(BinaryOperator.Div, "%s / %s", 3, true);

        add(BinaryOperator.Pow, "%s ** %s", 2, true);
        add(BinaryOperator.ElemPow, "dotpow(%s, %s)", 2, false);

        add(BinaryOperator.Greater, "%s > %s", 1, false);
        add(BinaryOperator.Less, "%s < %s", 1, false);
        add(BinaryOperator.GreaterOrEqual, "%s >= %s", 1, false);
        add(BinaryOperator.LessOrEqual, "%s <= %s", 1, false);

        add(BinaryOperator.Equal, "%s == %s", 0, false);
        add(BinaryOperator.NotEqual, "%s != %s", 1, false);

    }

    public static PythonOperator getOperator(BinaryOperator op){

        return operatorTable.get(op);
    }

    private static void add(BinaryOperator operator,
                            String template,
                            int precedence,
                            boolean isAsFunction){


        PythonOperator op = new PythonOperator(
                operator, template, precedence, isAsFunction
        );

        operatorTable.put(operator, op);
    }
}
