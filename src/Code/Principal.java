/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

import java.io.File;

/**
 *
 * @author jherrera
 */
public class Principal {
    public static void main(String[] args) {
        String ruta = "C:/Users/jherrera/Documents/NetBeansProjects/AnalizadorLexico/src/Code/Lexer.flex";
        GenerarLexer(ruta);
    }
    public static void GenerarLexer(String ruta){
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
    }
}
