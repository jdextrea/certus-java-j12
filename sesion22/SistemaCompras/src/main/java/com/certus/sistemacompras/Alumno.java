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
public class Alumno {
    private String nroCarnet;
    private String apellidos;
    
    public String getNroCarnet() {
        return nroCarnet;
    }

    public void setNroCarnet(String nroCarnet) {
        this.nroCarnet = nroCarnet;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
     public void saludar(String msg2) {
        JOptionPane.showMessageDialog(null, msg2);
    }
    
}
