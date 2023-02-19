/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.mavenproject4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jdextre
 */
public class conexionSql {
    public static void main(String args[]) throws SQLException {
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
            //sql = "insert into clientes values(6,'jose','corolen','jc@mail.com')";
            stm = con.createStatement();
            //int r = stm.executeUpdate(sql);
            sql = "select * from clientes";
            rs = stm.executeQuery(sql);
            rs.next();
            int nro = rs.getRow();
            System.out.println(nro);
           // System.out.println(ultimo);
            System.out.println("Codigo \t Nombre");
                do {
                    String codigo = rs.getString("codcli");
                    String usu = rs.getString("nomcli");
                    System.out.println(codigo + "\t" + usu);
                } while (rs.next());
                
            //System.out.println(r);
            con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(conexionSql.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }
}
