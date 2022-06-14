package src;

import java.util.*;
import Token.java;
%%

%standalone
%class LexicalAnalyzer
%line

LineTerminator = \r|\n|\r\n
WhiteSpace = {LineTerminator} | [ \t\f]

Type = int|char|float
Identifier = [a-zA-Z][a-zA-Z0-9\_]*
IdentifierList = ,{WhiteSpace}?{Identifier}
AddIdentifier = {Identifier}{IdentifierList}*
Variable = {Type}{WhiteSpace}{Identifier}
Variables = {Type}{WhiteSpace}{AddIdentifier}
Declaration = {Variables}";"


If = if\({Condition}\) {CommandStatement} {Else}?
While = while\({Condition}\) {CommandStatement}
For = for\({Variable}\;{Condition}\;{WhiteSpace}{IncDec}\) {CommandStatement}
CommandStatement  = {WhiteSpace}* \{ {Command}+ \} {WhiteSpace}*
Condition = {WhiteSpace}* {Identifier} {WhiteSpace}* {RelationalOperator} {WhiteSpace}* {Identifier} {WhiteSpace}*
Command = {WhiteSpace}* {Identifier} {WhiteSpace}* {MathOperator} {WhiteSpace}* {Identifier} {WhiteSpace}*\; {WhiteSpace}*
Else = {WhiteSpace}*else{WhiteSpace}*\{{Command}+\}

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
Inc = {Identifier}{Add}{Add}
Dec = {Identifier}{Subtract}{Subtract}
IncDec = {Inc} | {Dec}

%{
	ArrayList<Token> tokens = new ArrayList<>();
%}

%eof{

	tokens.forEach(token -> System.out.println("LINHA: "+token.getLine()+"   "+token.getText()));

%eof}

%%

{Declaration} {tokens.add(new Token(yyline,yytext(), ""));}
{If} {tokens.add(new Token(yyline,yytext(), ""));}
{While} {tokens.add(new Token(yyline,yytext(), ""));}
{For} {tokens.add(new Token(yyline,yytext(), ""));}
. {/* */}
