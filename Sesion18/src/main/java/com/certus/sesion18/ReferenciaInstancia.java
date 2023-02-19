/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.sesion18;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.function.Function;
import java.util.function.Supplier;

public class ReferenciaInstancia {
     public static void main(String[] args) {
    //recibe un objeto Usuario y devuelve la impresión de sus propiedades.
	      Function<Usuario, String> ftoString= Usuario::toString;
	      System.out.println(ftoString.apply(new Usuario("Santiago","Pardo",18,new Direccion("Nueva Dirección"))));
              
              
              // referencia a mensajes
		LinkedList<Integer> lista = new LinkedList<Integer>(Arrays.asList(1, 2, 3));
		Supplier<Integer> funcion3 = lista::removeLast;
		System.out.println(funcion3.get()); // 3
		lista.forEach(System.out::println);
     }
 }
