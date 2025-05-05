grammar Algebra;

// Tokens
NUMERO  : [0-9]+ ('.' [0-9]+)? ;
ID      : [a-zA-Z_][a-zA-Z0-9_]* ;
ASIGN   : '=>' ;
WS      : [ \t\r\n]+ -> skip ;

// Reglas
programa: (asignacion | expresion)* ;
asignacion: ID ASIGN expresion ';' ;
expresion: termino (('+'|'-'|'*'|'/') termino)* ;
termino: NUMERO | ID | '(' expresion ')' ;