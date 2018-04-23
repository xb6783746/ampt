package ru.vsu;

import ru.vsu.ast.BasicAstNode;
import ru.vsu.visitor.PythonGeneratorVisitor;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Ampt {


    private AstLoader loader = new AstLoader();
    private TransformProcessor transformProcessor = new TransformProcessor();

    public void generate(List<String> files) throws IOException {

        for(String file: files){

            generateFile(file, file.concat(".py"));
        }
    }

    private void generateFile(String file, String outFile) throws IOException {

        BasicAstNode node = loader.load(file);

        node = transformProcessor.transform(node);

        PythonGeneratorVisitor generatorVisitor = new PythonGeneratorVisitor(node);

        writeToFile(outFile, generatorVisitor.generate());
    }

    private void writeToFile(String filename, String text) throws IOException {

        FileWriter writer = new FileWriter(filename);

        writer.write(text);

        writer.close();
    }
}
