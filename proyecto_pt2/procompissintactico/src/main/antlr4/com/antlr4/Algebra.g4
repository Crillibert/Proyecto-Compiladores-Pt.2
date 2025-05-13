grammar Algebra;
// Reglas
programa: 
(asignacion | expresion | declaracion)* EOF;
declaracion: TIPODDATO ID ASSIGN expresion ';';
asignacion: ID ASSIGN expresion ';' ;
expresion
    : LCOR expresion RCOR                            
    | expresion OP_ARITMETICO expresion                     
    | NUMERO_ENTERO | NUMERO_REAL                                        
    | ID                                            
    ;

// Tokens
NUMERO_ENTERO   : [-]?[0-9]+ ;
NUMERO_REAL     : [0-9]+ ('.' [0-9]+)?;
ID              : [a-zA-Z_][a-zA-Z0-9_]*;
TIPODDATO       : 'Real'|'Entero'|'Booleano'|'Caracter'|'Cadena';
OP_LOGICO       : [|][|]|[&][&]|[!];
OP_RACIONALES   : [<][=]|[>][=]|[=][=]|[!][=]|[>]|[<];
OP_ARITMETICO   : [+]|[-]|[*]|[/]|[^]|[#];
OP_DEC_INC      : [+][+]|[-][-];
RES_CONTROL     : 'if'|'else';
RES_CICLOS      : 'for'|'do'|'while';
RES_FUN         : 'EscribirLinea'|'Escribir'|'Longitud'|'aCadena';
LCOR            :'{';
RCOR            :'}';
ASSIGN           : '=>' ;
WS              : [ \t\r\n]+ -> skip ;

