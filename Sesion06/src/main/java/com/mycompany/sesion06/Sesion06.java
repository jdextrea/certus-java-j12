/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sesion06;

import java.util.Calendar;

/**
 *
 * @author jdextre
 */
public class Sesion06 {

    public static void main(String[] args) {
        //CREar un programa que muestra 10 veces el hola mundo
        //x=x=1;
        //x++; contador
        //x=x+resultado;
        //x+=resultado; acumulador
        
        for (int x=1;x<=10;x++) {
        System.out.println("Hola mundo: "  + x);
        }
        //Como indicar que es diferente <>, !=
        //Crear un programa que permita mostrar y sumar los 10 primero numeros impares
        //Calcular numero impares
        int nImpar=0;
        int nPares=0;
        int par=0;
        int resultadoImpares=0;
        for (int y=1;y<=21;y++) {
            par = y%2; //Calcular el residuo
                if (par!=0) {
                System.out.println(y);
                nImpar++;
                //resultadoImpares=resultadoImpares + y;
                resultadoImpares+=y;
                } else {
                nPares++;
                }
        }
        System.out.println("Numeros impares son: " + nImpar);
        System.out.println("Numeros impares son: " + nPares);
        System.out.println("Suma de impares: " + resultadoImpares);
        
       //Programa que permita mostrar los primeros 5 multiplos de 7
       for (int c=1;c<=5;c++) {
           System.out.println(c*7);
       }
       //Crear un programa que muestra la tabla de multiplicar del numero 10
       //crear una constante
       final int num=10;
       int totalN=1;
        for (int z=1;z<=12;z++) {
            //10*1=10;
            //10*2=20;
            //..
            //10*12=120
            totalN=z*10;
            System.out.println(num + "*" + z + "=" + totalN);
        }
        //Crear un programa que permita realizar la tabla de multiplicción de cualquier 
        //numero y que pida por teclado.
        //CRear un programa que muestra los 10 primeros numeros usando while
        int v=0;
        while (v<10) {
            v++;
            System.out.println(v);
            if (v==5) {
            System.out.println("se romple el bucle");
            break;
            }
        }
        int g=0;
        while (true) {
            g++;
            System.out.println(g);
                if (g==5) {
                break;
                }
        }
        //Crear un programa que pida por teclado: Producto, cantidad y precio y que pregunte
        //si desea continuar, NO: total a pagar.
        // Crear un programa que permita calcular el numero el dia de la semana
        //instancia en on objeto cal 
        Calendar cal = Calendar.getInstance();
        //fijo el tiempo actual en milisegundos
        cal.setTimeInMillis(System.currentTimeMillis());
        // obtener el dia de la semana
        int dia = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(dia);
        switch(dia) {
            case  1:
               System.out.println("Domingo");
                break;
            case  2:
               System.out.println("Lunes");
                break;
            case  3:
               System.out.println("Martes");
                break;
            case  4:
               System.out.println("Miercoles");
                break;
            case  5:
               System.out.println("Jueves");
                break;
            case  6:
               System.out.println("Viernes");
                break;
            case  7:
               System.out.println("Sabado");
                break;
        }   
        int n=0;
        do {
            n++;
            System.out.println(n);
        } while (n<10);
        
        
        //Usar Break y continue
        Calendar cal2 = Calendar.getInstance();
        //fijo el tiempo actual en milisegundos
        cal2.setTimeInMillis(System.currentTimeMillis());
        // obtener el dia de la semana
        int dia2 = cal2.get(Calendar.DAY_OF_WEEK);
            for (int t=1;t<=7;t++) {
                if (dia2==t) {
                    System.out.println("Hoy es el " + t + " dia de la semana");
                    break;
                }
            }
        Calendar cal3 = Calendar.getInstance();
        //fijo el tiempo actual en milisegundos
        cal3.setTimeInMillis(System.currentTimeMillis());
        // obtener el dia de la semana
        int dia3 = cal3.get(Calendar.DAY_OF_WEEK);
           for (int h=1;h<=7;h++) {
               if (dia3==h) {
               continue;
               }
               System.out.println("Dia " + h);
           }
    }
}
