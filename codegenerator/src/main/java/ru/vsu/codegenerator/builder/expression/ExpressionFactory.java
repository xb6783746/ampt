package ru.vsu.codegenerator.builder.expression;

import ru.vsu.ast.BinaryOperator;

import java.util.List;

public class ExpressionFactory {

    public static class ExpressionArg{


        public ExpressionArg(ExpressionBuilder expression, String expressionName) {
            this.expression = expression;
            this.expressionName = expressionName;
        }

        private ExpressionBuilder expression;
        private String expressionName;

        public ExpressionBuilder getExpression() {
            return expression;
        }

        public String getExpressionName() {
            return expressionName;
        }
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

        String template = rows.size() > 1? "mr([%s])" : "mr(%s)";

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

            str = String.format("np.arange(%s, %s, %s)", start, end, step);
        } else {

            str = String.format("np.arange(%s, %s)", start, end);
        }

        return new ExpressionBuilder(str, 0);
    }

    public static ExpressionBuilder createTuple(List<ExpressionBuilder> expressions){

        StringBuilder elements = makeExpressionList(expressions);

        return new ExpressionBuilder(
                String.format("(%s)", elements),
                0
        );
    }

    public static ExpressionBuilder createFunction(String funcName, List<ExpressionBuilder> args){

        StringBuilder builder = makeExpressionList(args);

        return new ExpressionBuilder(
                String.format("%s(%s)", funcName, builder),
                0
        );
    }

    public static ExpressionBuilder createCall(ExpressionBuilder obj,
                                               String funcName,
                                               List<ExpressionArg> args){

        StringBuilder builder = makeArgsList(args);

        return new ExpressionBuilder(
                String.format("%s.%s(%s)", obj, funcName, builder),
                0
        );
    }

    public static ExpressionBuilder createNumber(String value){

        return new ExpressionBuilder(
                String.format("%s", value),
                0
        );
    }

    public static ExpressionBuilder createVariable(String value){

        return new ExpressionBuilder(
                String.format("%s", value),
                0
        );
    }

    public static ExpressionBuilder createString(String value){

        return new ExpressionBuilder(
                String.format("'%s'", value),
                0
        );
    }

    public static StringBuilder makeArgsList(List<ExpressionArg> args){

        StringBuilder builder = new StringBuilder();

        if(args.size() > 0) {

            appendArg(builder, args.get(0));

            for (int i = 1; i < args.size(); i++) {

                builder.append(", ");

                appendArg(builder, args.get(i));
            }

        }

        return builder;
    }

    private static void appendArg(StringBuilder builder, ExpressionArg arg){

        if(arg.getExpressionName() != null){

            builder.append(arg.getExpressionName()).append("=");
        }

        builder.append(arg.getExpression());
    }

    public static StringBuilder makeExpressionList(List<ExpressionBuilder> indexes){

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
