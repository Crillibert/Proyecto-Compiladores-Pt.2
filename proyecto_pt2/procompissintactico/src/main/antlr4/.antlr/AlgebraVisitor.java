// Generated from Algebra.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AlgebraParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AlgebraVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AlgebraParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(AlgebraParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgebraParser#ecuacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEcuacion(AlgebraParser.EcuacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgebraParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(AlgebraParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgebraParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(AlgebraParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgebraParser#reales}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReales(AlgebraParser.RealesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgebraParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(AlgebraParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgebraParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(AlgebraParser.RelopContext ctx);
}