/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.conexion;

/**
 *
 * @author jdextre
 */
public abstract class ConexionDB {

    /*public ConexionDB(String motor) {
        this.motor = motor;
    }
     private String motor;
*/
      public abstract void conectar();

    public abstract void desconectar();
}
