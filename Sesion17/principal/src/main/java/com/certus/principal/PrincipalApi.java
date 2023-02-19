/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.principal;

/**
 *
 * @author jdextre
 */

import java.lang.reflect.Field;
//import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class PrincipalApi {
    
    public static void main(String[] args) {
 
        List<Object> lista = new ArrayList<Object>();
        lista.add(new Libro("Danza con Lobos", "Jose Arturo"));
        procesar(lista);
 
    }
    
    public static void procesar(List<Object> lista) {
    try {    //Recorremos la lista de objetos
        for (Object o : lista) {
            //Por cada objeto que tenemos leemos las propidades (campos) que tiene getDeclaredFields
            Field[] propiedades =  o.getClass().getDeclaredFields();
            //System.out.println(propiedades.length); cantidad de atributos
            //Validar si los campos tienen anotaciones y eso lo hago con getAnotation
                for (Field propiedad : propiedades) {
                    Imprimible imprimir = propiedad.getAnnotation(Imprimible.class);
                    //System.out.println(imprimir); Ver quienes tienen anotaciones
                    //Comprobamos las que son diferentes de null
                    if (imprimir!=null) { 
                        //comprobamos cuales son mayusculas
                        if (imprimir.mayusculas()) {
                            System.out.println(propiedad.get(o).toString().toUpperCase());
                        } else {
                            System.out.println(propiedad.get(o).toString());
                        }
                    }
                        
                } //For 2
          } //For 1
        
        } catch(IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
          catch(IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
    
       }
        
    }

