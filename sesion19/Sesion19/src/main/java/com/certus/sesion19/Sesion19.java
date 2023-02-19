/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.certus.sesion19;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
public class Sesion19 {

    public static void main(String[] args) {
        ILambda objLambda = (n1,n2) -> {
            int resultado  = n1 + n2;
            System.out.println(resultado);
        };
        //Llamar al metodo abstracto
        objLambda.sumar(4, 5);
        
        //Crear un programa que me permita indicara si el tamaño de una longitud de cadena es mayor a 0
        //Predicados
        Predicate<String> predicate = (s) -> s.length()>0; 
        System.out.println(predicate.test("predicado"));
        System.out.println(predicate.negate().test("predicado"));
        
        //funciones
        Function<Integer, Integer> objsuma = (x) -> x+8;
        System.out.println("La suma de 5 + 8 = " + objsuma.apply(5));
        
                
        //Proveedores
        Supplier<String> objcadena = () -> "Ejemplo de un mensaje";
        System.out.println(objcadena.get());
        
        //Consumidor
        //Crear un programa que muestro el nombre del objeto Persona
        Consumer<Persona> objPersona = (p) -> System.out.println("El nombre es: " + p.getNombre());
        objPersona.accept(new Persona("Juan","Coronel","Chiclayo"));
        
        
        
    }
}