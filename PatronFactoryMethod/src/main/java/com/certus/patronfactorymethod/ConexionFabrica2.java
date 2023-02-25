/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.patronfactorymethod;

import com.certus.conexion.ConexionDB;
//import com.certus.conexion.IConexion;
//import com.certus.conexion.implementacion.ConexionMariaDB;
import com.certus.conexion.implementacion.ConexionMariaDB2;
//import com.certus.conexion.implementacion.ConexionMysql;
import com.certus.conexion.implementacion.ConexionMysql2;
//import com.certus.conexion.implementacion.ConexionVacia;
import com.certus.conexion.implementacion.MotorType;

/**
 *
 * @author jdextre
 */
public class ConexionFabrica2 {

    public ConexionDB getConexiondb() {
        return conexiondb;
    }

    public MotorType getType() {
        return type;
    }
    
        private ConexionDB conexiondb;
        private MotorType type;

    public ConexionFabrica2(MotorType type) {
        this.type = type;
         }
         
    public void createConexion() {
    if (this.type==MotorType.MYSQL) {
        this.conexiondb = new ConexionMariaDB2();
    } else if(this.type==MotorType.MARIADB) {
        this.conexiondb = new ConexionMysql2();
    
        }
    
    }
   /*
    public IConexion getConexion(String motor) {
        
        if (motor==null) {
        return new ConexionVacia();
        }
        
        if (motor.equalsIgnoreCase("MYSQL")) {
            return new ConexionMysql();
        }
        else if (motor.equalsIgnoreCase("MARIADB")) {
            return new ConexionMariaDB();
        }
        return new ConexionVacia();
    }
    */
    
}
