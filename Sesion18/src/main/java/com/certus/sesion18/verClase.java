/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.sesion18;

import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 *
 * @author jdextre
 */
public class verClase {
    public static void main(String args[]) {
    Predicate<String> predicate = (s) -> s.length() > 0;
//evalua si la cadena "predicado" es mayor a 0
System.out.println(predicate.test("predicado")); // true
//niega la valor de la evaulación
System.out.println(predicate.negate().test("predicado")); // false


Supplier<String> cadena = () -> "Ejemplo de Proveedor";
System.out.println(cadena.get());


    }
}
