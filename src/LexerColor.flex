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
ComentarioTradicional = "#"
FinDeLineaComentario = "//" {EntradaDeCaracter}* {TerminadorDeLinea}?
ContenidoComentario = ( [^*] | \*+ [^/*] )*
ComentarioDeDocumentacion = "/*" {ContenidoComentario} "*/"

/* Comentario */
Comentario = {FinDeLineaComentario} | {ComentarioDeDocumentacion}

/* Texto */
Letra = [A-Za-zÑñ_ÁÉÍÓÚáéíóúÜü]
Digito = [0-9]
Identificador = {Letra}({Letra}|{Digito})*

/* Números */
NumeroEnt = 0 | [1-9][0-9]*
NumeroFlot = ([1-9][0-9]*|0\.[0-9]+)

/* Cadena */
Cadena = \"([^\"\\]|\\.)*\"

/* Booleano */
Booleano = (true|false)

/* Parentesis y Llaves */
ParAbrir = "("
ParCierre = ")"
LlaAbrir = "{"
LlaCierre = "}"

/* Separadores */
Coma = ","
PuntoComa = ";"

/* Asignacion y Operaciones */
Asignacion = "="
OpeAritmetico = "+"|"-"|"*"|"/"
OpeLogico = "&&"|"||"|"!"
Comparacion = "=="|"!="|"<"|">"|"<="|"=>"

/* Ciclos */
Ciclo = (for|while|do-while)
InstCiclo = (break|continue)

/* Condicional */
Condicional = (if|else|else-if)
FinCondicional = (end-if)

%%

/* Comentarios o espacios en blanco */
{Comentario} { return textColor(yychar, yylength(), new Color(146, 146, 146)); }
{EspacioEnBlanco} { /*Ignorar*/ }

/* Identificador */
\#{Identificador} { /* Ignorar */ } 
\${Identificador} { /* Ignorar */ } 
\+{Identificador} { /* Ignorar */ } 

/* Números */
{NumeroEnt} { return textColor(yychar, yylength(), new Color(25, 64, 255));}
{NumeroFlot} { return textColor(yychar, yylength(), new Color(25, 64, 255));}

/* Cadenas */
{Cadena} { return textColor(yychar, yylength(), new Color(255, 170, 0));}

/* Booleano */
{Booleano} { return textColor(yychar, yylength(), new Color(0, 25, 153));}

/* Parentesis y Llaves */
{ParAbrir} { /* Ignorar */ }
{ParCierre} { /* Ignorar */ }
{LlaAbrir} { /* Ignorar */ }
{LlaCierre} { /* Ignorar */ }

/* Separadores */
{Coma} { /* Ignorar */ }
{PuntoComa} { /* Ignorar */ }

/* Asignacion y Operacion */
{Asignacion} { /* Ignorar */ }
{OpeAritmetico} { /* Ignorar */ }
{OpeLogico} { /* Ignorar */ }
{Comparacion} { /* Ignorar */ }

/* Ciclos */
{Ciclo} { return textColor(yychar, yylength(), new Color(38, 230, 0));}
{InstCiclo} { return textColor(yychar, yylength(), new Color(38, 230, 0));}

/* Condicional */
{Condicional} { return textColor(yychar, yylength(), new Color(38, 230, 0));}
{FinCondicional} { return textColor(yychar, yylength(), new Color(38, 230, 0));}

/* Final */
final { return textColor(yychar, yylength(), new Color(38, 230, 0));}

/* Numero erroneo */ 
0{NumeroEnt} { /* Ignorar */ }
0{NumeroFlot} { /* Ignorar */ }

/* Identificador erroneo */
{Identificador} { /* Ignorar */ }

. { /* Ignorar */ }