/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.sistema;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author jdextre
 */
public class mostrarArchivoVal {

    public static void main(String arg[]) throws IOException {
        int i;
        FileInputStream aren;
        try {
            aren = new FileInputStream("entrada.txt");
            
        } catch(FileNotFoundException exc) {
            System.out.println("Archivo no encontrado");
            return;
        } 
        
        do {
            i = aren.read(); //Lee la linea;
            if  (i!=-1) System.out.print((char)i);
                
        } while (i !=-1);
        aren.close();
    }
    
}
