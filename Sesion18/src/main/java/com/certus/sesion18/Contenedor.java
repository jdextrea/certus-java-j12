/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.sesion18;

//La sincronización que permite a productor y consumidor operar correctamente, es decir, la que
//hace que consumidor espere hasta que haya un dato disponible, y que productor no genere
//uno nuevo hasta que haya sido consumido esta en la clase Contenedor, se consigue de la
//siguiente forma:
public class Contenedor {
    //Variable dato que contiene el valor que se almacena con put y se devuelve con get.
    private int dato;
    //Variable hayDato es un flag interno que indica si el objeto contiene dato o no
    private boolean hayDato = false;
    
    /*
    En el método put, antes de almacenar el valor en dato hay que asegurarse de que el valor 
    anterior ha sido consumido. 
    Si todavía hay valor (hayDato es true) se suspende la ejecución del hilo mediante el método wait. 
    Invocando wait (que es un método de la clase Object) se suspende el hilo indefinidamente hasta que alguien 
    le envíe una 'señal' con el método notify o notifyAll (esto debemos programar). 
    Cuando esto se produce (en este caso, la señalización mediante notify lo
    produce el método get) el método continua, asume que el dato ya se ha consumido, almacena
    el valor en dato y envía a su vez un notifyAll para notificar a su vez que hay un dato disponible
    */
    public synchronized int get() {
        while (hayDato == false) {
        try {
        // espera a que el productor coloque un valor
        wait();
        } catch (InterruptedException e) { }
        }
        hayDato = false;
        // notificar que el valor ha sido consumido
        notifyAll();
        return dato;
    }
    /*Por su parte, el método get chequea si hay dato disponible (no lo hay si hayDato es false) y
    si no lo hay espera hasta que le avisen (método wait). Una vez ha sido notificado (desde el
    método put) cambia el flag y devuelve el dato, pero antes notifica a put de que el dato ya ha
    sido consumido, y por tanto se puede almacenar otro
    */
    //La sincronización se lleva a cabo pues usando los métodos wait y notifiAll.

    public synchronized void put(int valor) {
        while (hayDato == true) {
            try {
            // espera a que se consuma el dato
            wait();
            } catch (InterruptedException e) { }
            }
        dato = valor;
        hayDato = true;
        // notificar que ya hay dato.
        notifyAll();
    }
}
