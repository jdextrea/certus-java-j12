/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controladores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author jdextre
 */
import com.mycompany.modelos.*;
import com.mycompany.vista.*;



public class CC_Clientes {
    private V_Clientes V_Clientes;
    private modelo modelo;
    
    
    public CC_Clientes(V_Clientes V_Clientes, modelo modelo) {
        this.V_Clientes = V_Clientes;
        this.modelo = modelo;
        //this.V_Clientes.cmdSumar.addActionListener((ActionListener) this);
        
    } 
    
    public void iniciarVista() {
        V_Clientes.setTitle("Demo MVC");
        V_Clientes.setLocationRelativeTo(null);
        
    }
   
    
}
