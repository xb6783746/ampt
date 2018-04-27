package ru.vsu.codegenerator.builder;

import ru.vsu.codegenerator.builder.expression.ExpressionBuilder;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionBuilder implements CommandBuilder {

    public static class Argument {

        public Argument(String name, ExpressionBuilder expressionBuilder) {
            this.name = name;
            this.expressionBuilder = expressionBuilder;
        }

        private String name;
        private ExpressionBuilder expressionBuilder;

        public String getName() {
            return name;
        }

        public ExpressionBuilder getExpressionBuilder() {
            return expressionBuilder;
        }

        @Override
        public String toString() {

            String expression = expressionBuilder == null?
                    "" : " = " + expressionBuilder.getExpression();

            return name + expression;
        }
    }

    public FunctionBuilder(String name, List<String> outArgs, List<Argument> args) {
        this.name = name;
        this.outArgs = outArgs;
        this.args = args;
    }

    private String name;
    private List<String> outArgs;
    private List<Argument> args;
    private CodeBlockBuilder codeBlockBuilder = new CodeBlockBuilder();

    public CodeBlockBuilder getCodeBlockBuilder() {
        return codeBlockBuilder;
    }

    @Override
    public String getString(int tabulation) {

        StringBuilder builder = new StringBuilder();
        StringBuilder tabs = new StringBuilder();

        for(int i = 0; i < tabulation; i++){

            tabs.append('\t');
        }

        StringBuilder argsList = createArgsList(
                args.stream()
                        .map(Argument::toString)
                        .collect(Collectors.toList())
        );
        StringBuilder outArgsList = createArgsList(outArgs);

        builder.append(tabs.toString()).append("def ").append(name)
                .append("(").append(argsList).append("):\n")
                .append(codeBlockBuilder.getString(tabulation + 1));

        builder.append(tabs).append("\t").append("return (").append(outArgsList).append(")[:nargout]");

        return builder.toString();
    }
    
    private StringBuilder createArgsList(List<String> args){

        StringBuilder builder = new StringBuilder();

        if(args.size() > 0){

            builder.append(args.get(0));

            for(int i = 1; i < args.size(); i++){

                builder.append(",");
                builder.append(args.get(i));
            }
        }



        return builder;
    }

    private void appendArg(StringBuilder builder, Argument arg){

        builder.append(arg.name);

        if(arg.expressionBuilder != null){

            builder.append("=").append(arg.expressionBuilder.getExpression());
        }
    }
}
