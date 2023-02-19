/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.sistemaventas;

import javax.swing.JOptionPane;

/**
 *
 * @author jdextre
 */
public class Persona {
    private int nroDni;
    private String nombrePersona;

    public int getNroDni() {
        return nroDni;
    }

    public void setNroDni(int nroDni) {
        this.nroDni = nroDni;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public void mensaje(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public void saludar(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
    
    
}
