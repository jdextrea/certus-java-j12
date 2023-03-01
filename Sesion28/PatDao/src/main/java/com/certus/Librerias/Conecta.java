/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.Librerias;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 *
 * @author jdextre
 */
public class Conecta {
    protected Connection conexion;
     ResourceBundle messages = ResourceBundle.getBundle("conexion");
     String driver = messages.getString("driver");
     String url = messages.getString("url");
     String pwd = messages.getString("clave");            
     String usr = messages.getString("usuario");  
        public void conectar() throws SQLException {
            try {
                Class.forName(driver);
                conexion = DriverManager.getConnection(url, usr, pwd);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        public void cerrar () throws SQLException {
            if  (conexion!=null) {
                if (!conexion.isClosed()) {
                    conexion.close();
                }
            }
        }
}
