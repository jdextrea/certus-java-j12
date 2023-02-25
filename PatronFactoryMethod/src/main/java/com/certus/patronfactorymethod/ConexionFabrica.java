
package com.certus.patronfactorymethod;

import com.certus.conexion.IConexion;
import com.certus.conexion.implementacion.ConexionMariaDB;
import com.certus.conexion.implementacion.ConexionMysql;
import com.certus.conexion.implementacion.ConexionVacia;

public class ConexionFabrica {
    
    //El objetivo es devolver una fabrica
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
}
