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
 
public class PrincipalAnotaciones {
 
 public static void main(String[] args) {
 
Personas p = new Personas();
 Class clasePersona = p.getClass();
 Field[] campos= clasePersona.getDeclaredFields();
 for(Field campo: campos) {
 
 Persistencia persistencia=campo.getAnnotation(Persistencia.class);
 System.out.println("Nombre :" +persistencia.campo());
 System.out.println("Tipo :"+ persistencia.tipo());
 
 }
 
}
 
}