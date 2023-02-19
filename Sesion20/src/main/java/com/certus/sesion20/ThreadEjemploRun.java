/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.sesion20;

/**
 *
 * @author jdextre
 */
public class ThreadEjemploRun implements Runnable{
        @Override
        public void run() {
                for  (int i = 0 ; i<10;i++) {
                    System.out.println(i + " " + Thread.currentThread().getName());
                     try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    e.printStackTrace();
               }
                }
           
        }
        public static void main(String args[]) {
            //ThreadEjemploRun ejemplo = new ThreadEjemplo(); 
            //Thread thread = new Thread (ejemplo, "Pepe"); 
            //thread.start();
            new Thread (new ThreadEjemploRun(),"Hilo 1").start();
            new Thread (new ThreadEjemploRun(),"Hilo 2").start();
        }
}
