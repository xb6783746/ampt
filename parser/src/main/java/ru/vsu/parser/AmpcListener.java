// Generated from /home/vlad/IdeaProjects/ampt1/ampt/parser/grammar/Ampc.g4 by ANTLR 4.7
package ru.vsu.parser; 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AmpcParser}.
 */
public interface AmpcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AmpcParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(AmpcParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmpcParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(AmpcParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmpcParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(AmpcParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmpcParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(AmpcParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code codeNode}
	 * labeled alternative in {@link AmpcParser#scriptEntry}.
	 * @param ctx the parse tree
	 */
	void enterCodeNode(AmpcParser.CodeNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code codeNode}
	 * labeled alternative in {@link AmpcParser#scriptEntry}.
	 * @param ctx the parse tree
	 */
	void exitCodeNode(AmpcParser.CodeNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcNode}
	 * labeled alternative in {@link AmpcParser#scriptEntry}.
	 * @param ctx the parse tree
	 */
	void enterFuncNode(AmpcParser.FuncNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcNode}
	 * labeled alternative in {@link AmpcParser#scriptEntry}.
	 * @param ctx the parse tree
	 */
	void exitFuncNode(AmpcParser.FuncNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmpcParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlock(AmpcParser.CodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmpcParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlock(AmpcParser.CodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmpcParser#commSep}.
	 * @param ctx the parse tree
	 */
	void enterCommSep(AmpcParser.CommSepContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmpcParser#commSep}.
	 * @param ctx the parse tree
	 */
	void exitCommSep(AmpcParser.CommSepContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmpcParser#comOptSep}.
	 * @param ctx the parse tree
	 */
	void enterComOptSep(AmpcParser.ComOptSepContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmpcParser#comOptSep}.
	 * @param ctx the parse tree
	 */
	void exitComOptSep(AmpcParser.ComOptSepContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assingCommand}
	 * labeled alternative in {@link AmpcParser#command}.
	 * @param ctx the parse tree
	 */
	void enterAssingCommand(AmpcParser.AssingCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assingCommand}
	 * labeled alternative in {@link AmpcParser#command}.
	 * @param ctx the parse tree
	 */
	void exitAssingCommand(AmpcParser.AssingCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condOperatorCommand}
	 * labeled alternative in {@link AmpcParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCondOperatorCommand(AmpcParser.CondOperatorCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condOperatorCommand}
	 * labeled alternative in {@link AmpcParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCondOperatorCommand(AmpcParser.CondOperatorCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileLoopCommand}
	 * labeled alternative in {@link AmpcParser#command}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoopCommand(AmpcParser.WhileLoopCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileLoopCommand}
	 * labeled alternative in {@link AmpcParser#command}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoopCommand(AmpcParser.WhileLoopCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forLoopCommand}
	 * labeled alternative in {@link AmpcParser#command}.
	 * @param ctx the parse tree
	 */
	void enterForLoopCommand(AmpcParser.ForLoopCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forLoopCommand}
	 * labeled alternative in {@link AmpcParser#command}.
	 * @param ctx the parse tree
	 */
	void exitForLoopCommand(AmpcParser.ForLoopCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionCommand}
	 * labeled alternative in {@link AmpcParser#command}.
	 * @param ctx the parse tree
	 */
	void enterExpressionCommand(AmpcParser.ExpressionCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionCommand}
	 * labeled alternative in {@link AmpcParser#command}.
	 * @param ctx the parse tree
	 */
	void exitExpressionCommand(AmpcParser.ExpressionCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmpcParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(AmpcParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmpcParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(AmpcParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmpcParser#condOperator}.
	 * @param ctx the parse tree
	 */
	void enterCondOperator(AmpcParser.CondOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmpcParser#condOperator}.
	 * @param ctx the parse tree
	 */
	void exitCondOperator(AmpcParser.CondOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmpcParser#elseIfPart}.
	 * @param ctx the parse tree
	 */
	void enterElseIfPart(AmpcParser.ElseIfPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmpcParser#elseIfPart}.
	 * @param ctx the parse tree
	 */
	void exitElseIfPart(AmpcParser.ElseIfPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmpcParser#elsePart}.
	 * @param ctx the parse tree
	 */
	void enterElsePart(AmpcParser.ElsePartContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmpcParser#elsePart}.
	 * @param ctx the parse tree
	 */
	void exitElsePart(AmpcParser.ElsePartContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmpcParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(AmpcParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmpcParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(AmpcParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmpcParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(AmpcParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmpcParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(AmpcParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmpcParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(AmpcParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmpcParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(AmpcParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmpcParser#funcOut}.
	 * @param ctx the parse tree
	 */
	void enterFuncOut(AmpcParser.FuncOutContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmpcParser#funcOut}.
	 * @param ctx the parse tree
	 */
	void exitFuncOut(AmpcParser.FuncOutContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmpcParser#funcArgs}.
	 * @param ctx the parse tree
	 */
	void enterFuncArgs(AmpcParser.FuncArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmpcParser#funcArgs}.
	 * @param ctx the parse tree
	 */
	void exitFuncArgs(AmpcParser.FuncArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmpcParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(AmpcParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmpcParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(AmpcParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmpcParser#nl}.
	 * @param ctx the parse tree
	 */
	void enterNl(AmpcParser.NlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmpcParser#nl}.
	 * @param ctx the parse tree
	 */
	void exitNl(AmpcParser.NlContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmpcParser#commsep}.
	 * @param ctx the parse tree
	 */
	void enterCommsep(AmpcParser.CommsepContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmpcParser#commsep}.
	 * @param ctx the parse tree
	 */
	void exitCommsep(AmpcParser.CommsepContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link AmpcParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpr(AmpcParser.ArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link AmpcParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpr(AmpcParser.ArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link AmpcParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpr(AmpcParser.NumberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link AmpcParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpr(AmpcParser.NumberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link AmpcParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringExpr(AmpcParser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link AmpcParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringExpr(AmpcParser.StringExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identExpr}
	 * labeled alternative in {@link AmpcParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdentExpr(AmpcParser.IdentExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identExpr}
	 * labeled alternative in {@link AmpcParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdentExpr(AmpcParser.IdentExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmpcParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(AmpcParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmpcParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(AmpcParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmpcParser#arrayRow}.
	 * @param ctx the parse tree
	 */
	void enterArrayRow(AmpcParser.ArrayRowContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmpcParser#arrayRow}.
	 * @param ctx the parse tree
	 */
	void exitArrayRow(AmpcParser.ArrayRowContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmpcParser#arrayRowSeparator}.
	 * @param ctx the parse tree
	 */
	void enterArrayRowSeparator(AmpcParser.ArrayRowSeparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmpcParser#arrayRowSeparator}.
	 * @param ctx the parse tree
	 */
	void exitArrayRowSeparator(AmpcParser.ArrayRowSeparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmpcParser#arrayColumnSeparator}.
	 * @param ctx the parse tree
	 */
	void enterArrayColumnSeparator(AmpcParser.ArrayColumnSeparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmpcParser#arrayColumnSeparator}.
	 * @param ctx the parse tree
	 */
	void exitArrayColumnSeparator(AmpcParser.ArrayColumnSeparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmpcParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(AmpcParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmpcParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(AmpcParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indexExpr}
	 * labeled alternative in {@link AmpcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIndexExpr(AmpcParser.IndexExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indexExpr}
	 * labeled alternative in {@link AmpcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIndexExpr(AmpcParser.IndexExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code infixExpr}
	 * labeled alternative in {@link AmpcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInfixExpr(AmpcParser.InfixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code infixExpr}
	 * labeled alternative in {@link AmpcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInfixExpr(AmpcParser.InfixExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link AmpcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(AmpcParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link AmpcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(AmpcParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link AmpcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(AmpcParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link AmpcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(AmpcParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parensExpr}
	 * labeled alternative in {@link AmpcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParensExpr(AmpcParser.ParensExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parensExpr}
	 * labeled alternative in {@link AmpcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParensExpr(AmpcParser.ParensExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rangeExpr}
	 * labeled alternative in {@link AmpcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRangeExpr(AmpcParser.RangeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rangeExpr}
	 * labeled alternative in {@link AmpcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRangeExpr(AmpcParser.RangeExprContext ctx);
}