/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.principal;

/**
 *
 * @author jdextre
 */
public class Personas {
    @Persistencia(campo = "nombre", tipo = "varchar")
    private String nombre;
 
    @Persistencia(campo="edadPersona",tipo="decimal")
    private String edad;
    
    public String getNombre() {
    return nombre;
    }
    
    public void setNombre(String nombre) {
    this.nombre = nombre;
    }
    
    public String getEdad() {
    return edad;
    }
 
    public void setEdad(String edad) {
    this.edad = edad;
    }
}
