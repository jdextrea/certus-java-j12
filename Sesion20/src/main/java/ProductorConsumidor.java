/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jdextre
 */

public class ProductorConsumidor {
    
public static void main(String args[]) {
    //Instanciar lo tres objetos
    Contenedor c = new Contenedor();
    Productor produce = new Productor(c);
    Consumidor consume = new Consumidor(c);
    
    produce.start();
    consume.start();

    }
}