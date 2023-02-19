/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.principal;

/**
 *
 * @author jdextre
 */
public class ExepcionSimple {
    public static void main(String args[]) {
        String[] nombre = new String[2];
        try {
            System.out.println("Antes que se genere la excepción");
            nombre[0] = "Luis";
            nombre[1] = "Luis2";
            nombre[2] = "Luis3";
            nombre[3] = "Luis4";
            
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Indice fuera de los limites");
            System.out.println(exc.getMessage());

        }
            System.out.println("Despues que se genera la excepcion");
        
    }
}
