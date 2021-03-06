package ru.vsu;

import ru.vsu.ast.BasicAstNode;
import ru.vsu.config.entity.Configuration;
import ru.vsu.helpers.FunctionNameResolver;
import ru.vsu.transformer.AstTransformer;
import ru.vsu.transformer.BasicAstTransformer;
import ru.vsu.transformer.StandardFunctionTransformer;

import java.util.ArrayList;
import java.util.List;

public class TransformProcessor {


    public TransformProcessor(Configuration configuration) {


        FunctionNameResolver resolver = new FunctionNameResolver(configuration);

        transformers.add(new BasicAstTransformer());
        transformers.add(new StandardFunctionTransformer(resolver));
    }

    private List<AstTransformer> transformers = new ArrayList<>();

    public BasicAstNode transform(BasicAstNode node){

        for(AstTransformer transformer: transformers){

            node = transformer.transform(node);
        }

        return node;
    }
}
