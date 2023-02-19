/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.sistema;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author jdextre
 */
public class menuSistema {
    //Paso 1 crear dos variables de tipos objetos estativos
    private static InputStreamReader isr;
    private static BufferedReader br;
    public static void main(String args[]) throws IOException {
        isr = new InputStreamReader(System.in);
        br  = new BufferedReader(isr);
        menu();
        loop();
    }
    
    private static void menu() {
        System.out.println("------------------------------\n" 
                + "Eligue una opción:\n"
                + "[a]Sumar\n"
                + "[b]Restar\n"
                + "[c]Multiplicar\n"
                + "[d]Dividir\n"
                + "-------------\n"
                + "[m] Mostrar el menu\n"
                + "[x] Salir del programa\n");
    }
    
    private static void loop() throws IOException {
        String s = "";
        //s = br.readLine();
        while (true) {
            //Se almacena lo que ingreso por teclado
            s = br.readLine();
            
            if (s.equalsIgnoreCase("a") == true) {
                suma();
            } else if (s.equalsIgnoreCase("b")== true) {
                //resta();
            } else if (s.equalsIgnoreCase("c")== true) {
                //multiplicar();
            } else if (s.equalsIgnoreCase("d")== true) {
                //dividir();
            } else if (s.equalsIgnoreCase("m") == true) {
                menu();
            } else if (s.equalsIgnoreCase("x") == true) {
                break;
            } else {
                System.out.println("Opcion incorrecta. Escribir m para  ver el menu de opciones");
            }
            
        }
    }
    
    private static void suma() throws IOException {
        int n1,n2,resultado;
        System.out.println("Introduce un valor");
            n1 = Integer.parseInt(br.readLine());
            n2 = Integer.parseInt(br.readLine());
            resultado  = n1 + n2;
        System.out.println("Resultado de la suma es " + resultado + "\n -------------------\n");
    }
    
}
