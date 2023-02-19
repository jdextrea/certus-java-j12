/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.sesion18;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 *
 * @author jdextre
 */
public class ReferenciaMetodos {
    public static void main(String[] args) {
		List names = new ArrayList();		
	      names.add("Andrea");
	      names.add("Luisa");
	      names.add("Diego");
	      names.add("Paúl");
	      names.add("Dario");			
	      names.forEach(System.out::println);
              
              
              //recibe un objeto Usuario y devuelve la impresión de sus propiedades.
	      Function<Usuario, String> ftoString= Usuario::toString;
	      System.out.println(ftoString.apply(new Usuario("Santiago","Pardo",18,new Direccion("Nueva Dirección"))));
	}
}
