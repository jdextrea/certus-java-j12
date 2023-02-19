/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.sesion18;

/**
 *
 * @author jdextre
 */
public class PrincipalTareas{
    public static void main(String args[]) {
    //Tareas objTarea = new Tareas("hilo1");
    //objTarea.run();
    Thread hilo1 = new Thread(new Tareas("hilo 1"));
    Thread hilo2 = new Thread(new Tareas("hilo 2"));
    
    hilo1.start();
    hilo2.start();
    
    }
}
