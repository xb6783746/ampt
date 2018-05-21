package ru.vsu;

import ru.vsu.ast.BasicAstNode;
import ru.vsu.config.ConfigLoader;
import ru.vsu.config.entity.Configuration;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Ampt {


    private static String functionConfig = "./FunctionConfiguration.json";

    public Ampt() throws IOException {

        ConfigLoader configLoader = new ConfigLoader();

        String path = Ampt.class.getClassLoader().getResource(functionConfig).getFile();
        File functionConfFile = new File(path);

        configuration =
                configLoader.getConfiguration(functionConfFile);

        transformProcessor = new TransformProcessor(configuration);

        codegenerator = new Codegenerator(configuration);
    }

    private Configuration configuration;
    private AstLoader loader = new AstLoader();
    private TransformProcessor transformProcessor;
    private Codegenerator codegenerator;

    public void generate(List<String> files, String outDir) throws IOException {

        for(String str: files){

            File file = new File(str);

            String outPath = outDir.isEmpty()?
                    file.getAbsolutePath().concat(".py"):
                    outDir + file.getName().concat(".py");

            generateFile(str, outPath);
        }
    }

    private void generateFile(String file, String outFile) throws IOException {

        BasicAstNode node = loader.load(file);

        node = transformProcessor.transform(node);

        writeToFile(outFile, codegenerator.generate(node));
    }

    private void writeToFile(String filename, String text) throws IOException {

        FileWriter writer = new FileWriter(filename);

        writer.write(text);

        writer.close();
    }
}
