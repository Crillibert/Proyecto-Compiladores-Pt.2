package com.antlr4.service;

import com.antlr4.dto.AnalysisResult;
import com.antlr4.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.springframework.stereotype.Service;

@Service
public class AnalysisService {

    public AnalysisResult analyze(String input) {
        AnalysisResult result = new AnalysisResult();
        
        try {
            // Configuración del lexer y parser
            AlgebraLexer lexer = new AlgebraLexer(CharStreams.fromString(input));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            AlgebraParser parser = new AlgebraParser(tokens);
            
            // Análisis sintáctico
            ParseTree tree = parser.programa(); // Usa tu regla inicial
            
            // Configura el resultado exitoso
            result.setParseTree(tree.toStringTree(parser));
            result.setSuccess(true);
            
        } catch (Exception e) {
            // Configura el resultado fallido
            result.setErrors("Error de análisis: " + e.getMessage());
            result.setSuccess(false);
        }
        
        return result;
    }
}