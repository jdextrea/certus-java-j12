/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sesion03;
//Importo solo la clase que necesito del paquete
import com.mycompany.figuras.Rectangulo;
import com.mycompany.utils.Metodos;

/**
 *
 * @author jdextre
 */
public class Sesion03 {

    public static void main(String[] args) {
        //Crear un objeto cadena
        
        String nombres = new String("Jymmy");
        nombres  = nombres + " Dextre Alarcón";
        System.out.println(nombres);
        
        //Para contar palabras
        System.out.println(nombres.length());
        //para devolver un valor en base un indice
        char letraPalabra = nombres.charAt(1);
        System.out.println(letraPalabra);
        
        //"Jymmy Dextre Alarcón"
        System.out.println(nombres.substring(2));
        System.out.println(nombres.substring(2,3));
        //calcular el nombre
        System.out.println(nombres.substring(0,5));
        //Trabajando con indexof
        //Juan Coronel xxxx"
        //Luisa Estrada xxx"
        System.out.println(nombres.indexOf("Dextre"));
          //Ejercicio calcular de nombre de una cadena que tenga nombres y apellidos
         String datosCompletos = new String("Diego Saldaña Espinoza");
         //Mostrar el nombre
         int pos = datosCompletos.indexOf(" ");
         System.out.println(datosCompletos.substring(0, pos));
         //Sacar el apellido paterno y materno.
         //Sacar el total de caracteres
         int total = datosCompletos.length();
         //utilizo la variable pos para el indice inicial del apellido
         String apellidos = datosCompletos.substring(pos+1, total);
         System.out.println(apellidos);
         //apellido paterno, lo mismo como saque el nombre.
        
         //Llamar a la clase Rectangalo.
         Rectangulo objRectangulo = new Rectangulo();
         objRectangulo.saludar("Hola accediendo a un metodo");
                //objRectangulo.calcularArea();
                
                Metodos objMetodos = new Metodos();
                
              
                Integer x=10;
                Integer y=10;
                //objMetodos.Mensaje("igual");
                objMetodos.setMsg("hola");
                objMetodos.Mensaje();
                  
    }
}
