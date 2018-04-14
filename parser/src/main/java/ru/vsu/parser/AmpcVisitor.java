// Generated from /home/vlad/IdeaProjects/ampt/parser/grammar/Ampc.g4 by ANTLR 4.7
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
	 * Visit a parse tree produced by the {@code loopOperatorCommand}
	 * labeled alternative in {@link AmpcParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopOperatorCommand(AmpcParser.LoopOperatorCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmpcParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(AmpcParser.AssignContext ctx);
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
	 * Visit a parse tree produced by {@link AmpcParser#loopOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopOperator(AmpcParser.LoopOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identExpr}
	 * labeled alternative in {@link AmpcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentExpr(AmpcParser.IdentExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code infixExpr}
	 * labeled alternative in {@link AmpcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixExpr(AmpcParser.InfixExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link AmpcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpr(AmpcParser.NumberExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parensExpr}
	 * labeled alternative in {@link AmpcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensExpr(AmpcParser.ParensExprContext ctx);
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
}