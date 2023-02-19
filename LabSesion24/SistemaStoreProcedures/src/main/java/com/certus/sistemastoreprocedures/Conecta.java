/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.sistemastoreprocedures;



import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jdextre
 */
/*
COn Parametro de entrada
DELIMITER $$
CREATE PROCEDURE getCliente(IN cod_cli INT)
BEGIN
    SELECT * 
    FROM cliente
    WHERE codcli = cod_cli;
END$$
call getCliente(1);
drop procedure obtenerCliente

Sin parametro
DELIMITER $$
CREATE PROCEDURE listarCliente()
BEGIN
    SELECT * 
    FROM cliente;
END $$
call listarCliente();

//Insertar cliente
DELIMITER $$
CREATE PROCEDURE insertar_Cliente(IN cod_cli INT, IN nom_cli varchar(20), IN correo_cli varchar(20), IN clave_cli varchar(20))
BEGIN
   INSERT INTO cliente values(cod_cli,nom_cli,correo_cli,clave_cli);
END$$


*/



public class Conecta {
    
     ResourceBundle messages = ResourceBundle.getBundle("conexion");
    private String usuario = messages.getString("usuario");
    private String clave = messages.getString("clave");
    private String url = messages.getString("url");
    Connection con;
    Statement stm;
    ResultSet rs;
    PreparedStatement pstm;
    CallableStatement stmt;
    
    public void cargarDriver() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conecta.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    //Conectarme a una base de datos
    public void conectarDB() throws SQLException {
        con = DriverManager.getConnection(url,usuario,clave);
    }
    
    public void mostrarRegistrosSP (String codigo) throws SQLException   {
        
        String query = "{CALL getcliente(?)}";
        stmt = con.prepareCall(query);
        stmt.setString(1, codigo);
        rs = stmt.executeQuery();
        
    }
    
    public int validarClienteSP (String correo, String clave) throws SQLException   {
        
        String query = "{CALL validarCliente(?,?)}";
        stmt = con.prepareCall(query);
        stmt.setString(1, correo);
        stmt.setString(2, clave);
        rs = stmt.executeQuery();
        int contador= 0;
        while (rs.next()) {
             contador++;
            }
        return contador;   
    }
    
             
    public void listarRegistrosSP () throws SQLException   {
        
        String query = "{CALL listarCliente()}";
        stmt = con.prepareCall(query);
        rs = stmt.executeQuery();
        
    }
    
    public void insertarRegistrosSP (Integer cod, String nom,String correo, String clave) throws SQLException {
        String query = "{CALL insertar_Cliente(?,?,?,?)}";
        stmt = con.prepareCall(query);
        stmt.setInt(1, cod);
        stmt.setString(2, nom);
        stmt.setString(3, correo);
        stmt.setString(4, clave);
        rs = stmt.executeQuery();
        
    }
    
}
