/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.sesion18;

/**
 *
 * @author jdextre
 */
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

//Crear un programa que permita imprimir en consola mayuscula o minucula los atributos que se indique
//Libro.java, Imprimible.java
public class PrincipalApi {
    public static void main(String args[]) {
    
        List<Object> lista = new ArrayList<Object>();
        lista.add(new Libro("cien años de soledad","gabriel garcia marquez"));
        procesar(lista);
    }
    
    public static void procesar(List<Object> lista) {
        try{        //Recorrer la lista de objetos
                for (Object o: lista) {
                //Por cada objeto que vamos las propiedades o campos getDeclaredFields;
                    Field[] propiedades = o.getClass().getDeclaredFields();
                    //System.out.println(propiedades.length);
                    //Validar si los campos tienen anotaciones y eso lo realizo con getAnotation
                    for  (Field propiedad: propiedades) {
                        Imprimible imprimir = propiedad.getAnnotation(Imprimible.class);
                            //System.out.println(imprimir);
                            if (imprimir!=null) {
                                //PReguntar los que tienen mayuscula true
                                if (imprimir.mayusculas()) {
                                    System.out.println(propiedad.get(o).toString().toUpperCase());
                                } else {
                                    System.out.println(propiedad.get(o).toString());
                                
                                }
                            }
                    } //Fin del for2
                } //Fin del for1
                
        } catch (IllegalAccessException exc) {
            exc.printStackTrace();
        }
    }
}
