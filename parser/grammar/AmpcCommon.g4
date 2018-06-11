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

STRING:
      '\'' ~[']* '\''
    | '"'  ~["]* '"';

COMMENT
    : '\n'* '%' .*? '\n' -> skip;

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
    | arr=cell #cellExpr
    | value=number  # numberExpr
    | str=STRING # stringExpr
    | id=ID # identExpr
    | end= 'end' #endExpr;

array:
    '[' arrayRow? (arrayColumnSeparator arrayRow)* ']';

cell:
    '{' arrayRow? (arrayColumnSeparator arrayRow)* '}';

arrayRow:
    expression? (arrayRowSeparator expression)*;

arrayRowSeparator:
     ','
    | ;
arrayColumnSeparator:
      ';' nl*
    | nl+;


expressionList:
    expression (','? expression)*;

expression:
    '(' expression ')' # parensExpr
    | expr=expression '(' index=expressionList? ')' #indexExpr
    | expr=expression '{' index=expressionList? '}' #getCellExpr
    | expr=expression op=('.\'' | '\'') #unaryExpr
    | left=expression op=('.^' | '^') right=expression # infixExpr
    | op=('+' | '-' | '~' | '!') expr=expression # unaryExpr
    | left=expression op=('*' | '/' | '.*' | './') right=expression # infixExpr
    | left=expression op=('+' | '-') right=expression  # infixExpr
    | left=expression op=('>' | '<' | '>=' | '<=') right=expression # infixExpr
    | left=expression op=('==' | '!=') right=expression  # infixExpr
    | left=expression op=('&' | '&&' | '|' | '||') right=expression  # infixExpr
    | atom #atomExpr
    | start=expression ':' (step=expression ':')? end=expression #rangeExpr
    | ':' #rangeExpr;