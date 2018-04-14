package ru.vsu.ast;

import org.antlr.v4.runtime.ParserRuleContext;

public abstract class BasicAstNode {

    public abstract void accept(AstTreeVisitor visitor);

}
