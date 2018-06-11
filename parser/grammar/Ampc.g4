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
      '[' expressionList ']' ASSIGN rvalue=rValue #unpackLValue
    | (lvalue=expression ASSIGN)+ rvalue=rValue  #exprLValue;

rValue:
       expression #exprRValue
    | '@'ID #functionHandleRValue
    | '@' '(' idList ')' expression #anonymousFuncRValue;

condOperator:
    'if' cond=expression commsep?
        block=codeBlock
    elseIfPart*
    elsePart?
    ('endif' | 'end');

elseIfPart:
    'elseif' cond=expression commsep
        block=codeBlock;

elsePart:
    'else' commsep block=codeBlock;

whileLoop:
    'while' cond=expression commsep
        block=codeBlock
    ( 'endwhile' | 'end');

forLoop:
    'for' ID '=' expr=expression commsep
         block=codeBlock
    ('endfor' | 'end');

function:
    'function'out=funcOut '=' name=ID '(' args=funcArgs? ')' commsep
        block=codeBlock
    'endfunction' commsep;

funcOut:
    ID? | '[' ID? (',' ID)* ']';

idList:
    ID ( ',' ID)*;

funcArgs:
    ID ( ',' ID)*;