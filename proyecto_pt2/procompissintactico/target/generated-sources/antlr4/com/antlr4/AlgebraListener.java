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
	 * Enter a parse tree produced by {@link AlgebraParser#ecuacion}.
	 * @param ctx the parse tree
	 */
	void enterEcuacion(AlgebraParser.EcuacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraParser#ecuacion}.
	 * @param ctx the parse tree
	 */
	void exitEcuacion(AlgebraParser.EcuacionContext ctx);
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
	 * Enter a parse tree produced by {@link AlgebraParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(AlgebraParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(AlgebraParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgebraParser#reales}.
	 * @param ctx the parse tree
	 */
	void enterReales(AlgebraParser.RealesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraParser#reales}.
	 * @param ctx the parse tree
	 */
	void exitReales(AlgebraParser.RealesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgebraParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(AlgebraParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(AlgebraParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgebraParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(AlgebraParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(AlgebraParser.RelopContext ctx);
}