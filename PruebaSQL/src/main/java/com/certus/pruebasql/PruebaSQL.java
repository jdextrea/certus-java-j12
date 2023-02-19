/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.certus.pruebasql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jdextre
 */
public class PruebaSQL {

    public static void main(String[] args) throws SQLException {
       String usuario="root";
        String clave="mysql";
        String url="jdbc:mysql://localhost:3308/bdventas";
        String sql="";
        Connection con;
        Statement stm;
        ResultSet rs;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, usuario, clave);
            System.out.println("Conexion exitosa");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PruebaSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
         
   
    }     
}
