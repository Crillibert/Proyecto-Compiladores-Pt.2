package com.antlr4;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class MiAlgebraVisitor extends AlgebraBaseVisitor<Double> {
    
    @Override
    public Double visitPrograma(AlgebraParser.ProgramaContext ctx) {
        System.out.println("Visitando programa");
        return visitChildren(ctx);
    }

    @Override
    public Double visitEcuacion(AlgebraParser.EcuacionContext ctx) {
        System.out.println("Visitando ecuación");
        Double izquierda = visit(ctx.expresion(0));
        Double derecha = visit(ctx.expresion(1));
        return izquierda - derecha; // Diferencia entre lados
    }

    @Override
    public Double visitExpresion(AlgebraParser.ExpresionContext ctx) {
        if(ctx.getChildCount() == 1) {
            return visit(ctx.termino(0));
        }
        
        Double resultado = visit(ctx.termino(0));
        for(int i = 1; i < ctx.termino().size(); i++) {
            String operador = ctx.getChild(2*i-1).getText();
            Double termino = visit(ctx.termino(i));
            
            switch(operador) {
                case "+": resultado += termino; break;
                case "-": resultado -= termino; break;
            }
        }
        return resultado;
    }

    @Override
    public Double visitTermino(AlgebraParser.TerminoContext ctx) {
        if(ctx.getChildCount() == 1) {
            return visit(ctx.factor(0));
        }
        
        Double resultado = visit(ctx.factor(0));
        for(int i = 1; i < ctx.factor().size(); i++) {
            String operador = ctx.getChild(2*i-1).getText();
            Double factor = visit(ctx.factor(i));
            
            switch(operador) {
                case "*": resultado *= factor; break;
                case "/": resultado /= factor; break;
            }
        }
        return resultado;
    }

    @Override
    public Double visitFactor(AlgebraParser.FactorContext ctx) {
        if(ctx.NUMERO() != null) {
            return Double.parseDouble(ctx.NUMERO().getText());
        }
        if(ctx.VARIABLE() != null) {
            System.out.println("Variable: " + ctx.VARIABLE().getText());
            return 0.0; // Valor por defecto para variables
        }
        return visit(ctx.expresion()); // Para expresiones entre paréntesis
    }
}