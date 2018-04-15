grammar AmpcCommon;

ASSIGN: '=';

PLUS: '+';
MINUS: '-';
PROD: '*';
DIV: '/';

WS  : [ \t]+ -> skip ;

ID:
    ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

INTEGER:
    ('0'..'9')+;

REAL:
    INTEGER '.' INTEGER;

number:
      INTEGER
    | REAL;

nl: '\n' '\r'?;

commsep:
      ';''\n'*
    | ',' '\n'*
    | '\n'+;

atom:
      arr=array # arrayExpr
    | value=number  # numberExpr
    | id=ID # identExpr;

array:
    '[' arrayRow? (arrayColumnSeparator arrayRow)* ']';

arrayRow:
    expression? (arrayRowSeparator expression)*;

arrayRowSeparator:
     ','
    | ;
arrayColumnSeparator:
      ';' nl*
    | nl+;


expressionList:
    expression (',' expression)*;

expression:
    '(' expression ')' # parensExpr
    | expr=expression '(' index=expressionList ')' #indexExpr
    | left=expression op=('*' | '/') right=expression # infixExpr
    | left=expression op=('+' | '-') right=expression  # infixExpr
    | left=expression op=('>' | '<' | '>=' | '<=') right=expression # infixExpr
    | left=expression op=('==' | '!=') right=expression  # infixExpr
    | atom #atomExpr;