package ru.vsu.codegenerator.builder;

import ru.vsu.codegenerator.builder.command.AssignCommandBuilder;
import ru.vsu.codegenerator.builder.command.ForLoopBuilder;
import ru.vsu.codegenerator.builder.command.IfOperatorBuilder;
import ru.vsu.codegenerator.builder.command.WhileOperatorBuilder;
import ru.vsu.codegenerator.builder.expression.ExpressionBuilder;

import java.util.ArrayList;
import java.util.List;

public class CodeBlockBuilder implements PythonCodeBuilder {


    private class ExpressionCodeBuilder implements PythonCodeBuilder {

        public ExpressionCodeBuilder(ExpressionBuilder expressionBuilder) {
            this.expressionBuilder = expressionBuilder;
        }

        private ExpressionBuilder expressionBuilder;

        @Override
        public String getString(int tabulation) {

            StringBuilder builder = new StringBuilder();

            for(int i = 0; i < tabulation; i++){

                builder.append('\t');
            }

            return builder.append(expressionBuilder).toString();
        }
    }

    private List<PythonCodeBuilder> lines = new ArrayList<>();

    public void addAssignment(ExpressionBuilder lvalue, ExpressionBuilder rvalue){

        lines.add(new AssignCommandBuilder(lvalue, rvalue));
    }

    public IfOperatorBuilder addIf(ExpressionBuilder condition){

        IfOperatorBuilder builder = new IfOperatorBuilder(condition);

        lines.add(builder);

        return builder;
    }

    public ForLoopBuilder addFor(String id, ExpressionBuilder expr){

        ForLoopBuilder builder = new ForLoopBuilder(id, expr);

        lines.add(builder);

        return builder;
    }

    public WhileOperatorBuilder addWhile(ExpressionBuilder condition){

        WhileOperatorBuilder builder = new WhileOperatorBuilder(condition);

        lines.add(builder);

        return builder;
    }

    public void addExpression(ExpressionBuilder builder){

        lines.add(new ExpressionCodeBuilder(builder));
    }

    public boolean isEmpty(){

        return lines.isEmpty();
    }

    @Override
    public String getString(int tabulation) {

        StringBuilder builder = new StringBuilder();

        for(PythonCodeBuilder command : lines){

            builder.append(command.getString(tabulation)).append("\n");
        }

        return builder.toString();
    }
}
