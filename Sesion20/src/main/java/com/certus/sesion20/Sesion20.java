/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.certus.sesion20;

/**
 *
 * @author jdextre
 */
public class Sesion20 {

    public static void main(String[] args) {
       
        Thread hilo1  = new Thread(new Tareas("hilo 1"));
        Thread hilo2  = new Thread(new Tareas("hilo 2"));
        hilo1.start();
        hilo2.start();
    }
}
