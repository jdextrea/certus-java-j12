/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesion04;

/**
 *
 * @author jdextre
 */
public class Fecha {
    //Estoy creando atributos, propiedades
    //public int dia;
    //public int mes;
    //public int anio;
    private int dia;
    private int mes;
    private int anio;

    /*public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    */
    //Metodo MostrarFecha
    //Para obtener un valor
    public int getDia() {
        return dia;
    }
    //Para fijar o establecer un valor
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void MostrarFecha(String msg) {
        System.out.println(msg);
    }        
   public void MuestraFecha() {
   String fecha = this.dia + "/" + this.mes + "/" + this.anio;
    System.out.println(fecha);
   }
}
