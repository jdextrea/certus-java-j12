/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.certus.sistemaventas02;

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
public class SistemaVentas02 {

    public static void main(String[] args) throws SQLException {
            String usuario = "root";
            String clave = "mysql";
            String url = "jdbc:mysql://localhost:3308/bdsisventas";
            String sql="";
            //Para la conexion abrir y cerrar
            Connection con;
            //Para ejecutar sentencias
            Statement stm;
            //PAra manejar resultados de consultas (select)
            ResultSet rs;
           
        try {
            //1ro indicar el drive que voy a manejar
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, usuario, clave);
            System.out.println("conexion exitosa");
            
            //Primer ejercio: insertar un registro
            //Guardando la consulta SQL en una variable
            //sql = "insert into clientes values('c04','Adela','Coronel','jm@mail.com','qwer')";
            
            //Segungo ejercicio -> eliminar un cliente
            //sql = "delete from clientes where codcliente='c04'";
            
            //Tercer ejercicio -> modificar un registro
 //           sql = "update clientes set correo='m@mail.com' where codcliente = 'c02'";

             //Ejecuto y lo almaceno en Stm 
                stm = con.createStatement();

             //Ejecuto la sentencia SQL
            //int resultado = stm.executeUpdate(sql);
            /*if (resultado>0) {
            System.out.println("Registro actualizado");
            }
            */   
            //Cuarto ejercicio -> mostrar los registros
            sql = "select * from clientes";
            rs = stm.executeQuery(sql);
            //rs tiene los datos de la tabla o la consulta, registro
            //Avanzar de registro en registro
            rs.next();
            System.out.println("Codigo \t Nombre \t Correo");
            do {
                String codigo = rs.getString("codcliente");
                String nombre = rs.getString("nomcliente");
                String correo = rs.getString("correo");
                System.out.println(codigo + "\t" + nombre + "\t" + correo);
                
            } while (rs.next());
            
            //Cerrar la conexión
            con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SistemaVentas02.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
}
