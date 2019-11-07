package proyecto.compiladores;

import java_cup.runtime.Symbol;

%%

%cup
%line
%column
%class CodigoFlex

comentariosimple = "//"
comentarioparrafoinicio = "/*"
comentarioparrafofin = "*/"
lparen = "("
rparen = ")"
igual = "="
mod = "%"
mas = "+"
menos = "-"
mul = "*"
div = "/"
puntocoma = ";"
tab = \t
clase = [A-Z]([A-Za-z0-9]| "_" )*
variable = [a-z]([A-Za-z0-9])*
finarchivo = \f

finlinea = \n | \r | \r\n
numero = [0-9]+
%%

{numero} { System.out.println(yyline); }

{mas} { System.out.println(yyline); }

{menos} { System.out.println(yyline); }

{puntocoma} { System.out.println(yyline); }

. { }