package ru.vsu;

import ru.vsu.ast.BasicAstNode;
import ru.vsu.transformer.AstTransformer;
import ru.vsu.transformer.CompatibleFunctionTransformer;
import ru.vsu.transformer.FunctionTransformer;
import ru.vsu.transformer.StandardFunctionsTransformer;

import java.util.ArrayList;
import java.util.List;

public class TransformProcessor {


    public TransformProcessor() {

        transformers.add(new FunctionTransformer());
        transformers.add(new CompatibleFunctionTransformer());
        transformers.add(new StandardFunctionsTransformer());
    }

    private List<AstTransformer> transformers = new ArrayList<>();

    public BasicAstNode transform(BasicAstNode node){

        for(AstTransformer transformer: transformers){

            node = transformer.transform(node);
        }

        return node;
    }
}
