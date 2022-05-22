package src;

import java.util.*;
import Token.java;
%%

%standalone
%class LexicalAnalyzer
%line

celular =  \(\d{2}\)\s?\d{4,5}\-?\d{4}
placa = [A-Za-z]{3}\d{4}
cpf = \d{3}\.\d{3}.\d{3}\-\d{2}
numeroreal = \-*\d+\.?\d*
tag = <\/?[A-Za-z]\s*[A-Za-z0-9 \"\"\'\'\=\.\-\:]*>
url = https?:\/\/(www\.)?[-a-zA-Z0-9]{2,256}\.[a-z]*\b([-a-zA-Z0-9@:%_\+.~#?&\/=]*)
palava = [A-Za-zà-úÀ-Ú]*
identificador = [a-zA-Z][a-zA-Z0-9\_]*
cnpj = \d{2}\.\d{3}\.\d{3}\/\d{4}\-\d{2}

%{
	ArrayList<Token> tokens = new ArrayList<>();
%}

%eof{

	tokens.forEach(token -> System.out.println("LINHA: "+token.getLine()+"   "+token.getText()+" - "+token.getType()));

%eof}

%%
{celular} {tokens.add(new Token(yyline,yytext(), "CELULAR"));}
{placa}  {tokens.add(new Token(yyline,yytext(), "PLACA"));}
{cpf}  {tokens.add(new Token(yyline,yytext(), "CPF"));}
{numeroreal} {tokens.add(new Token(yyline,yytext(), "NUMERO REAL"));}
{tag}  {tokens.add(new Token(yyline,yytext(), "TAG"));}
{url}  {tokens.add(new Token(yyline,yytext(), "URL"));}
{palava}  {tokens.add(new Token(yyline,yytext(), "PALAVRA"));}
{identificador} {tokens.add(new Token(yyline,yytext(), "IDENTIFICADOR"));}
{cnpj} {tokens.add(new Token(yyline,yytext(), "CNPJ"));}

. {/* caracteres não reconhecidos */}
