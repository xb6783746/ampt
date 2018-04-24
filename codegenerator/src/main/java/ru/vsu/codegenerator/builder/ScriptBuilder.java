package ru.vsu.codegenerator.builder;

import java.util.ArrayList;
import java.util.List;

public class ScriptBuilder {


    public ScriptBuilder(List<ImportStatement> imports) {
        this.imports = imports;
    }

    private List<ImportStatement> imports;
    private CodeBlockBuilder codeBlockBuilder = new CodeBlockBuilder();

    public CodeBlockBuilder getCodeBlockBuilder() {
        return codeBlockBuilder;
    }

    public String build(){

        StringBuilder builder = new StringBuilder();

        for(ImportStatement importStatement: imports){

            builder.append(importStatement).append("\n");
        }

        builder.append("\n");

        builder.append(codeBlockBuilder.getString(0));

        return builder.toString();
    }

}
