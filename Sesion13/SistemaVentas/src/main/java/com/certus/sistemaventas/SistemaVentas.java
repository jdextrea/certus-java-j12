/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.certus.sistemaventas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jdextre
 */
public class SistemaVentas {
    
    public static void main(String[] args) throws SQLException {
     String usuario="root";
     String clave = "mysql";
     String url = "jdbc:mysql://localhost:3308/bdventas";
     Connection con;
        try {
            //El driver a utilizar
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, usuario, clave);
            System.out.println("Conexion exitosa");
            con.close();
        } catch (ClassNotFoundException ex) {
            
            Logger.getLogger(SistemaVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
