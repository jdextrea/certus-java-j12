
import java.util.function.Function;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jdextre
 */
public class Funciones {
     public static void main(String args[]) { 
         //Crear un programa que me permita calcular el tamaño de una cadena
         String cadena = "Curso de Java";
         Function<String,Integer> largoCadena = str -> str.length();
         System.out.println("Numero de caracteres es : " + largoCadena.apply(cadena));
     }
}
