/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.conexion.implementacion;

import com.certus.conexion.IConexion;

/**
 *
 * @author jdextre
 */
public class ConexionVacia implements IConexion {
     @Override 
    public void conectar() {
     System.out.println("No se especifico proveedor");
    }
    
    @Override 
    public void desconectar() {
     System.out.println("No se especifico proveedor");
    }
}
