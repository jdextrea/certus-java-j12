/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.controlador;
import java.util.ArrayList;
/**
 *
 * @author jdextre
 */
public class Bolsa <T> {
    private ArrayList<T> lista  = new ArrayList<T>();
    
    //Metodo para añadir un tipo de objeto
    public void add(T objeto) {
        lista.add(objeto);
    }
    public ArrayList<T> getProducts(){
        return lista;
    }
    
 
    
}
