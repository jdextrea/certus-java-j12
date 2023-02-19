/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesion03;

/**
 *
 * @author jdextre
 */
public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String retornarNombre() {
        return nombre;
    }

    public void fijarNombre(String nombre) {
        this.nombre = nombre;
    }

    public int retornarEdad() {
        return edad;
    }

    public void fijarEdad(int edad) {
        this.edad = edad;
    }

    public String toString() {
        return "Nombre:" + nombre + "- Edad:" + edad;
    }

    public static void main(String[] ar) {
        Persona persona1 = new Persona("Juan", 33);
        System.out.println(persona1.toString());
    }
}