/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.certus.sistema;

import java.io.IOException;

/**
 *
 * @author jdextre
 */
public class Sistema {

    public static void main(String[] args) throws IOException {
        //Mensajes de entrada
        //System.out.println("Codigo sin errores");
        //System.err.println("Cuando se ejecute errores");
        //Crear un programa que me pida ingresar un caracter
       // System.out.println("Ingresar un caracter");
       // int in  = System.in.read(); //Se añade throws IOException
        //Multicasting
        //char c = (char) in;
       // System.out.println("Haz introducido " + in);
        
        //Crear un programa que acepte 5 caracteres
        
        System.out.println("Ingresar 5 caracteres");
        byte[] bufferIn = new byte[5];
        System.in.read(bufferIn);
        char c;
        for  (int i=0;i<bufferIn.length;i++) {
            c = (char) bufferIn[i];
//            System.out.println("Haz ingresado :" + bufferIn[i]);
            System.out.println("Haz ingresado :" + c);
  
        }
        
        
        
        
     
    }
}
