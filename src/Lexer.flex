import compilerTools.Token;

%%
%class Lexer
%type Token
%line
%column
%{
    private Token token(String lexeme, String lexicalComp, int line, int column){
        return new Token(lexeme, lexicalComp, line+1, column+1);
    }

    public ArrayList<ErrorTK> te = new ArrayList<>();
    
    public ArrayList<ErrorTK> getTablaError(){
        return te;
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
/* Ignoar Comentarios o espacios en blanco */
{Comentario}|{EspacioEnBlanco} { /*Ignorar*/ }

/*Numero*/
("(-"{Numero}+")")|{Numero} {return token(yytext(),"NÚMERO", yyline, yycolumn);}

/*Palabras Reservadas*/
Array   {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
List    {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
If      {return token(yytext(),"PALABRA RESERVADA",yyline,yycolumn);}
Else    {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
While   {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
For     {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
Do      {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
Get     {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
Public  {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
Private {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
Try     {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
cath    {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
static  {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
Gramar  {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
Options {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
Print   {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
Class   {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
Conj    {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
Fin     {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
tree    {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
Pila    {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
Rule    {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}


/*Indentificador*/
{Identificador} {return token(yytext(),"INDENTIFICADOR", yyline, yycolumn);}

/* CadenaDeTexto */
{CadenaDeTexto} { return token(yytext(), "CADENA TEXTO", yyline, yycolumn); }



/* Operadores de Agrupacion */
"(" {return token(yytext(), "Parentesis_Apertura", yyline, yycolumn);}
")" {return token(yytext(), "Parentesis_Clausura", yyline, yycolumn);}
"{" {return token(yytext(), "Llave_Apertura", yyline, yycolumn);}
"}" {return token(yytext(), "Llave_Clausura", yyline, yycolumn);}
"[" {return token(yytext(), "Corchete_Apertura", yyline, yycolumn);}
"]" {return token(yytext(), "Corchete_Clausura", yyline, yycolumn);}
/* El punto significa cualquier caracter */

/* Operadores de Asignacion */
"=" {return token(yytext(), "Igual", yyline, yycolumn);}
"==" {return token(yytext(), "Produccion", yyline, yycolumn);}
/*Produccion*/
"::=" {return token(yytext(), "Produccion", yyline, yycolumn);}

/* Operadores de Agrupacion */
"|" {return token(yytext(), "OP_LOG_OR", yyline, yycolumn);}
/* El punto significa cualquier caracter */

/*cOMA*/
"," {return token(yytext(), "COMA", yyline, yycolumn);}
/*Punto y coma*/
";" {return token(yytext(), "PUNTO_Y_COMA", yyline, yycolumn);}


/*Errores*/
{Numero}{Identificador} {te.add(new ErrorTK("Lexico", "Numero Invalido", yyline+1, yycolumn+1));}

"'"{CadenaDeTexto} {te.add(new ErrorTK("Lexico", "Cadena Invalida", yyline+1, yycolumn+1));}
/* El punto significa cualquier caracter */

. { te.add(new ErrorTK("Lexico", "Caracter invalido", yyline+1, yycolumn+1)); }
