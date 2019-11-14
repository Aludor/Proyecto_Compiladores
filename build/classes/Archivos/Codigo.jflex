package proyecto.compiladores;

import java_cup.runtime.Symbol;

%%

%standalone
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
dospuntos = ":"
comillas = \"
coma = ","
punto = "."
tab = \t
iclase = [A-Z]([A-Za-z0-9]| "_" )*
variable = [a-z]([A-Za-z0-9])*
finlinea = \n | \r | \r\n
numero = [1-9][0-9]* | 0
clase = "clase"
propiedades = "propiedades"
publicas = "publicas"
cadena = "cadena"
metodos = "metodos"
publicos = "publicos"
entero = "entero"
si = "si"
sino = "sino"
entonces = "entonces"
devolver = "devolver"
privadas = "privadas"
constructor = "constructor"
escribir = "escribir"
leer = "leer"
principal = "Principal"
nuevo = "nuevo"
instanciar = "instanciar"
%%

{clase} {System.out.println("Encontre una palabra reservada " + yytext());}
{propiedades} {System.out.println("Encontre una palabra reservada " + yytext());}
{publicas} {System.out.println("Encontre una palabra reservada " + yytext());}
{cadena} {System.out.println("Encontre una palabra reservada " + yytext());}
{metodos} {System.out.println("Encontre una palabra reservada " + yytext());}
{publicos} {System.out.println("Encontre una palabra reservada " + yytext());}
{entero} {System.out.println("Encontre una palabra reservada " + yytext());}
{si} {System.out.println("Encontre una palabra reservada " + yytext());}
{sino} {System.out.println("Encontre una palabra reservada " + yytext());}
{entonces} {System.out.println("Encontre una palabra reservada " + yytext());}
{devolver} {System.out.println("Encontre una palabra reservada " + yytext());}
{privadas} {System.out.println("Encontre una palabra reservada " + yytext());}
{constructor} {System.out.println("Encontre una palabra reservada " + yytext());}
{escribir} {System.out.println("Encontre una palabra reservada " + yytext());}
{leer} {System.out.println("Encontre una palabra reservada " + yytext());}
{principal} {System.out.println("Encontre una palabra reservada " + yytext());}
{nuevo} {System.out.println("Encontre una palabra reservada " + yytext());}
{instanciar} {System.out.println("Encontre una palabra reservada " + yytext());}
{iclase} {System.out.println("Encontre un identificador de clase " + yytext());}
{variable} {System.out.println("Encontre una variable " + yytext());}
{numero} {System.out.println("Encontre un numero " + yytext());}
{finlinea} {System.out.println("Encontre un fin de linea " + yytext());}
{comentariosimple} {System.out.println("Encontre un comentario " + yytext());}
{comentarioparrafoinicio} {System.out.println("Encontre un inicio de comentario " + yytext());}
{comentarioparrafofin} {System.out.println("Encontre un fin de comentario " + yytext());}
{lparen} {System.out.println("Encontre un parentesis izquierdo " + yytext());}
{rparen} {System.out.println("Encontre un parentesis derecho " + yytext());}
{igual} {System.out.println("Encontre un signo igual " + yytext());}
{mod} {System.out.println("Encontre un signo mod " + yytext());}
{mas} {System.out.println("Encontre un signo mas " + yytext());}
{menos} {System.out.println("Encontre un signo menos " + yytext());}
{mul} {System.out.println("Encontre un signo multiplicacion " + yytext());}
{div} {System.out.println("Encontre un signo division " + yytext());}
{puntocoma} {System.out.println("Encontre un signo punto y coma " + yytext());}
{dospuntos} {System.out.println("Encontre un signo dos puntos " + yytext());}
{comillas} {System.out.println("Encontre un signo comillas " + yytext());}
{coma} {System.out.println("Encontre un signo coma " + yytext());}
{punto} {System.out.println("Encontre un signo punto " + yytext());}
{tab} {System.out.println("Encontre un signo tabulador" + yytext());}
. { }