package ru.vsu.ast;

import org.antlr.v4.runtime.ParserRuleContext;

public abstract class BasicAstNode {

    public abstract <T> T accept(AstTreeVisitor<T> visitor);

}
