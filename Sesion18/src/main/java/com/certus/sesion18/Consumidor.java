/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.sesion18;

/**
 *
 * @author jdextre
 */
public class Consumidor extends Thread {
    //El constructor es equivalente al del Productor
    
    private Contenedor contenedor;
    public Consumidor (Contenedor c) {
        contenedor= c;
    }
    //Creo el metodo Run
    public void run() {
        //Variable para recuperar el valor
    int value = 0;
        for (int i = 0; i < 10; i++) {
            //Recupero el valor
        value = contenedor.get();
            //Mostrar por consola.
        System.out.println("Consumidor. get: " + value);
        }
    }
}