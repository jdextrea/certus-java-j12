/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.sesion18;

import java.lang.reflect.Field;

/**
 *
 * @author jdextre
 */

//Mostrar un programa que me permita mostrar las anotaciones
public class PrincipalAnotaciones {
    public static void main(String args[]) {
        Personas objPersona = new Personas();
        Class clasePersona = objPersona.getClass();
        //Aca voy a trabajar con el API Reflection
        Field[] campos = clasePersona.getDeclaredFields(); //Leer las propiedades de la clase
        
        //REcorrer los atributos
        for (Field campo: campos) {
            Persistencia objPersiste = campo.getAnnotation(Persistencia.class);
            System.out.println(objPersiste.campo());
            System.out.println(objPersiste.tipo());
        }
    }
}   
