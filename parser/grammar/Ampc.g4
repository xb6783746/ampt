grammar Ampc;

options
{
	language=Java;
}

@header {package ru.vsu.parser; }

import AmpcCommon;

file:
    script;

script:
    codeBlock EOF;

codeBlock:
    commSep* comOptSep?;

commSep:
    command commsep;
comOptSep:
    command commsep?;

command:
        assign #assingCommand
      | condOperator #condOperatorCommand
      | loopOperator #loopOperatorCommand;

assign:
    lvalue=expression ASSIGN rvalue=expression;

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

loopOperator:
    'while' cond=expression commsep
        block=codeBlock
    'end';