package src;

import java.util.*;
import Command.java;
%%

%standalone
%class Analyzer
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
AddIdentifier = {Identifier}{IdentifierList}*
IdentifierList = ,{WS}*{Identifier}
Variable = {Type}{WS}+{Identifier}
Variables = {Type}{WS}+{AddIdentifier}
SingleDeclaration = {Variable}";"
Declaration = {Variables}";"

MathOperation = {WS}*{Value}{WS}* {MathOperator} {WS}*{Value}{WS}*
Value = {Identifier} | [0-9]+
Command = {WS}*{Identifier}{WS}* {AssignmentOperators} ({MathOperation} | {WS}*{Value}{WS}*) \; {WS}*
CommandStatement  = {WS}* \{ {Command}+ \} {WS}*

Condition = {WS}* {ConditionValue} {WS}* {RelationalOperator} {WS}* {ConditionValue} {WS}*
ConditionValue = {Identifier} | \"[a-zA-Z0-9\_]*\" | [0-9]+
If = if\({Condition}\) {CommandStatement} {Else}?
Else = {WS}* else {CommandStatement}

Switch = switch {WS}* \( {WS}* {Identifier} {WS}* \) {WS}* \{ {Cases}+ \}
Cases = {WS}*case {CaseOption} {WS}*\: {SwitchCommandStatement} {Default}?
Default = {WS}*default\:{WS}*\{ {Command}+ \}{WS}*
SwitchCommandStatement  = {WS}* \{ {Command}+ {Break} \} {WS}*
Break = {WS}* break {WS}*;{WS}*
CaseOption = {WS}+([0-9]+){WS}*

While = while {WS}* \({Condition}\) {CommandStatement}
For = for {WS}* \({SingleDeclaration}{WS}*{Condition};{WS}*{IncDec}\) {CommandStatement}


%{
	ArrayList<Command> commands = new ArrayList<>();
%}

%eof{

	commands.forEach(command -> System.out.println(" LINHA: "+command.getLine()+" - "+command.getType()));
	System.out.println("");
	commands.forEach(command -> System.out.println("\nLINHA: "+command.getLine()+" - "+command.getType()+"\n"+command.getText()));

%eof}

%%

{Declaration} {commands.add(new Command(yyline,yytext(), "DECLARACAO"));}
{If} {commands.add(new Command(yyline,yytext(), "IF"));}
{Switch} {commands.add(new Command(yyline,yytext(), "SWITCH"));}
{While} {commands.add(new Command(yyline,yytext(), "WHILE"));}
{For} {commands.add(new Command(yyline,yytext(), "FOR"));}

. { /* */ }
