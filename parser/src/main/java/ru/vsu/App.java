package ru.vsu;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import ru.vsu.ast.BasicAstNode;
import ru.vsu.ast.ScriptNode;
import ru.vsu.converter.AstBuilder;
import ru.vsu.parser.AmpcLexer;
import ru.vsu.parser.AmpcParser;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        System.out.println( "Hello World!" );

        AmpcLexer ampcLexer = new AmpcLexer(new ANTLRFileStream("/home/vlad/IdeaProjects/ampt/parser/src/main/resources/test.txt"));
        CommonTokenStream tokens = new CommonTokenStream( ampcLexer );
        AmpcParser ampcParser = new AmpcParser(tokens);
        ParseTree tree = ampcParser.file();

        AstBuilder builder = new AstBuilder();
        BasicAstNode scriptNode = builder.buildAst(tree);

        int i = 5;
        System.out.println( "Hello World!" );
    }
}
