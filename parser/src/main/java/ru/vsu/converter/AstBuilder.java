package ru.vsu.converter;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import ru.vsu.ast.*;
import ru.vsu.ast.command.*;
import ru.vsu.ast.expression.*;
import ru.vsu.parser.AmpcParser;
import ru.vsu.parser.AmpcVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AstBuilder implements AmpcVisitor<BasicAstNode> {

    public BasicAstNode buildAst(ParseTree tree){

        return visit(tree);
    }

    @Override
    public BasicAstNode visitFile(AmpcParser.FileContext ctx) {

        return ctx.script().accept(this);
    }

    @Override
    public BasicAstNode visitScript(AmpcParser.ScriptContext ctx) {

        List<BasicAstNode> nodes =
                ctx.scriptEntry()
                        .stream()
                        .map(x -> x.accept(this))
                        .collect(Collectors.toList());

        return new ScriptNode(nodes);
    }

    @Override
    public BasicAstNode visitCodeNode(AmpcParser.CodeNodeContext ctx) {

        return ctx.codeBlock().accept(this);
    }

    @Override
    public BasicAstNode visitFuncNode(AmpcParser.FuncNodeContext ctx) {

        return ctx.function().accept(this);
    }

    @Override
    public BasicAstNode visitCodeBlock(AmpcParser.CodeBlockContext ctx) {

        List<BasicAstNode> commandNodeList = new ArrayList<>();

        for(AmpcParser.CommSepContext command : ctx.commSep()){

            BasicAstNode node = (BasicAstNode)command.accept(this);

            commandNodeList.add(node);
        }

        if(ctx.comOptSep() != null) {

            commandNodeList.add((BasicAstNode)ctx.comOptSep().accept(this));
        }

        return new CodeBlockNode(commandNodeList);
    }

    @Override
    public BasicAstNode visitCommSep(AmpcParser.CommSepContext ctx) {

        return ctx.command().accept(this);
    }

    @Override
    public BasicAstNode visitComOptSep(AmpcParser.ComOptSepContext ctx) {

        return ctx.command().accept(this);
    }

    @Override
    public BasicAstNode visitAssingCommand(AmpcParser.AssingCommandContext ctx) {

        return ctx.assign().accept(this);
    }

    @Override
    public BasicAstNode visitCondOperatorCommand(AmpcParser.CondOperatorCommandContext ctx) {

        return ctx.condOperator().accept(this);
    }

    @Override
    public BasicAstNode visitWhileLoopCommand(AmpcParser.WhileLoopCommandContext ctx) {

        return ctx.whileLoop().accept(this);
    }

    @Override
    public BasicAstNode visitForLoopCommand(AmpcParser.ForLoopCommandContext ctx) {

        return ctx.forLoop().accept(this);
    }

    @Override
    public BasicAstNode visitExpressionCommand(AmpcParser.ExpressionCommandContext ctx) {

        return ctx.expression().accept(this);
    }

    @Override
    public BasicAstNode visitUnpackLValue(AmpcParser.UnpackLValueContext ctx) {

        List<ExpressionNode> lvalues = ctx.expressionList().expression()
                .stream()
                .map(x -> (ExpressionNode)x.accept(this))
                .collect(Collectors.toList());

        LValueNode lvalue = new LValueNode(true, lvalues);
        ExpressionNode rvalue = (ExpressionNode)ctx.rvalue.accept(this);

        return new AssignCommandNode(lvalue, rvalue);
    }

    @Override
    public BasicAstNode visitExprLValue(AmpcParser.ExprLValueContext ctx) {

        List<ExpressionNode> lvalues = ctx.expression()
                .stream()
                .map(x -> (ExpressionNode)x.accept(this))
                .collect(Collectors.toList());

        LValueNode lvalue = new LValueNode(false, lvalues);
        ExpressionNode rvalue = (ExpressionNode)ctx.rvalue.accept(this);

        return new AssignCommandNode(lvalue, rvalue);
    }

    @Override
    public BasicAstNode visitExprRValue(AmpcParser.ExprRValueContext ctx) {

        return (ExpressionNode)ctx.expression().accept(this);
    }

    @Override
    public BasicAstNode visitFunctionHandleRValue(AmpcParser.FunctionHandleRValueContext ctx) {

        return new FunctionHandleExpression(ctx.ID().getText());
    }

    @Override
    public BasicAstNode visitAnonymousFuncRValue(AmpcParser.AnonymousFuncRValueContext ctx) {

        ExpressionNode expressionNode = (ExpressionNode)ctx.expression().accept(this);

        List<FunctionArgumentNode> args = ctx.idList().ID()
                .stream()
                .map(x -> new FunctionArgumentNode(null, x.getText()))
                .collect(Collectors.toList());

        return new AnonymousFunctionExpression(args, expressionNode);
    }

    @Override
    public BasicAstNode visitCondOperator(AmpcParser.CondOperatorContext ctx) {

        ExpressionNode cond = (ExpressionNode)ctx.cond.accept(this);
        CodeBlockNode block = (CodeBlockNode)ctx.block.accept(this);

        List<ElseIfNode> elseIfNodes = ctx.elseIfPart()
                .stream()
                .map((x) -> (ElseIfNode)x.accept(this))
                .collect(Collectors.toList());

        CodeBlockNode elseBlock = null;

        if(ctx.elsePart() != null) {

            elseBlock = (CodeBlockNode) ctx.elsePart().accept(this);
        }

        return new ConditionalOperatorNode(cond, block, elseIfNodes, elseBlock);
    }

    @Override
    public BasicAstNode visitElseIfPart(AmpcParser.ElseIfPartContext ctx) {

        ExpressionNode cond = (ExpressionNode)ctx.cond.accept(this);
        CodeBlockNode block = (CodeBlockNode)ctx.block.accept(this);

        return new ElseIfNode(cond, block);
    }

    @Override
    public BasicAstNode visitElsePart(AmpcParser.ElsePartContext ctx) {

        return ctx.block.accept(this);
    }

    @Override
    public BasicAstNode visitWhileLoop(AmpcParser.WhileLoopContext ctx) {

        ExpressionNode cond = (ExpressionNode)ctx.cond.accept(this);
        CodeBlockNode block = (CodeBlockNode)ctx.block.accept(this);

        return new WhileLoopNode(cond, block);
    }

    @Override
    public BasicAstNode visitForLoop(AmpcParser.ForLoopContext ctx) {

        IdentifierExpressionNode id = new IdentifierExpressionNode(ctx.ID().getText());
        ExpressionNode expressionNode = (ExpressionNode)ctx.expr.accept(this);
        CodeBlockNode codeBlockNode = (CodeBlockNode)ctx.block.accept(this);

        return new ForLoopNode(id, expressionNode, codeBlockNode);
    }

    @Override
    public BasicAstNode visitFunction(AmpcParser.FunctionContext ctx) {

        CodeBlockNode block = (CodeBlockNode)ctx.block.accept(this);

        List<String> out = ctx.out.ID()
                .stream()
                .map(ParseTree::getText)
                .collect(Collectors.toList());

        List<FunctionArgumentNode> args = new ArrayList<>();

        if(ctx.args != null) {
            args = ctx.args.ID()
                    .stream()
                    .map(x -> new FunctionArgumentNode(null, x.getText()))
                    .collect(Collectors.toList());
        }

        return new FunctionNode(ctx.name.getText(), out, args, block);
    }

    @Override
    public BasicAstNode visitFuncOut(AmpcParser.FuncOutContext ctx) {
        return null;
    }

    @Override
    public BasicAstNode visitIdList(AmpcParser.IdListContext ctx) {
        return null;
    }

    @Override
    public BasicAstNode visitFuncArgs(AmpcParser.FuncArgsContext ctx) {
        return null;
    }


    @Override
    public BasicAstNode visitIdentExpr(AmpcParser.IdentExprContext ctx) {

        return new IdentifierExpressionNode(ctx.id.getText());
    }

    @Override
    public BasicAstNode visitEndExpr(AmpcParser.EndExprContext ctx) {

        return new EndExpressionNode();
    }

    @Override
    public BasicAstNode visitArray(AmpcParser.ArrayContext ctx) {

        List<ArrayExpressionNode.ArrayRowNode> rows =
                ctx.arrayRow()
                        .stream()
                        .map((x) -> (ArrayExpressionNode.ArrayRowNode)x.accept(this))
                        .collect(Collectors.toList());

        return new ArrayExpressionNode(rows, false);
    }

    @Override
    public BasicAstNode visitCell(AmpcParser.CellContext ctx) {

        List<ArrayExpressionNode.ArrayRowNode> rows =
                ctx.arrayRow()
                        .stream()
                        .map((x) -> (ArrayExpressionNode.ArrayRowNode)x.accept(this))
                        .collect(Collectors.toList());

        return new ArrayExpressionNode(rows, true);
    }

    @Override
    public BasicAstNode visitArrayRow(AmpcParser.ArrayRowContext ctx) {

        List<ExpressionNode> expressionNodes =
                ctx.expression()
                        .stream()
                        .map((x) -> (ExpressionNode)x.accept(this))
                        .collect(Collectors.toList());

        return new ArrayExpressionNode.ArrayRowNode(expressionNodes);
    }

    @Override
    public BasicAstNode visitArrayRowSeparator(AmpcParser.ArrayRowSeparatorContext ctx) {
        return null;
    }
    @Override
    public BasicAstNode visitArrayColumnSeparator(AmpcParser.ArrayColumnSeparatorContext ctx) {
        return null;
    }
    @Override
    public BasicAstNode visitExpressionList(AmpcParser.ExpressionListContext ctx) {
        return null;
    }

    @Override
    public BasicAstNode visitIndexExpr(AmpcParser.IndexExprContext ctx) {

        ExpressionNode expression = (ExpressionNode)ctx.expr.accept(this);

        List<ExpressionNode> indexes;
        if(ctx.index != null) {

            indexes =
                    ctx.index.expression()
                            .stream()
                            .map((x) -> (ExpressionNode) x.accept(this))
                            .collect(Collectors.toList());
        } else {

            indexes = new ArrayList<>();
        }

        return new IndexExpressionNode(expression, indexes, false);
    }

    @Override
    public BasicAstNode visitInfixExpr(AmpcParser.InfixExprContext ctx) {

        ExpressionNode left = (ExpressionNode)ctx.left.accept(this);
        ExpressionNode right = (ExpressionNode)ctx.right.accept(this);

        BinaryOperator operator = MatlabOperators.getBinaryOperator(ctx.op.getText());

        return new BinaryExpressionNode(left, right, operator);
    }

    @Override
    public BasicAstNode visitUnaryExpr(AmpcParser.UnaryExprContext ctx) {

        ExpressionNode expr = (ExpressionNode)ctx.expr.accept(this);

        UnaryOperator operator = MatlabOperators.getUnaryOperator(ctx.op.getText());

        return new UnaryExpressionNode(expr, operator);
    }

    @Override
    public BasicAstNode visitAtomExpr(AmpcParser.AtomExprContext ctx) {

        return ctx.atom().accept(this);
    }

    @Override
    public BasicAstNode visitNumberExpr(AmpcParser.NumberExprContext ctx) {

        return new NumberNode(ctx.number().getText());
    }

    @Override
    public BasicAstNode visitStringExpr(AmpcParser.StringExprContext ctx) {

        String str = ctx.getText()
                .replace("\'", "")
                .replace("\"", "");

        return new StringNode(str);
    }

    @Override
    public BasicAstNode visitParensExpr(AmpcParser.ParensExprContext ctx) {

        return ctx.expression().accept(this);
    }

    @Override
    public BasicAstNode visitRangeExpr(AmpcParser.RangeExprContext ctx) {

        ExpressionNode startExpression = null;
        ExpressionNode endExpression = null;
        ExpressionNode stepExpression = null;

        if(ctx.start != null){

            startExpression = (ExpressionNode)ctx.start.accept(this);
        }
        if(ctx.end != null){

            endExpression = (ExpressionNode)ctx.end.accept(this);
        }
        if(ctx.step != null){

            stepExpression = (ExpressionNode)ctx.step.accept(this);
        }

        return new RangeExpressionNode(startExpression, stepExpression, endExpression);
    }

    @Override
    public BasicAstNode visitGetCellExpr(AmpcParser.GetCellExprContext ctx) {

        ExpressionNode expression = (ExpressionNode)ctx.expr.accept(this);

        List<ExpressionNode> indexes;
        if(ctx.index != null) {

            indexes =
                    ctx.index.expression()
                            .stream()
                            .map((x) -> (ExpressionNode) x.accept(this))
                            .collect(Collectors.toList());
        } else {

            indexes = new ArrayList<>();
        }

        return new IndexExpressionNode(expression, indexes, true);
    }

    @Override
    public BasicAstNode visitNumber(AmpcParser.NumberContext ctx) {
        return null;
    }

    @Override
    public BasicAstNode visitArrayExpr(AmpcParser.ArrayExprContext ctx) {

        return ctx.arr.accept(this);
    }

    @Override
    public BasicAstNode visitCellExpr(AmpcParser.CellExprContext ctx) {

        return ctx.arr.accept(this);
    }

    @Override
    public BasicAstNode visit(ParseTree parseTree) {

        return parseTree.accept(this);
    }

    @Override
    public BasicAstNode visitNl(AmpcParser.NlContext ctx) {
        return null;
    }

    @Override
    public BasicAstNode visitCommsep(AmpcParser.CommsepContext ctx) {
        return null;
    }

    @Override
    public BasicAstNode visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public BasicAstNode visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public BasicAstNode visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
