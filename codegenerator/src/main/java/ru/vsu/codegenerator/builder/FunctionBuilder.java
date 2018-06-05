package ru.vsu.codegenerator.builder;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionBuilder implements PythonCodeBuilder {

    private static List<String> specialArgs = new ArrayList<>();

    static {

        specialArgs.add("nargin");
        specialArgs.add("nargout");
        specialArgs.add("varargin");
    }

    private static boolean isSpecialArg(String name){

        return specialArgs.contains(name);
    }

    public FunctionBuilder(String name, List<String> outArgs, List<FunctionArgument> args) {
        this.name = name;
        this.outArgs = outArgs;
        this.args = args;

        regularArgsCount = args
                .stream()
                .filter(x -> !isSpecialArg(x.getName()))
                .count();
        isVarargs = args
                .stream()
                .anyMatch(x -> x.getName().equals("varargin"));
    }

    private String name;
    private List<String> outArgs;
    private List<FunctionArgument> args;
    private long regularArgsCount;
    private boolean isVarargs;

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
                        .map(FunctionArgument::toString)
                        .collect(Collectors.toList())
        );
        StringBuilder outArgsList = createArgsList(outArgs);

        builder.append(tabs)
                .append("@ampt_function(").append(regularArgsCount).append(", ")
                .append(isVarargs? "True": "False").append(")\n");

        builder.append(tabs).append("def ").append(name)
                .append("(").append(argsList).append("):\n")
                .append(codeBlockBuilder.getString(tabulation + 1));

        builder.append(tabs).append("\t").append("return ").append(outArgsList).append("\n");

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

}
