/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.principal;

/**
 *
 * @author jdextre
 */
public class MetodoThrowable {
    public static void main(String args[]) {
        
        Metodos objMetodos = new Metodos();
        try {
        objMetodos.cadenas();
            
           }
        catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("Mensaje estandar");
                System.out.println(exc);
               System.out.println("Traza de errores");
               exc.printStackTrace();
                
            }
                System.out.println("despues del bloque catch");

        
        }
        
}
