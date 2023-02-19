/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.certus.sistemastoreprocedures;

import java.sql.SQLException;
/**
 *
 * @author jdextre
 */
public class SistemaStoreProcedures {

    public static void main(String[] args) throws SQLException {
        Conecta objConecta = new Conecta();
        objConecta.cargarDriver();
        objConecta.conectarDB();
        //objConecta.mostrarRegistrosSP("1");
        objConecta.listarRegistrosSP();
        objConecta.rs.next();
        System.out.println(objConecta.rs.getString("nomcli"));
        
        objConecta.insertarRegistrosSP(3, "Jaime","jaime@mail.com","1357");
        
        
    }
}
