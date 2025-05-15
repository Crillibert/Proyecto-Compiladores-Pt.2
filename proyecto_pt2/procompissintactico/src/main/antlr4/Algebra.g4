grammar Algebra;

programa
    : ecuacion* ';'EOF
    ;

ecuacion
    : expresion relop expresion
    ;

expresion
    : expresion POW expresion
    | expresion (POR | DIV) expresion
    | expresion (MAS | MENOS) expresion
    | LPAREN expresion RPAREN
    | (MAS | MENOS)* atom
    ;

atom
    : reales
    | variable
    ;

reales
    : NUMERO_REAL
    ;

variable
    : VARIABLE
    ;

relop
    : EQ
    | GT
    | LT
    | ASIGN
    ;

VARIABLE
    : VALID_ID_START VALID_ID_CHAR*
    ;

fragment VALID_ID_START
    : 'a' .. 'z'
    | 'A' .. 'Z'
    | '_'
    ;

fragment VALID_ID_CHAR
    : VALID_ID_START
    | '0' .. '9'
    ;


NUMERO_REAL
    : NUMERO (UNSIGNED_INTEGER)?
    ;

fragment NUMERO
    : ('0' .. '9')+ ('.' ('0' .. '9')+)?
    ;

fragment UNSIGNED_INTEGER
    : ('0' .. '9')+
    ;


fragment SIGN
    : '+'
    | '-'
    ;

LPAREN
    : '{'
    ;

RPAREN
    : '}'
    ;

MAS
    : '+'
    ;

MENOS
    : '-'
    ;

POR
    : '*'
    ;

DIV
    : '/'
    ;

GT
    : '>'
    ;

LT
    : '<'
    ;

EQ
    : '='
    ;

PUNTO
    : '.'
    ;

POW
    : '^'
    ;
    
ASIGN
    : '=>'
    ;

WS
    : [ \r\n\t]+ -> skip
    ;