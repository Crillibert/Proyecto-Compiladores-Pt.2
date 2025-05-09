package com.antlr4;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class App {
    public static void main(String[] args) {
        String input = "A => 10 + 5;"; // Ejemplo de entrada
        //lexema
        AlgebraLexer lexer = new AlgebraLexer(CharStreams.fromString(input));
        //tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        //parser/arbol
        AlgebraParser parser = new AlgebraParser(new CommonTokenStream(lexer));
        //Mostrar el arbol en linea 
        System.out.println(parser.programa().toStringTree(parser));
        
    }
}
