package com.certus.sistemasp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jdextre
 */
public class SistemaSP {

    public static void main(String[] args) throws SQLException {
        ResultSet rs;
    CallableStatement stmt;
        Conecta objConecta = new Conecta();
        objConecta.cargarDriver();
        objConecta.conectarDB();
        objConecta.listaClientesSP();
        objConecta.rs.next();
        System.out.println(objConecta.rs.getString("nomcli") + " - " + objConecta.rs.getString("correo"));
        
        
        
    }
}
