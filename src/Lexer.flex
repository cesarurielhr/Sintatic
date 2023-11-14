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
Numero = 0 | [1-9][0-9]* | -([1-9][0-9])*

/*Error Numero*/
ErrorNumero = .Digito|Digito (.Digito.)*
%%
/* Ignoar Comentarios o espacios en blanco */
{Comentario}|{EspacioEnBlanco} { /*Ignorar*/ }

/*Numero*/
("(-"{Numero}+")")|{Numero} {return token(yytext(),"NÚMERO", yyline, yycolumn);}

/*Palabras Reservadas*/
Array | array  {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
List  | list   {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
If    | if     {return token(yytext(),"PALABRA RESERVADA",yyline,yycolumn);}
Else  | else   {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
While | while  {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
For   | for    {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
Do    | do     {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
Get   |get     {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
Public|public  {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
Private|private {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
Try   | try    {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
cath  | catch  {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
Static | static {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
Gramar | gramar {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
Options|options {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
Print  | print {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
Class  | class {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
Conj  | conj  {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
Fin   | fin  {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
tree  | tree  {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
Pila  | pila  {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
NTerm | nterm  {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}
Term  | term {return token(yytext(), "PALABRA RESERVADA", yyline, yycolumn);}


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
{Numero}{Identificador} {te.add(new ErrorTK("Lexico", "Indentificador Invalido", yyline+1, yycolumn+1));return token(yytext(), "ERROR_ID", yyline, yycolumn);}

{ErrorNumero} {te.add(new ErrorTK("Lexico", "Numero Invalido", yyline+1, yycolumn+1));return token(yytext(), "ERROR_NUM", yyline, yycolumn);}


/* El punto significa cualquier caracter */
. { te.add(new ErrorTK("Lexico", "Caracter invalido", yyline+1, yycolumn+1));{return token(yytext(), "ERROR_CHAR", yyline, yycolumn);}}
