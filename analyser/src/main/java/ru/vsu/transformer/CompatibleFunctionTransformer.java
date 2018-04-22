package ru.vsu.transformer;

import ru.vsu.ast.BasicAstNode;
import ru.vsu.ast.BasicAstVisitor;
import ru.vsu.ast.expression.FunctionCallNode;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class CompatibleFunctionTransformer extends BasicAstVisitor<Void> implements AstTransformer {

    private static String compatibleFunctionsFile = "CompatibleFunctions.properties";
    private static Properties compatibleFunctions;

    static {

        URL path =
                Thread.currentThread()
                        .getContextClassLoader()
                        .getResource(compatibleFunctionsFile);

        compatibleFunctions = new Properties();

        try {

            compatibleFunctions.load(new FileInputStream(path.getFile()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public BasicAstNode transform(BasicAstNode tree) {

        tree.accept(this);
        return tree;
    }

    @Override
    public Void visit(FunctionCallNode node) {

        if(compatibleFunctions.containsKey(node.getFunctionName())){

            node.setFunctionName(compatibleFunctions.getProperty(node.getFunctionName()));
        }

        return super.visit(node);
    }
}
