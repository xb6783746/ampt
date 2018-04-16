package ru.vsu.codegenerator.builder.command;

import ru.vsu.codegenerator.builder.CodeBlockBuilder;
import ru.vsu.codegenerator.builder.CommandBuilder;
import ru.vsu.codegenerator.builder.ExpressionBuilder;

public class ForLoopBuilder implements CommandBuilder {


    public ForLoopBuilder(String id, ExpressionBuilder expression) {
        this.id = id;
        this.expression = expression;
    }

    private String id;
    private ExpressionBuilder expression;
    private CodeBlockBuilder codeBlockBuilder = new CodeBlockBuilder();

    public CodeBlockBuilder getCodeBlockBuilder() {
        return codeBlockBuilder;
    }

    @Override
    public String getString(int tabulation) {

        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < tabulation; i++){

            builder.append('\t');
        }

        builder.append("for ").append(id).append(" in ").append(expression).append(":\n")
                .append(codeBlockBuilder.getString(tabulation + 1));

        return builder.toString();
    }
}
