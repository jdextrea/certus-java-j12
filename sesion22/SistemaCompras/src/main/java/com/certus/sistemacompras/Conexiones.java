/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.sistemacompras;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jdextre
 */
public class Conexiones {
    
    private String clave;
    
    
    public void conecta() throws SQLException {
    String usuario="root";
     String token = this.clave;
     String url = "jdbc:mysql://localhost:3308/bdventas";
     Connection con;
        try {
            //El driver a utilizar
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, usuario, token);
            JOptionPane.showMessageDialog(null,"Conexión correcta");
            con.close();
        } catch (ClassNotFoundException ex) {
            
            Logger.getLogger(SistemaCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
