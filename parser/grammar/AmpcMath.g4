grammar AmpcMath;

import AmpcCommon;

expression:
    '(' expression ')' # parensExpr
    | left=expression op=('*' | '/') right=expression # infixExpr
    | left=expression op=('+' | '-') right=expression  # infixExpr
    | left=expression op=('>' | '<' | '>=' | '<=') right=expression # infixExpr
    | left=expression op=('==' | '!=') right=expression  # infixExpr
    | value=number # numberExpr
    | id=ID #identExpr;