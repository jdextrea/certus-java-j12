/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.principal;

/**
 *
 * @author jdextre
 */
public class LanzarExepcion {
    public static void main(String args[]) {
        
        try {
            System.out.println("Antes de lanzar la excepcion");
            throw new ArithmeticException(); //Lanzar de forma manual una excepcion
        } catch (ArithmeticException exc)
                {
           System.out.println("Excepcion capturada");
      
            }
            System.out.println("Despues del bloque try/catch");

    }
}
