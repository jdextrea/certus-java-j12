/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arreglos;

import java.util.Arrays;

/**
 *
 * @author jdextre
 */
public class arreglosLetras {
    public static void main(String args[]) {
        String nombres[] = {"Zoila","Carlos","Jean","Marcial","Pamela"};
        //Mostrar arreglo sin el metodo de burbuja
        System.out.println(Arrays.toString(nombres));
        burbuja(nombres);
        System.out.println(Arrays.toString(nombres));
    }
    private static void burbuja(String[] arreglo) {
            //Primer recorrido
            String elementosiguiente="";
            for (int x=0;x<arreglo.length;x++) {
                for (int y=0;y<arreglo.length-1;y++) {
                    String elementoactual = arreglo[y];
                        elementosiguiente = arreglo[y+1];
                        if(elementoactual.compareTo(elementosiguiente)>0) {
                            //Intercambiar
                            arreglo[y] = elementosiguiente;
                            arreglo[y+1] = elementoactual;
                        }
                }
            }     
    }
}
