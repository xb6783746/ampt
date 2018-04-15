package ru.vsu.visitor;

import ru.vsu.ast.BasicAstNode;
import ru.vsu.ast.CodeBlockNode;
import ru.vsu.ast.ScriptNode;
import ru.vsu.ast.command.*;
import ru.vsu.codegenerator.builder.CodeBlockBuilder;
import ru.vsu.codegenerator.builder.ExpressionBuilder;
import ru.vsu.codegenerator.builder.command.IfOperatorBuilder;
import ru.vsu.codegenerator.builder.command.WhileOperatorBuilder;

public class PythonGeneratorVisitor {


    public PythonGeneratorVisitor(BasicAstNode tree){

        visit(tree, codeBlockBuilder);
    }

    private CodeBlockBuilder codeBlockBuilder = new CodeBlockBuilder();
    private ExpressionVisitor expressionVisitor = new ExpressionVisitor();

    public String generate(){

        return codeBlockBuilder.getString(0);
    }

    private void visit(ScriptNode node, CodeBlockBuilder codeBlockBuilder) {

        visit(node.getBlock(), codeBlockBuilder);
    }

    private void visit(CodeBlockNode node, CodeBlockBuilder codeBlockBuilder) {

        for(CommandNode commandNode : node.getCommandNodeList()){

            visit(commandNode, codeBlockBuilder);
        }
    }

    private void visit(AssignCommandNode node, CodeBlockBuilder codeBlockBuilder) {

        ExpressionBuilder lvalue = node.getLvalue().accept(expressionVisitor);
        ExpressionBuilder rvalue = node.getRvalue().accept(expressionVisitor);

        codeBlockBuilder.addAssignent(lvalue, rvalue);
    }

    private void visit(ConditionalOperatorNode node, CodeBlockBuilder codeBlockBuilder) {

        ExpressionBuilder condition = node.getCondition().accept(expressionVisitor);

        IfOperatorBuilder builder = codeBlockBuilder.addIf(condition);

        visit(node.getBlock(), builder.getCodeBlockBuilder());

        for(ElseIfNode elseIfNode : node.getElseIfNodeList()){

            condition = elseIfNode.getCondition().accept(expressionVisitor);

            CodeBlockBuilder elseIfBlockBuilder = builder.addElseIfBlock(condition);

            visit(elseIfNode.getBlock(), elseIfBlockBuilder);
        }

        if(node.getElseNode() != null){

            CodeBlockBuilder elseCodeBlockBuilder = builder.getElseCodeBlockBuilder();

            visit(node.getElseNode(), elseCodeBlockBuilder);
        }

    }

    private void visit(WhileLoopNode node, CodeBlockBuilder codeBlockBuilder) {

        ExpressionBuilder condition = node.getCondition().accept(expressionVisitor);

        WhileOperatorBuilder builder = codeBlockBuilder.addWhile(condition);

        visit(node.getBlock(), builder.getCodeBlockBuilder());
    }
    
    private void visit(BasicAstNode node, CodeBlockBuilder codeBlockBuilder){

        if(node instanceof ScriptNode){

            visit((ScriptNode)node, codeBlockBuilder);
        } else if(node instanceof CodeBlockNode){

            visit((CodeBlockNode)node, codeBlockBuilder);
        }  else if(node instanceof AssignCommandNode){

            visit((AssignCommandNode)node, codeBlockBuilder);
        }  else if(node instanceof ConditionalOperatorNode){

            visit((ConditionalOperatorNode)node, codeBlockBuilder);
        }  else if(node instanceof WhileLoopNode){

            visit((WhileLoopNode)node, codeBlockBuilder);
        }
    }
}
