/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.sesion18;

/**
 *
 * @author jdextre
 */
public class Productor extends Thread {
    //Creamos la variable miembro del Productor
    private Contenedor contenedor;//Referencia a un objeto contenedor y sirve para almacenar los datos que va produciendo
    //Constructor
    public Productor (Contenedor c) {
        contenedor = c;
        }
    //Vamos a generar un valor de forma aleatoria y colocaremos ese dato con el metodo put en el contenedor
    public void run() {
        for (int i = 0; i < 10; i++) {
        contenedor.put(i);
        
        System.out.println("Productor. put: " + i);
            try {
                //Espera una cantidad de tiempo aleatorio (hasta 100 ms) con el metodo sleep, 
                //Productor no se preocupa de si el dato ya ha sido consumido o no. Simplemente lo coloca en el contenedor.
            sleep((int)(Math.random() * 100));
            } catch (InterruptedException e) { }
        }
    }
}