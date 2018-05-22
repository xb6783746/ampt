package ru.vsu.visitor;

import ru.vsu.ast.BasicAstNode;
import ru.vsu.ast.CodeBlockNode;
import ru.vsu.ast.FunctionNode;
import ru.vsu.ast.ScriptNode;
import ru.vsu.ast.command.*;
import ru.vsu.ast.expression.ExpressionNode;
import ru.vsu.ast.expression.FunctionCallNode;
import ru.vsu.codegenerator.builder.*;
import ru.vsu.codegenerator.builder.command.ForLoopBuilder;
import ru.vsu.codegenerator.builder.command.IfOperatorBuilder;
import ru.vsu.codegenerator.builder.command.WhileOperatorBuilder;
import ru.vsu.codegenerator.builder.expression.ExpressionBuilder;

import java.util.List;
import java.util.stream.Collectors;

public class PythonGeneratorVisitor {


    public PythonGeneratorVisitor(List<ImportStatement> imports, BasicAstNode tree){

        scriptBuilder = new ScriptBuilder(imports);

        visitScriptNode((ScriptNode)tree);
    }

    private ScriptBuilder scriptBuilder;
    private ExpressionVisitor expressionVisitor = new ExpressionVisitor();

    public String generate(){

        return scriptBuilder.build();
    }

    private void visitScriptNode(ScriptNode node) {

        for(BasicAstNode entry: node.getNodes()){

            if(entry instanceof CodeBlockNode){

                generateIsScriptCode((CodeBlockNode)entry);
            } else if(entry instanceof FunctionNode){

                generateFunction((FunctionNode)entry);
            }
        }
    }

    private void generateIsScriptCode(CodeBlockNode node) {

        InScriptCodeBuilder builder = new InScriptCodeBuilder();

        for(BasicAstNode commandNode : node.getCommandNodeList()){

            visit(commandNode, builder.getCodeBlockBuilder());
        }

        scriptBuilder.getBuilders().add(builder);
    }

    private void generateFunction(FunctionNode node) {


        List<FunctionArgument> args = node.getArgs()
                .stream()
                .map(x -> new FunctionArgument(
                        x.getArgName(),
                        x.getExpression() != null?
                                x.getExpression().accept(expressionVisitor) : null
                        )
                )
                .collect(Collectors.toList());

        FunctionBuilder functionBuilder = new FunctionBuilder(
                node.getName(),
                node.getOutArgs(),
                args
        );

        visit(node.getBlock(), functionBuilder.getCodeBlockBuilder());

        scriptBuilder.getBuilders().add(functionBuilder);
    }

    private void visit(CodeBlockNode node, CodeBlockBuilder codeBlockBuilder) {

        for(BasicAstNode commandNode : node.getCommandNodeList()){

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

    private void visit(ForLoopNode node, CodeBlockBuilder codeBlockBuilder) {

        String id = node.getId().getIdName();

        ExpressionBuilder expression = node.getExpressionNode().accept(expressionVisitor);

        ForLoopBuilder builder = codeBlockBuilder.addFor(id, expression);

        visit(node.getBlock(), builder.getCodeBlockBuilder());
    }

    private void visit(WhileLoopNode node, CodeBlockBuilder codeBlockBuilder) {

        ExpressionBuilder condition = node.getCondition().accept(expressionVisitor);

        WhileOperatorBuilder builder = codeBlockBuilder.addWhile(condition);

        visit(node.getBlock(), builder.getCodeBlockBuilder());
    }


    private void visit(FunctionCallNode node, CodeBlockBuilder codeBlockBuilder) {

        ExpressionBuilder expressionBuilder = node.accept(expressionVisitor);

        codeBlockBuilder.addExpression(expressionBuilder);
    }

    private void visit(ExpressionNode node, CodeBlockBuilder codeBlockBuilder) {

        ExpressionBuilder expressionBuilder = node.accept(expressionVisitor);

        codeBlockBuilder.addExpression(expressionBuilder);
    }
    
    private void visit(BasicAstNode node, CodeBlockBuilder codeBlockBuilder){

        if(node instanceof ScriptNode){

            visit((ScriptNode)node, codeBlockBuilder);
        } else if(node instanceof CodeBlockNode){

            visit((CodeBlockNode)node, codeBlockBuilder);
        } else if(node instanceof FunctionNode){

            visit((FunctionNode)node, codeBlockBuilder);
        } else if(node instanceof AssignCommandNode){

            visit((AssignCommandNode)node, codeBlockBuilder);
        }  else if(node instanceof ConditionalOperatorNode){

            visit((ConditionalOperatorNode)node, codeBlockBuilder);
        }  else if(node instanceof ForLoopNode){

            visit((ForLoopNode)node, codeBlockBuilder);
        }  else if(node instanceof WhileLoopNode){

            visit((WhileLoopNode)node, codeBlockBuilder);
        } else if(node instanceof FunctionCallNode){

            visit((FunctionCallNode)node, codeBlockBuilder);
        } else if(node instanceof ExpressionNode){

            visit((ExpressionNode)node, codeBlockBuilder);
        }
    }
}
