/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.principal;
import com.certus.annotation.EdadMinima;

/**
 *
 * @author jdextre
 */
public class Usuario {
    String nombre;
    String dni;
    @EdadMinima(valor=18)
    Integer edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Usuario(String nombre, String dni, Integer edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }
}
