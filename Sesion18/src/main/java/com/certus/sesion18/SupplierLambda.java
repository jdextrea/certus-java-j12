/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.sesion18;

import java.util.function.Consumer;
import java.util.function.Supplier;
/**
*
* @author jdextre
*/
public class SupplierLambda {
 public static void main(String[] args) {
 //se crea un proveedor de tipo Persona, el cual obtiene una persona
Supplier<Persona> supplier = SupplierLambda::llenarPersona;
 //obtiene desde el proveedor la persona y la asigna a per
Persona per = supplier.get();
 // imprime el nombre
System.out.println(per.getNombre());
 System.out.println(per.getApellido());


 Consumer<Persona> persona = (p) -> System.out.println("Hola, " +
p.getNombre());
 persona.accept(new Persona("Jorge", "Valladares","Quito"));
}
// asigna los nombres y dirección a la persona
public static Persona llenarPersona(){
return new Persona("Pablo", "Andrade", "Loja");
}
}

