/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.patronfactorymethod;

import com.certus.conexion.ConexionDB;
import com.certus.conexion.IConexion;
import com.certus.conexion.implementacion.MotorType;

public class Application {

  
  public static void main(String[] args) {
        /*ConexionFabrica fabrica = new ConexionFabrica();
        //Crear una conexión sin saber el tipo de conexion
        IConexion cx1 = fabrica.getConexion("MYSQL");
        cx1.conectar();
        cx1.desconectar();
        IConexion cx2 = fabrica.getConexion("MARIADB");
        cx2.conectar();
        cx2.desconectar();
        IConexion cx3 = fabrica.getConexion("OTROS");
        cx3.conectar();
        cx3.desconectar();
*/
        ConexionFabrica2 fabrica = new ConexionFabrica2(MotorType.MYSQL);
        ConexionDB cx1 = fabrica.getConexiondb();
        cx1.conectar();
        
     }
  }

