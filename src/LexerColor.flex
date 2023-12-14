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
CadenaDeTexto = \' {EntradaDeCaracter}*\'

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
Array | array  {return textColor(yychar, yylength(), new Color(0, 0, 255));}
List  | list   {return textColor(yychar, yylength(), new Color(0, 0, 255));}
If    | if     {return textColor(yychar, yylength(), new Color(0, 0, 255));}
Else  | else   {return textColor(yychar, yylength(), new Color(0, 0, 255));}
While | while  {return textColor(yychar, yylength(), new Color(0, 0, 255));}
For   | for    {return textColor(yychar, yylength(), new Color(0, 0, 255));}
Do    | do     {return textColor(yychar, yylength(), new Color(0, 0, 255));}
Get   |get     {return textColor(yychar, yylength(), new Color(0, 0, 255));}
Public|public  {return textColor(yychar, yylength(), new Color(0, 0, 255));}
Private|private {return textColor(yychar, yylength(), new Color(0, 0, 255));}
Try   | try     {return textColor(yychar, yylength(), new Color(0, 0, 255));}
cath  | catch   {return textColor(yychar, yylength(), new Color(0, 0, 255));}
Static | static {return textColor(yychar, yylength(), new Color(0, 0, 255));}
Gramar | gramar {return textColor(yychar, yylength(), new Color(0, 0, 255));}
Options|options {return textColor(yychar, yylength(), new Color(0, 0, 255));}
Print  | print  {return textColor(yychar, yylength(), new Color(0, 0, 255));}
Class  | class  {return textColor(yychar, yylength(), new Color(0, 0, 255));}
Conj  | conj    {return textColor(yychar, yylength(), new Color(0, 0, 255));}
Fin   | fin     {return textColor(yychar, yylength(), new Color(0, 0, 255));}
tree  | tree    {return textColor(yychar, yylength(), new Color(0, 0, 255));}
Pila  | pila    {return textColor(yychar, yylength(), new Color(0, 0, 255));}
NTerm | nterm   {return textColor(yychar, yylength(), new Color(0, 0, 255));}
Term  | term    {return textColor(yychar, yylength(), new Color(0, 0, 255));}

/* CadenaDeTexto */
{CadenaDeTexto} {return textColor(yychar, yylength(), new Color(255, 128, 0));}

. { /* Ignorar */ }