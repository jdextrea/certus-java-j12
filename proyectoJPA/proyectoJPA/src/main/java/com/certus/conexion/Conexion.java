/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.conexion;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexion {

    //1. Patron Singleton
    private static Conexion instancia = new Conexion();
    private EntityManagerFactory fabrica;
    
    //2. Instancia 
    public static Conexion getInstancia() {
        return instancia;
    }
    //4. una vez creado UserControlador
    public EntityManagerFactory getFabrica() {
        return fabrica;
    }
       //3. Constructor privado y que manejara la fabrica para gestionar las entidades
    private Conexion() {
        fabrica = Persistence.createEntityManagerFactory("com.certus_proyectoJPA_jar_1.0-SNAPSHOTPU");
    }
}
