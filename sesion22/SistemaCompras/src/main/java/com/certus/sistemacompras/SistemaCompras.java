/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.certus.sistemacompras;

import java.sql.SQLException;


public class SistemaCompras {

    public static void main(String[] args) throws SQLException {
        Conexiones objConecta = new Conexiones();
        objConecta.conecta();
        
    }
               
 }


