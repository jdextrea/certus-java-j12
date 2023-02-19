/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.sistemasp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 *
 * @author jdextre
 */
public class Conecta {
    
    ResourceBundle messages = ResourceBundle.getBundle("conexion");
    private String usuario = messages.getString("usuario");
    private String clave = messages.getString("clave");
    private String url = messages.getString("url");
    Connection con;
    ResultSet rs;
    CallableStatement stmt;
    
    public void cargarDriver() {
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void conectarDB() throws SQLException {
        con = DriverManager.getConnection(url, usuario,clave);
    }
    
    public void listaClientesSP () throws SQLException {
        String Query  = "{CALL listarCliente()}";
        stmt = con.prepareCall(Query);
        rs = stmt.executeQuery();
    }
     
    
    public void insertarRegistrosSP (Connection cn, Integer cod, String nom, String correo, String clave) throws SQLException {
        String Query  = "{CALL insertarCliente(?,?,?,?)}";
        stmt = cn.prepareCall(Query);
        stmt.setInt(1, cod);
        stmt.setString(2, nom);
        stmt.setString(3, correo);
        stmt.setString(4, clave);
        rs = stmt.executeQuery();
    }
    
}
