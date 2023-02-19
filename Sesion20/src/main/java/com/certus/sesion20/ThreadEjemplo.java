/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.sesion20;
/**
 *
 * @author jdextre
 */
public class ThreadEjemplo extends Thread{
    
    public ThreadEjemplo (String str) {
        super(str);
    } 
    
    @Override
    public void run() {
        for (int i=0;i<10;i++) {
            //getName metodo para obtener el nombre del hilo que voy a crear
            System.out.println(i + " " + getName());
           // System.out.println("Termina el hilo " + getName());   
        }   
    }
    public static void main(String args[]) {
        new ThreadEjemplo("Hilo 1").start();
        new ThreadEjemplo("Hilo 2").start();
        
    }
}