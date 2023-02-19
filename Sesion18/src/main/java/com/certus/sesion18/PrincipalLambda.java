/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.sesion18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

/**
 *
 * @author jdextre
 */
public class PrincipalLambda {
    
    public static void main(String args[]) {
        System.out.println("Esto no es lambda");
        //Ejercicio Mostrar sin parametros
        //ISaludar objSaludar = (n)->System.out.println(n);
        //objSaludar.saludar("Jymmy");
        
        //Ejercicio sumar dos numeros
        ISaludar objSaludar = (n1,n2) -> {
                int resultado = n1+n2;
                System.out.println(resultado);
        };
        objSaludar.sumar(6, 8);
        
        //Crear un programa que permita mostrar los valores de un arreglo
        List features = Arrays.asList("Abstracto","Dificil","Soporta varios lengujes","Poderoso");
        features.forEach(n -> System.out.println(n));
        
        
        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).forEach(
				n -> System.out.print(n + " "));
        
        
        ArrayList<Integer> mayores = (ArrayList<Integer>) Arrays
				.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
				// se crea el stream
				.stream()
				//filtro para obtener los números mayores a 5 y dentro se utiliza la expresión lambda (x -> x > 5)
				.filter(x -> x > 5)
				//pone los elementos que se filtró dentro de una nueva lista, dentro se utiliza una expresión lambda  
				.collect(
						Collectors.toCollection(() -> new ArrayList<Integer>()));

		mayores.forEach(e -> System.out.println(e));
        
        
                //Predicados
                 Predicate<String> predicate = (s) -> s.length() > 0;
        //evalua si la cadena "predicado" es mayor a 0
        System.out.println(predicate.test("predicado")); // true
        //niega la valor de la evaulación
        System.out.println(predicate.negate().test("predicado")); // false
        
        //Funciones
        Function<Integer, Integer> suma = x -> x + 8;
        System.out.println("La suma de 5 + 8: " + suma.apply(5));
        
        Supplier<String> cadena = () -> "Ejemplo de Proveedor";
        System.out.println(cadena.get());
        
        Consumer<Persona> persona = (p) -> System.out.println("Hola, " + p.getNombre());
        persona.accept(new Persona("Jymmy", "Dextre","Lima"));

        
    }
    
   
}
