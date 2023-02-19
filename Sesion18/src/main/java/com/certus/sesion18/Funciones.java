/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.sesion18;

import java.util.function.Function;
import java.util.function.Supplier;
public class Funciones {
     public static void main(String[] args) {
            Function<String, Integer> tamanioCadena = str -> str.length();
            String cadena = "Lambdas tipo funciones";
            System.out.println("Número de caracteres es : " + tamanioCadena.apply(cadena));
            
            
            Supplier<String> cadena2 = () -> "Ejemplo de Proveedor";
            System.out.println(cadena2.get());
     }
}
