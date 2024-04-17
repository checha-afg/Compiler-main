
import compilerTools.ErrorLSSL;
import compilerTools.Token;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author psche
 */
public class ExportadorHTML { //exportamos data, verificar datos

    public static void exportErrorsToHTML(ArrayList<ErrorLSSL> errors, String outputPath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            writer.write("<html><head><title>Bitácora de Errores</title></head><body><h1>Bitácora de Errores</h1>");
            writer.write("<ul>");
            for (ErrorLSSL error : errors) {
                writer.write("<li>" + error.toString() + "</li>");
            }
            writer.write("</ul></body></html>");
        } catch (IOException e) {
            System.err.println("Error al exportar la bitácora de errores a HTML: " + e.getMessage());
        }
    }

    public static void exportTokensToHTML(ArrayList<Token> tokens, String outputPath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            writer.write("<html><head><title>Bitácora de Tokens</title></head><body><h1>Bitácora de Tokens</h1>");
            writer.write("<table border='1'><tr><th>Componente Léxico</th><th>Lexema</th><th>Línea</th><th>Columna</th></tr>");
            for (Token token : tokens) {
                writer.write("<tr><td>" + token.getLexicalComp() + "</td><td>" + token.getLexeme() + "</td><td>" + token.getLine() + "</td><td>" + token.getColumn() + "</td></tr>");
            }
            writer.write("</table></body></html>");
        } catch (IOException e) {
            System.err.println("Error al exportar la bitácora de tokens a HTML: " + e.getMessage());
        }
    }

    public static void exportSymbolTableToHTML(HashMap<String, String> symbolTable, String outputPath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            writer.write("<html><head><title>Tabla de Símbolos</title></head><body><h1>Tabla de Símbolos</h1>");
            writer.write("<table border='1'><tr><th>Identificador</th><th>Valor</th></tr>");
            for (Map.Entry<String, String> entry : symbolTable.entrySet()) {
                writer.write("<tr><td>" + entry.getKey() + "</td><td>" + entry.getValue() + "</td></tr>");
            }
            writer.write("</table></body></html>");
        } catch (IOException e) {
            System.err.println("Error al exportar la tabla de símbolos a HTML: " + e.getMessage());
        }
    }
}

