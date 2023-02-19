/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.sesion18;

/**
 *
 * @author jdextre
 */
//
public class ProducTorConsumidorTest {
public static void main(String[] args) {
    //Creo los tres objetos.
    Contenedor c = new Contenedor ();
    Productor produce = new Productor (c);
    Consumidor consume = new Consumidor (c);
    //empiezan a ejecutar los hilos, asignar recursos, ....y se inician de los dos ultimos
    produce.start();
    consume.start();
    }
}
