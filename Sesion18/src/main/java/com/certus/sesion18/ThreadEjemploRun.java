/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.sesion18;

/**
 *
 * @author jdextre
 */
public class ThreadEjemploRun implements Runnable{
    
    
    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++)
            System.out.println(i + " " +
                Thread.currentThread().getName());
            System.out.println("Termina thread " +
                Thread.currentThread().getName());
    }
    
    public static void main (String [] args) {
        new Thread (new ThreadEjemploRun(), "Pepe").start();
        new Thread (new ThreadEjemploRun(), "Juan").start();
        System.out.println("Termina thread main");
 } 
}
