package ru.vsu.codegenerator.builder.expression;

import ru.vsu.ast.BinaryOperator;

import java.util.List;

public class ExpressionFactory {

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
