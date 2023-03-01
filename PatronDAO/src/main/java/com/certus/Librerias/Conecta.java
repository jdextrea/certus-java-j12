/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.Librerias;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Conecta {
    
    protected Connection conexion;
    ResourceBundle messages = ResourceBundle.getBundle("conexion");
    private String usuario = messages.getString("usuario");
    private String clave = messages.getString("clave");
    private String url = messages.getString("url");
    
    
    public void conectar() throws SQLException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion  = DriverManager.getConnection(url,usuario,clave);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
    }
    
    public void cerrar() throws SQLException {
            if (conexion!=null) {
                if (!conexion.isClosed()) {
                conexion.close();
                }
            }
        }
    
 }