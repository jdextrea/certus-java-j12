/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesion04;

/**
 *
 * @author jdextre
 */
public class Operaciones {
    //Paso 1, crear dos atributos
    private double num1;
    private double num2;
    
    //Crear getter y setter.
    public double getNum1() {
        return num1;
    }
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    public double getNum2() {
        return num2;
    }
    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public double sumar() {
        return (this.num1 + this.num2);
    }
    public double restar() {
        return (this.num1 - this.num2);
    }
    
}
