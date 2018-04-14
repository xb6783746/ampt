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