package src;

import java.util.*;
import Token.java;
%%

%standalone
%class LexicalAnalyzer
%line

LineTerminator = \r|\n|\r\n
WS = {LineTerminator} | [ \t\f]

Add = \+
Subtract = \-
Multiply = \*
Divide = \/
MathOperator = {Add}|{Subtract}|{Multiply}|{Divide}

EqualTo = \=\=
NotEqualTo = \!\= 
LessThan = \<
GreaterThan = \>
LessThanEqualTo = \<\= 
GreaterThanEqualTo = \>\= 
RelationalOperator = {EqualTo} | {NotEqualTo} | {LessThan} | {GreaterThan} | {LessThanEqualTo} | {GreaterThanEqualTo}


Assigment = \=
AddAndAssigment = \+\=
SubtractAndAssigment = \-\=
MultiplyAndAssigment = \*\=
DivideAndAssigment = \*\=
AssignmentOperators  = {Assigment} | {AddAndAssigment} | {SubtractAndAssigment} | {MultiplyAndAssigment} | {DivideAndAssigment}

Type = int|char|float
Identifier = [a-zA-Z][a-zA-Z0-9\_]*
IdentifierList = ,{WS}?{Identifier}
AddIdentifier = {Identifier}{IdentifierList}*
Variables = {Type}{WS}{AddIdentifier}
Declaration = {Variables}";"


If = if\({Condition}\) {CommandStatement} {Else}?
CommandStatement  = {WS}* \{ {Command}+ \} {WS}*
Condition = {WS}* {Identifier} {WS}* {RelationalOperator} {WS}* {Identifier} {WS}*
Command = {WS}*{Identifier}{WS}* {AssignmentOperators} ({MathOperation} | {WS}*{Identifier}{WS}*) \; {WS}*
MathOperation = {WS}*{Identifier}{WS}* {MathOperator} {WS}*{Identifier}{WS}*

Else = {WS}* else {CommandStatement}



Switch = switch {WS}* \( {WS}* {Identifier} {WS}* \) {WS}* \{ {Cases}+ \}
Cases = {WS}*case {CaseOption} {WS}*\: {SwitchCommandStatement} {Default}?
Default = {WS}*default\:{WS}*\{ {Command}+ \}{WS}*
SwitchCommandStatement  = {WS}* \{ {Command}+ {Break} \} {WS}*
Break = {WS}* break {WS}*;{WS}*


CaseOption = {WS}+({Identifier} | \"[a-zA-Z]+\" | [0-9]){WS}*

%{
	ArrayList<Token> tokens = new ArrayList<>();
%}

%eof{

	tokens.forEach(token -> System.out.println("LINHA: "+token.getLine()+"   "+token.getText()));

%eof}

%%

{Declaration} {tokens.add(new Token(yyline,yytext(), ""));}
{If} {tokens.add(new Token(yyline,yytext(), ""));}
{Switch} {tokens.add(new Token(yyline,yytext(), ""));}

. {/* */}
