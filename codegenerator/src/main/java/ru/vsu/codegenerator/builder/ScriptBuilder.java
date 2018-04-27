package ru.vsu.codegenerator.builder;

import java.util.ArrayList;
import java.util.List;

public class ScriptBuilder {


    public ScriptBuilder(List<ImportStatement> imports) {
        this.imports = imports;
    }

    private List<ImportStatement> imports;
    private List<CommandBuilder> builders = new ArrayList<>();

    public List<CommandBuilder> getBuilders() {
        return builders;
    }

    public String build(){

        StringBuilder builder = new StringBuilder();

        for(ImportStatement importStatement: imports){

            builder.append(importStatement).append("\n");
        }

        builder.append("\n");

        for(CommandBuilder entry: builders) {

            builder.append(entry.getString(0));
        }

        return builder.toString();
    }

}
