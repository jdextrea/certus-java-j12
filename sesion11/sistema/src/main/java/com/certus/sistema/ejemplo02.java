/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.sistema;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author jdextre
 */
public class ejemplo02 {
    public static void main(String args[]) throws IOException {
        System.out.println("Introducir algo");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        System.out.println("Haz introducido " + s);
        
        BufferedReader blinea  = new BufferedReader( new FileReader("documentos.txt"));
        String  linea = blinea.readLine();
        
        while (linea!=null) {
            System.out.println(linea);
            linea = blinea.readLine();
        
        }
        
        
        
        
    }
}
