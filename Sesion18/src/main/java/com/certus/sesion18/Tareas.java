/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.sesion18;

/**
 *
 * @author jdextre
 */
public class Tareas implements Runnable{
    private String nombre;
  
  
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public Tareas(String nombre) {
    super();
    this.nombre = nombre;
  }
  @Override
  public void run() {
    
    
    for (int i=0; i<5;i++) {
      
      System.out.println("tarea "+ nombre);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
    
  }
    
}
