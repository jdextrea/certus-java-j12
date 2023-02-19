/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.mavenproject4;

import java.io.IOException;

/**
 *
 * @author jdextre
 */
public class grabarEmpleado {
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Empleado emp;
        librerias obj = new librerias();
        obj.abrir();
        emp = new Empleado("12345678A","Lucas González",30, 1200);
        obj.escribir(emp);
        emp = new Empleado("98765432B","Anacleto Jiménez", 28, 1000);
        obj.escribir(emp);
        obj.cerrar();
        
        Empleado emp2;
        librerias obj2 = new librerias();
        
        obj2.abrirLeer();
           obj2.datos.forEach((n) -> System.out.println(n));

        
       for (int x=0;x<=obj2.datos.size();x++) {
       emp2 = obj2.leer();
          
           System.out.println(emp2.getNif() + "-" + emp2.getNombre() + "-" + emp2.getEdad() + emp2.getSueldo());
          if (x==1) {
          break;
          }
       
       }
        obj2.cerrarI();
    }
}
