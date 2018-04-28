grammar Ampc;

options
{
	language=Java;
}

@header {package ru.vsu.parser; }

import AmpcCommon;

file:
    script EOF;

script:
    scriptEntry+;

scriptEntry:
      codeBlock #codeNode
    | function #funcNode;

codeBlock:
    comOptSep | commSep+ comOptSep?;

commSep:
    command commsep;
comOptSep:
    command commsep?;

command:
        assign #assingCommand
      | condOperator #condOperatorCommand
      | whileLoop #whileLoopCommand
      | forLoop #forLoopCommand
      | expression #expressionCommand;

assign:
    lvalue=expression ASSIGN rvalue=rValue;

rValue:
       expression #exprRValue
    | '@'ID #functionHandleRValue;

condOperator:
    'if' cond=expression commsep?
        block=codeBlock
    elseIfPart*
    elsePart?
    'end';

elseIfPart:
    'elseif' cond=expression commsep
        block=codeBlock;

elsePart:
    'else' commsep block=codeBlock;

whileLoop:
    'while' cond=expression commsep
        block=codeBlock
    'end';

forLoop:
    'for' ID '=' expr=expression commsep
         block=codeBlock
    'end';

function:
    'function'out=funcOut '=' name=ID '(' args=funcArgs? ')' commsep
        block=codeBlock
    'endfunction' commsep;

funcOut:
    ID? | '[' ID? (',' ID)* ']';

funcArgs:
    ID ( ',' ID)*;