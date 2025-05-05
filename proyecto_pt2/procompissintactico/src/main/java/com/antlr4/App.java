package com.antlr4;

import org.antlr.v4.runtime.*;
import com.antlr4.AlgebraLexer;
import com.antlr4.AlgebraParser;

public class App {
    public static void main(String[] args) {
        String input = "A => 10 + 5;"; // Ejemplo de entrada
        AlgebraLexer lexer = new AlgebraLexer(CharStreams.fromString(input));
        AlgebraParser parser = new AlgebraParser(new CommonTokenStream(lexer));
        System.out.println(parser.programa().toStringTree(parser));
    }
}