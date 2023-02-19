/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jdextre
 */

public class Contenedor {
    //Para obtener el valor
    private int dato;
    //Para ver si el hilo tienen un valor
    private boolean hayDato = false;
    public synchronized int get() {
        while(hayDato==false) {
            //El hilo va estar en espera que el productor coloque un valor
          try {
                wait();
            } catch (InterruptedException e) {} 
        }
        hayDato=false;
        //Notificio que el valor ha sido consumido
        notifyAll();
        return dato;

    }

    public synchronized void put(int valor) {
        while(hayDato==true) {
            //El hilo va estar en espera que el productor coloque un valor
          try {
                wait();
            } catch (InterruptedException e) {} 
        }
        dato = valor;
        hayDato=true;
        //Notifico que hay un dato
        notifyAll();
    }
}