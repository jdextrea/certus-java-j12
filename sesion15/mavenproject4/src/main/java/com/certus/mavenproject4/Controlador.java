/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.mavenproject4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jdextre
 */
public class Controlador {
    private String usuario = "root";
    private String clave = "mysql";
    private String url = "jdbc:mysql://localhost:3308/bdsistemas";
    Connection con;
    Statement stm;
    ResultSet rs;
    PreparedStatement pstm;
    //cargar el driver de la base de datos
    public void cargarDriver() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    //Conectarme a una base de datos
    public void conectarDB() throws SQLException {
        con = DriverManager.getConnection(url,usuario,clave);
    }
    
    public void ejecutarSQL(String sql) throws SQLException {
    stm = con.createStatement(); //Insert, Delete, Udapte
    stm.executeUpdate(sql);
    }
    
    //Contar registros en una sentencia sql
    public int contarRegistros(String sql) throws SQLException {
        stm = con.createStatement();
        rs = stm.executeQuery(sql); //Select
        int contador=0;
        while (rs.next()) {
        contador++;
        }
        return contador++;
    }
    
    public int validarLogin(String correo, String clave) throws SQLException {
    String sql = "select * from cliente where correo=? and clave=?";
    pstm = con.prepareStatement(sql);
    pstm.setString(1, correo);
    pstm.setString(2, clave);
    rs = pstm.executeQuery(); //Select
   
    int contador= 0;
    while (rs.next()) {
    contador++;
    }
    return contador;   
    }
    
    public void mostrarRegistros(String sql) throws SQLException {
        stm = con.createStatement();
        rs = stm.executeQuery(sql);
        
    }
    
    
}
