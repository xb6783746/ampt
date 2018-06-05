package ru.vsu.codegenerator.builder;

public class InScriptCodeBuilder implements PythonCodeBuilder {


    private CodeBlockBuilder codeBlockBuilder = new CodeBlockBuilder();

    public CodeBlockBuilder getCodeBlockBuilder() {
        return codeBlockBuilder;
    }

    @Override
    public String getString(int tabulation) {

        return codeBlockBuilder.getString(tabulation);
    }
}
