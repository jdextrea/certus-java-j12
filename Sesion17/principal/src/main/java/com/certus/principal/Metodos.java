/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.principal;

/**
 *
 * @author jdextre
 */
public class Metodos {
    
    public void cadenas() {
         String[] nombre = new String[2];
        
            System.out.println("Antes que se genere la excepción");
          //Esto va generar una excepcion de tipo indice fuera de limites
            nombre[0] = "Luis";
            nombre[1] = "Luis2";
            nombre[2] = "Luis3";
            nombre[3] = "Luis4";
            System.out.println("Este mensaje no se va mostrar");
            
            
    }
}
    
