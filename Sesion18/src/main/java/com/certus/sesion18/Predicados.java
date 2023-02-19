/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.sesion18;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
/**
 *
 * @author jdextre
 */
public class Predicados {
    public static void main(String[] args) {
		List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7,8,9,10);

		System.out.println("Números pares:");
		evaluar(listaNumeros, (n)-> n%2 == 0 );

		System.out.println("Números impares:");
		evaluar(listaNumeros, (n)-> n%2 == 1 );

		System.out.println("Números mayores a 5:");
		evaluar(listaNumeros, (n)-> n > 5 );

	
    Function<String, Integer> tamanioCadena = str -> str.length();
    String cadena = "Lambdas tipo funciones";
    System.out.println("Número de caracteres es : " + tamanioCadena.apply(cadena));
    
    }
	public static void evaluar(List<Integer> listaNumeros, Predicate<Integer> predicado) {
		for(Integer n: listaNumeros)  {
                    
			if(predicado.test(n)) {
				System.out.print(n + " ");
			}
		}
		System.out.println();
	}
}
