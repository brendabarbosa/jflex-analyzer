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

Inc = {Identifier}{Add}{Add}
Dec = {Identifier}{Subtract}{Subtract}
IncDec = {Inc} | {Dec}

Type = int|char|float
Identifier = [a-zA-Z][a-zA-Z0-9\_]*(\[ \d+ \])?
IdentifierList = ,{WS}?{Identifier}
AddIdentifier = {Identifier}{IdentifierList}*
Variable = {Type}{WS}{Identifier}
Variables = {Type}{WS}{AddIdentifier}
SingleDeclaration = {Variable}";"
Declaration = {Variables}";"

MathOperation = {WS}*{Identifier}{WS}* {MathOperator} {WS}*{Identifier}{WS}*
CommandStatement  = {WS}* \{ {Command}+ \} {WS}*
Command = {WS}*{Identifier}{WS}* {AssignmentOperators} ({MathOperation} | {WS}*{Identifier}{WS}*) \; {WS}*

If = if\({Condition}\) {CommandStatement} {Else}?
ConditionValue = {Identifier} | [a-zA-Z0-9\_]*
Condition = {WS}* {ConditionValue} {WS}* {RelationalOperator} {WS}* {ConditionValue} {WS}*
Else = {WS}* else {CommandStatement}

Switch = switch {WS}* \( {WS}* {Identifier} {WS}* \) {WS}* \{ {Cases}+ \}
Cases = {WS}*case {CaseOption} {WS}*\: {SwitchCommandStatement} {Default}?
Default = {WS}*default\:{WS}*\{ {Command}+ \}{WS}*
SwitchCommandStatement  = {WS}* \{ {Command}+ {Break} \} {WS}*
Break = {WS}* break {WS}*;{WS}*
CaseOption = {WS}+({Identifier} | \"[a-zA-Z]+\" | [0-9]){WS}*

While = while {WS}* \({Condition}\) {CommandStatement}
For = for {WS}* \({SingleDeclaration}{WS}*{Condition};{WS}*{IncDec}\) {CommandStatement}


%{
	ArrayList<Token> tokens = new ArrayList<>();
%}

%eof{

	tokens.forEach(token -> System.out.println(token.getType()+" - LINHA: "+token.getLine()+"   \n"+token.getText()+"\n"));

%eof}

%%

{Declaration} {tokens.add(new Token(yyline,yytext(), "Declaração"));}
{If} {tokens.add(new Token(yyline,yytext(), "IF"));}
{Switch} {tokens.add(new Token(yyline,yytext(), "Switch"));}
{While} {tokens.add(new Token(yyline,yytext(), "While"));}
{For} {tokens.add(new Token(yyline,yytext(), "For"));}

. {/* */}
