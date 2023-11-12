import compilerTools.TextColor;
import java.awt.Color;

%%
%class LexerColor
%type TextColor
%char
%{
    private TextColor textColor(long start, int size, Color color){
        return new TextColor((int) start, size, color);
    }
%}
/* Variables básicas de comentarios y espacios */
TerminadorDeLinea = \r|\n|\r\n
EntradaDeCaracter = [^\r\n]
EspacioEnBlanco = {TerminadorDeLinea} | [ \t\f]
ComentarioTradicional = "/*" [^*] ~"*/" | "/*" "*"+ "/"
FinDeLineaComentario = "//" {EntradaDeCaracter}* {TerminadorDeLinea}?
ContenidoComentario = ( [^*] | \*+ [^/*] )*
ComentarioDeDocumentacion = "/**" {ContenidoComentario} "*"+ "/"

/* Comentario */
Comentario = {ComentarioTradicional} | {FinDeLineaComentario} | {ComentarioDeDocumentacion}
/* Variables para cadendas de texto*/
CadenaDeTexto = \' {EntradaDeCaracter}* \'

/* Identificador */
Letra = [A-Za-zÑñ_ÁÉÍÓÚáéíóúÜü]
Digito = [0-9]
Identificador = {Letra}({Letra}|{Digito})*

/* Número */
Numero = 0 | [1-9][0-9]*
%%

/* Comentarios o espacios en blanco */
{Comentario} { return textColor(yychar, yylength(), new Color(146, 146, 146)); }
{EspacioEnBlanco} { /*Ignorar*/ }

/*Palabras Reservadas*/
Array   {return textColor(yychar, yylength(), new Color(0, 0, 255));}
List    {return textColor(yychar, yylength(), new Color(0, 0, 255));}
If      {return textColor(yychar, yylength(), new Color(0, 0, 255));}
Else    {return textColor(yychar, yylength(), new Color(0, 0, 255));}
While   {return textColor(yychar, yylength(), new Color(0, 0, 255));}
For     {return textColor(yychar, yylength(), new Color(0, 0, 255));}
Do      {return textColor(yychar, yylength(), new Color(0, 0, 255));}
Get     {return textColor(yychar, yylength(), new Color(0, 0, 255));}
Public  {return textColor(yychar, yylength(), new Color(0, 0, 255));}
Private {return textColor(yychar, yylength(), new Color(0, 0, 255));}
Try     {return textColor(yychar, yylength(), new Color(0, 0, 255));}
cath    {return textColor(yychar, yylength(), new Color(0, 0, 255));}
static  {return textColor(yychar, yylength(), new Color(0, 0, 255));}
Gramar  {return textColor(yychar, yylength(), new Color(0, 0, 255));}
Options {return textColor(yychar, yylength(), new Color(0, 0, 255));}
Print   {return textColor(yychar, yylength(), new Color(0, 0, 255));}
Class   {return textColor(yychar, yylength(), new Color(0, 0, 255));}
Conj    {return textColor(yychar, yylength(), new Color(0, 0, 255));}
Fin     {return textColor(yychar, yylength(), new Color(0, 0, 255));}
tree    {return textColor(yychar, yylength(), new Color(0, 0, 255));}
Pila    {return textColor(yychar, yylength(), new Color(0, 0, 255));}
Rule    {return textColor(yychar, yylength(), new Color(0, 0, 255));}

/* CadenaDeTexto */
{CadenaDeTexto} {return textColor(yychar, yylength(), new Color(255, 128, 0));}

. { /* Ignorar */ }