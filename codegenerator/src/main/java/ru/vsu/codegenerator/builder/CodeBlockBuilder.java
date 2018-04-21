package ru.vsu.codegenerator.builder;

import ru.vsu.codegenerator.builder.command.AssignCommandBuilder;
import ru.vsu.codegenerator.builder.command.ForLoopBuilder;
import ru.vsu.codegenerator.builder.command.IfOperatorBuilder;
import ru.vsu.codegenerator.builder.command.WhileOperatorBuilder;
import ru.vsu.codegenerator.builder.expression.ExpressionBuilder;

import java.util.ArrayList;
import java.util.List;

public class CodeBlockBuilder implements CommandBuilder {


    private class ExpressionCommandBuilder implements CommandBuilder {

        public ExpressionCommandBuilder(ExpressionBuilder expressionBuilder) {
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

    private List<CommandBuilder> lines = new ArrayList<>();

    public void addAssignent(ExpressionBuilder lvalue, ExpressionBuilder rvalue){

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

        lines.add(new ExpressionCommandBuilder(builder));
    }

    @Override
    public String getString(int tabulation) {

        StringBuilder builder = new StringBuilder();

        for(CommandBuilder command : lines){

            builder.append(command.getString(tabulation)).append("\n");
        }

        return builder.toString();
    }
}
