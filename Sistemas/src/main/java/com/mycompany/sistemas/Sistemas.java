/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sistemas;
import com.mycompany.modelos.modelo;
import com.mycompany.vista.V_Clientes;
import com.mycompany.controladores.CC_Clientes;
/**
 *
 * @author jdextre
 */
public class Sistemas {

    public static void main(String[] args) {
        modelo modelo = new modelo();
        V_Clientes V_Clientes = new V_Clientes();
        CC_Clientes CC_Clientes = new CC_Clientes(V_Clientes,modelo);
        CC_Clientes.iniciarVista();
        V_Clientes.setVisible(true);
        
    }
}
