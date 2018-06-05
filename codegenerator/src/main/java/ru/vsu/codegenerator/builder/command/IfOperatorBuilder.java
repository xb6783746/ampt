package ru.vsu.codegenerator.builder.command;

import ru.vsu.codegenerator.builder.CodeBlockBuilder;
import ru.vsu.codegenerator.builder.PythonCodeBuilder;
import ru.vsu.codegenerator.builder.expression.ExpressionBuilder;

import java.util.ArrayList;
import java.util.List;

public class IfOperatorBuilder implements PythonCodeBuilder {

    private class ElseIfBlock{

        public ElseIfBlock(ExpressionBuilder condition) {
            this.condition = condition;
        }

        public ExpressionBuilder condition;
        public CodeBlockBuilder codeBlockBuilder = new CodeBlockBuilder();
    }

    public IfOperatorBuilder(ExpressionBuilder condition) {
        this.condition = condition;
    }

    private ExpressionBuilder condition;
    private CodeBlockBuilder codeBlockBuilder = new CodeBlockBuilder();
    private List<ElseIfBlock> elseIfBuilderList = new ArrayList<>();
    private CodeBlockBuilder elseBuilder = new CodeBlockBuilder();

    public CodeBlockBuilder getCodeBlockBuilder() {
        return codeBlockBuilder;
    }

    public CodeBlockBuilder addElseIfBlock(ExpressionBuilder condition){

        ElseIfBlock builder = new ElseIfBlock(condition);

        elseIfBuilderList.add(builder);

        return builder.codeBlockBuilder;
    }

    public CodeBlockBuilder getElseCodeBlockBuilder(){

        return elseBuilder;
    }

    @Override
    public String getString(int tabulation) {

        StringBuilder tabString = new StringBuilder();
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < tabulation; i++){

            tabString.append('\t');
        }

        builder
                .append(tabString)
                .append("if ").append(condition).append(":\n")
                .append(codeBlockBuilder.getString(tabulation + 1));

        for(ElseIfBlock elseIfBlock : elseIfBuilderList){

            builder
                    .append(tabString)
                    .append("elif ").append(elseIfBlock.condition).append(":\n")
                    .append(elseIfBlock.codeBlockBuilder.getString(tabulation + 1));
        }

        if(!elseBuilder.isEmpty()) {

            builder
                    .append(tabString).append("else:\n ")
                    .append(elseBuilder.getString(tabulation + 1));
        }

        return builder.toString();
    }
}
