/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.conexion.implementacion;

import com.certus.conexion.ConexionDB;

/**
 *
 * @author jdextre
 */
public class ConexionMysql2 extends ConexionDB {

  //  public ConexionMysql2(String motor) {
  //      super(motor);
   // }

    
    @Override
    public void conectar() {
        System.out.println("conectar mysql");
    }

    @Override
    public void desconectar() {
        System.out.println("desconectar mysql");    }
    
}
