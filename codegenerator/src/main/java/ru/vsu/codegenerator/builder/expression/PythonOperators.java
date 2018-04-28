package ru.vsu.codegenerator.builder.expression;

import ru.vsu.ast.BinaryOperator;
import ru.vsu.ast.UnaryOperator;

import java.util.Hashtable;
import java.util.Map;

public class PythonOperators {

    public static class PythonOperator{

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

    private static Map<BinaryOperator, PythonOperator> operatorTable = new Hashtable<>();
    private static Map<UnaryOperator, PythonOperator> unaryOperatorTable = new Hashtable<>();

    static {


        add(BinaryOperator.And, "%s and %s", 8, false);
        add(BinaryOperator.Or, "%s or %s", 8, false);

        add(BinaryOperator.Equal, "%s == %s", 7, false);
        add(BinaryOperator.NotEqual, "%s != %s", 7, false);

        add(BinaryOperator.Greater, "%s > %s", 6, false);
        add(BinaryOperator.Less, "%s < %s", 6, false);
        add(BinaryOperator.GreaterOrEqual, "%s >= %s", 6, false);
        add(BinaryOperator.LessOrEqual, "%s <= %s", 6, false);

        add(BinaryOperator.Plus, "%s + %s", 5, false);
        add(BinaryOperator.Minus, "%s - %s", 5, false);

        add(BinaryOperator.ElemProd, "dotmul(%s, %s)", 4, false);
        add(BinaryOperator.ElemDiv, "dotdiv(%s, %s)", 4, false);
        add(BinaryOperator.Prod, "%s * %s", 4, false);
        add(BinaryOperator.Div, "%s / %s", 4, true);

        add(UnaryOperator.Plus, "+%s", 3, false);
        add(UnaryOperator.Minus, "-%s", 3, false);
        add(UnaryOperator.Not, "not %s", 3, false);

        add(BinaryOperator.Pow, "%s ** %s", 2, false);
        add(BinaryOperator.ElemPow, "dotpow(%s, %s)", 2, true);
        add(UnaryOperator.Transpose, "transpose(%s)", 2, true);
        add(UnaryOperator.ComplexConjTranspose, "ctranspose(%s)", 2, true);

        add(BinaryOperator.Index, "%s(%s)", 1, true);

    }

    public static PythonOperator getOperator(BinaryOperator op){

        return operatorTable.get(op);
    }

    public static PythonOperator getIndexOperator(boolean isGetter){

        String template = isGetter ? "%s(%s)" : "%s[%s]";

        return new PythonOperator(template, 1 , false);
    }

    public static PythonOperator getOperator(UnaryOperator op){

        return unaryOperatorTable.get(op);
    }

    private static void add(BinaryOperator operator,
                            String template,
                            int precedence,
                            boolean isAsFunction){


        PythonOperator op = new PythonOperator(
                template, precedence, isAsFunction
        );

        operatorTable.put(operator, op);
    }

    private static void add(UnaryOperator operator,
                            String template,
                            int precedence,
                            boolean isAsFunction){


        PythonOperator op = new PythonOperator(
                template, precedence, isAsFunction
        );

        unaryOperatorTable.put(operator, op);
    }
}
