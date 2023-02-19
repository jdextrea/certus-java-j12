/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.certus.proyectojpa;

import com.certus.controlador.ClienteControlador;
import com.certus.entidades.Cliente;

/**
 *
 * @author jdextre
 */
public class ProyectoJPA {

    public static void main(String[] args) {
        
        ClienteControlador cliCon = new ClienteControlador();
        Cliente objCli = new Cliente(8,"Jorgito","j@mail.com","0248");
        cliCon.editar(objCli);
        //    cliCon.crear(objCli);
          
        //us.eliminar(usr);
    }
}
