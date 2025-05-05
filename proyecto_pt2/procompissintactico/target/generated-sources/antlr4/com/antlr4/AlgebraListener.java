// Generated from com\antlr4\Algebra.g4 by ANTLR 4.9.3
package com.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlgebraParser}.
 */
public interface AlgebraListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AlgebraParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(AlgebraParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(AlgebraParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgebraParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(AlgebraParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(AlgebraParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgebraParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(AlgebraParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(AlgebraParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgebraParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(AlgebraParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(AlgebraParser.TerminoContext ctx);
}