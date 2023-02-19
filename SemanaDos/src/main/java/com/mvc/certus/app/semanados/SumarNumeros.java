/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.certus.app.semanados;
import java.util.Scanner;


/**
 *
 * @author jdextre
 */
public class SumarNumeros {
    public static void main(String args[]) {
        // = asignar, 
        int num1 = 10;
        num1++;
        //num1 = num1 + 1; contadores
        //acumulador
        //resultado = resultado + valor
        System.out.println(num1);
        num1--;
        System.out.println(num1);
        mensaje("Hola");
        sumarNumeros();     
    }
    //Metodo estatico para realizar operaciones matematicas
    static int sumarNumeros () {
        Scanner objSC = new Scanner(System.in);
        //Pedir que ingresar N1
        int n1 = objSC.nextInt();
        int n2 = objSC.nextInt();
        return n1+n2; 
    }

    //Metodo estatico para mostrar mensajes
    static void mensaje(String msg) {
        System.out.println(msg);
    }
}
