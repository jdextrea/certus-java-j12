/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.mavenproject4;

/**
 *
 * @author jdextre
 */
public class Empleado extends Persona {
    private double sueldo;
    
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public Empleado(String nif, String nombre, int edad, double sueldo) {
        super(nif, nombre, edad);
        this.sueldo = sueldo;
        }
    
}
