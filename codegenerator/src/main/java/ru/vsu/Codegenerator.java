package ru.vsu;

import ru.vsu.ast.BasicAstNode;
import ru.vsu.codegenerator.builder.ImportStatement;
import ru.vsu.config.entity.FunctionsConfiguration;
import ru.vsu.visitor.PythonGeneratorVisitor;

import java.util.ArrayList;
import java.util.List;

public class Codegenerator {


    public Codegenerator(FunctionsConfiguration functionConfiguration){

        imports = createImports(functionConfiguration);
    }

    private List<ImportStatement> imports;

    public String generate(BasicAstNode node){

        PythonGeneratorVisitor generatorVisitor =
                new PythonGeneratorVisitor(imports, node);

        return generatorVisitor.generate();
    }

    private List<ImportStatement> createImports(FunctionsConfiguration funcConf){

        List<ImportStatement> imports = new ArrayList<>();

        imports.add(new ImportStatement("numpy", funcConf.getNumpyName()));
        imports.add(new ImportStatement("*", "ampt.core", null));
        imports.add(new ImportStatement("ampt.amptlib", funcConf.getApmtlibName()));

        return imports;
    }
}
