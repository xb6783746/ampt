package ru.vsu;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import ru.vsu.ast.BasicAstNode;
import ru.vsu.converter.AstBuilder;
import ru.vsu.parser.AmpcLexer;
import ru.vsu.parser.AmpcParser;

import java.io.IOException;

public class AstLoader {

    public BasicAstNode load(String file) throws IOException {

        AmpcLexer ampcLexer = new AmpcLexer(new ANTLRFileStream(file));
        CommonTokenStream tokens = new CommonTokenStream( ampcLexer );
        AmpcParser ampcParser = new AmpcParser(tokens);
        ParseTree tree = ampcParser.file();

        AstBuilder builder = new AstBuilder();

        return builder.buildAst(tree);
    }
}
