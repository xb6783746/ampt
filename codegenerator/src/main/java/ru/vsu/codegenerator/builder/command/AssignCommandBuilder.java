package ru.vsu.codegenerator.builder.command;

import ru.vsu.codegenerator.builder.CommandBuilder;
import ru.vsu.codegenerator.builder.expression.ExpressionBuilder;

public class AssignCommandBuilder implements CommandBuilder {


    public AssignCommandBuilder(ExpressionBuilder lvalue, ExpressionBuilder rvalue){

        command = String.format("%s = %s", lvalue, rvalue);
    }
    private String command;

    @Override
    public String getString(int tabulation) {

        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < tabulation; i++){

            builder.append('\t');
        }
        return builder.append(command).toString();
    }
}
