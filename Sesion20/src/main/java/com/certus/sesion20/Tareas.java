/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.sesion20;

/**
 *
 * @author jdextre
 */

public class Tareas implements Runnable{

    public Tareas(String nombre) {
        super();
        this.nombre = nombre;
    }
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void run() {
        for  (int i=0;i<5;i++) {
               System.out.println("Tarea " + nombre);
               //Metodo sleep 
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
        }
    }
    
}