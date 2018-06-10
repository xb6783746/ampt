// Generated from /home/vlad/IdeaProjects/ampt1/ampt/parser/grammar/Ampc.g4 by ANTLR 4.7
package ru.vsu.parser; 
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AmpcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AmpcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AmpcParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(AmpcParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmpcParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(AmpcParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code codeNode}
	 * labeled alternative in {@link AmpcParser#scriptEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeNode(AmpcParser.CodeNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcNode}
	 * labeled alternative in {@link AmpcParser#scriptEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncNode(AmpcParser.FuncNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmpcParser#codeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeBlock(AmpcParser.CodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmpcParser#commSep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommSep(AmpcParser.CommSepContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmpcParser#comOptSep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComOptSep(AmpcParser.ComOptSepContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assingCommand}
	 * labeled alternative in {@link AmpcParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssingCommand(AmpcParser.AssingCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condOperatorCommand}
	 * labeled alternative in {@link AmpcParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondOperatorCommand(AmpcParser.CondOperatorCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileLoopCommand}
	 * labeled alternative in {@link AmpcParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoopCommand(AmpcParser.WhileLoopCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forLoopCommand}
	 * labeled alternative in {@link AmpcParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoopCommand(AmpcParser.ForLoopCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionCommand}
	 * labeled alternative in {@link AmpcParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionCommand(AmpcParser.ExpressionCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmpcParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(AmpcParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unpackLValue}
	 * labeled alternative in {@link AmpcParser#lValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpackLValue(AmpcParser.UnpackLValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprLValue}
	 * labeled alternative in {@link AmpcParser#lValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLValue(AmpcParser.ExprLValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprRValue}
	 * labeled alternative in {@link AmpcParser#rValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRValue(AmpcParser.ExprRValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionHandleRValue}
	 * labeled alternative in {@link AmpcParser#rValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionHandleRValue(AmpcParser.FunctionHandleRValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code anonymousFuncRValue}
	 * labeled alternative in {@link AmpcParser#rValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousFuncRValue(AmpcParser.AnonymousFuncRValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmpcParser#condOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondOperator(AmpcParser.CondOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmpcParser#elseIfPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfPart(AmpcParser.ElseIfPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmpcParser#elsePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsePart(AmpcParser.ElsePartContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmpcParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(AmpcParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmpcParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(AmpcParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmpcParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(AmpcParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmpcParser#funcOut}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncOut(AmpcParser.FuncOutContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmpcParser#idList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdList(AmpcParser.IdListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmpcParser#funcArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncArgs(AmpcParser.FuncArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmpcParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(AmpcParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmpcParser#nl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNl(AmpcParser.NlContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmpcParser#commsep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommsep(AmpcParser.CommsepContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link AmpcParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpr(AmpcParser.ArrayExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cellExpr}
	 * labeled alternative in {@link AmpcParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCellExpr(AmpcParser.CellExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link AmpcParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpr(AmpcParser.NumberExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link AmpcParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpr(AmpcParser.StringExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identExpr}
	 * labeled alternative in {@link AmpcParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentExpr(AmpcParser.IdentExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code endExpr}
	 * labeled alternative in {@link AmpcParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndExpr(AmpcParser.EndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmpcParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(AmpcParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmpcParser#cell}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCell(AmpcParser.CellContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmpcParser#arrayRow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayRow(AmpcParser.ArrayRowContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmpcParser#arrayRowSeparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayRowSeparator(AmpcParser.ArrayRowSeparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmpcParser#arrayColumnSeparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayColumnSeparator(AmpcParser.ArrayColumnSeparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmpcParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(AmpcParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code indexExpr}
	 * labeled alternative in {@link AmpcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexExpr(AmpcParser.IndexExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code infixExpr}
	 * labeled alternative in {@link AmpcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixExpr(AmpcParser.InfixExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link AmpcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(AmpcParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link AmpcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(AmpcParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parensExpr}
	 * labeled alternative in {@link AmpcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensExpr(AmpcParser.ParensExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rangeExpr}
	 * labeled alternative in {@link AmpcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeExpr(AmpcParser.RangeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getCellExpr}
	 * labeled alternative in {@link AmpcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetCellExpr(AmpcParser.GetCellExprContext ctx);
}