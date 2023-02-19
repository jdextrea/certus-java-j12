/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.controlador;
//Paso 1, importar la vista y el modelo
import com.certus.modelo.modelo;
import com.certus.vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Añade estos 2 clases para manejar evento



/**
 *
 * @author jdextre
 */
public class controlador implements ActionListener {
    //Paso 2 atributos de la vista y el modelo
    private vista vista;
    private modelo modelo;
     //Paso 3 cuando se instancie el controlador se debe pasar la vista y el modelo
    public controlador (vista vista, modelo modelo) {
    //Paso 4 definiendo la vista y modelo 
        this.vista = vista;
        this.modelo = modelo;
    }
    
    //Paso 5 creando un metodo para iniciar la vista
    public void iniciar_Vista () {
        vista.setTitle("Patron MVC");
        vista.setLocationRelativeTo(null);
        vista.txtn1.setText(String.valueOf(modelo.getN1()));
        vista.txtn2.setText(String.valueOf(modelo.getN1()));
       
    }

    //Manejo de excepciones
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

   
}
