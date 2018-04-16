package ru.vsu.transformer;

import ru.vsu.ast.BasicAstNode;

public interface AstTransformer {

    BasicAstNode transform(BasicAstNode tree);
}
