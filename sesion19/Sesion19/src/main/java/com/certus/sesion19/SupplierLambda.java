/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.sesion19;

import java.util.function.Supplier;

/**
 *
 * @author jdextre
 */
public class SupplierLambda {
    public static void main(String args[]) {
        //Crear un programa que permite leer los atributos de la clase persona
        //Crear un proveedor de tipo persona.
        Supplier<Persona> supplier = SupplierLambda::llenarPersona;
        //Obtener los datos de la persona en el objproveedor
        Persona per = supplier.get();
        System.out.println(per.getNombre());
        System.out.println(per.getDireccion());   
    }
    public static Persona llenarPersona() {
        return new Persona("Juan","Coronel","Chiclayo");
    }
}
