package com.certus.Librerias;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;
public class ConectaDB {
     ResourceBundle messages = ResourceBundle.getBundle("conexion"); 
    
    private static Connection con=null;
    
    //Constructor privado
    private ConectaDB() {
        String driver = messages.getString("driver");
        String url = messages.getString("url");
        String pwd = messages.getString("clave");            
        String usr = messages.getString("usuario");   
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, usr, pwd);
            System.out.println("Conexion satisfactoria");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }    
    }
        //Crear el metodo estatico
    public static Connection devolverConexion() {
            if (con==null) {
                new ConectaDB();
            }
           return con; 
        }

}
