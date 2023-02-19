/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.sistemacompras;

import javax.swing.JOptionPane;


/**
 *
 * @author jdextre
 */
public class Persona {
    //Principio Open/Close
    private String nroCarnet;
    private String nombre;
    private String correo;

    public String getNroCarnet() {
        return nroCarnet;
    }

    public void setNroCarnet(String nroCarnet) {
        this.nroCarnet = nroCarnet;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
        public void saludar(String msg2) {
        JOptionPane.showMessageDialog(null, msg2);
    }
    
    
}
