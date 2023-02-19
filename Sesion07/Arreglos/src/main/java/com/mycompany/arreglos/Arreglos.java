/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arreglos;

/**
 *
 * @author jdextre
 */
public class Arreglos {

    public static void main(String[] args) {
       //PRO 01 CREAR UN ARREGLO  de 5 numeros
       int numeros[] = new int[5];
       numeros[0] = 12;
       numeros[1] = 14;
       numeros[2] = 2;
       numeros[3] = 3;
       numeros[4] = 20;
       
       int total  = numeros.length;
       System.out.println(total);
       //Primera forma para mostrar valores
       for (int x=0;x<total;x++) {
           System.out.println(numeros[x]);
       }
       //Segunda forma es el uso de colecciones
       for (int y: numeros) {
       System.out.println(y);
       }
       
       //Progra 03, crear un programa que permita calcular el promedio, numero mayor y menor de 4 notas
       
    }
}
