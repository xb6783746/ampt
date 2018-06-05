package ru.vsu.codegenerator.builder.command;

import ru.vsu.codegenerator.builder.CodeBlockBuilder;
import ru.vsu.codegenerator.builder.PythonCodeBuilder;
import ru.vsu.codegenerator.builder.expression.ExpressionBuilder;

public class WhileOperatorBuilder implements PythonCodeBuilder {


    public WhileOperatorBuilder(ExpressionBuilder condition) {
        this.condition = condition;
    }

    private ExpressionBuilder condition;
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

        builder.append("while ").append(condition).append(":\n")
                .append(codeBlockBuilder.getString(tabulation + 1));

        return builder.toString();
    }
}
