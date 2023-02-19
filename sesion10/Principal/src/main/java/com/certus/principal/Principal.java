package com.certus.principal;
//import com.certus.controlador.*;
//Paso 6 importando los paquetes
import com.certus.controlador.controlador;
import com.certus.modelo.modelo;
import com.certus.vista.*;
public class Principal {
    
    
    public static void main(String[] args) {
        ///Principal objPrincipal = new Principal();
       // objPrincipal.mensaje("Buenos dias");
        //int suma = objPrincipal.sumarNumeros(12, 15);
        //objPrincipal.mensaje(String.valueOf(suma));
       // librerias objMetodos = new librerias();
    //    objMetodos.mensaje("Usando clases en paquetes");
        
       // Bolsa<Cemento> objBolsaCemento = new Bolsa<Cemento>();
        //objBolsaCemento.add(new Cemento("Andino"));
    
        //Paso 7
        modelo objModelo = new modelo();
        vista objVista = new vista();
        controlador objControlador = new controlador(objVista,objModelo);
        //Paso 8 -> iniciar la vista
        objControlador.iniciar_Vista();
        objVista.setVisible(true);
        
    }
}

 