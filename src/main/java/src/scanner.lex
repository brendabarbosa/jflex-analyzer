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
Variables = {Type}{WhiteSpace}{AddIdentifier}
Declaration = {Variables}";"



%{
	ArrayList<Token> tokens = new ArrayList<>();
%}

%eof{

	tokens.forEach(token -> System.out.println("LINHA: "+token.getLine()+"   "+token.getText()));

%eof}

%%

{Declaration} {tokens.add(new Token(yyline,yytext(), ""));}
. {/* */}
