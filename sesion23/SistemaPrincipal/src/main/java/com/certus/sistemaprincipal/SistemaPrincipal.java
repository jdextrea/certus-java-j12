/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.certus.sistemaprincipal;

import entidades.User;
import controlador.UserControlador;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Locale;
/**
 *
 * @author jdextre
 */
public class SistemaPrincipal {
    

    public static void main(String[] args) {
        
            //Manejo de ResourceBoundle
            /*ResourceBundle objAplication = ResourceBundle.getBundle("application");
            System.out.println(objAplication.getString("app.name"));
            System.out.println(objAplication.getString("app.description"));
            
            //Identificar el locale por defecto.
            System.out.println(Locale.getDefault());
            */
            //Ejercio 1 - Idioma ingles
            //Locale.setDefault(new Locale("en","US"));
            //ResourceBundle objeto = ResourceBundle.getBundle("messages");
            //DEfinir la localidad por defecto
            //System.out.println(objeto.getString("app.titulo"));
            
            //Ejercicio 2 - Idioma español
            //Locale.setDefault(new Locale("es","PE"));
            //ResourceBundle objeto = ResourceBundle.getBundle("messages");
            //DEfinir la localidad por defecto
            //System.out.println(objeto.getString("app.titulo"));
            
            //Ejercicio 3 - Por defecto que encuentre el idioma
           //ResourceBundle objeto = ResourceBundle.getBundle("messages",Locale.getDefault());
           //System.out.println(objeto.getString("app.titulo"));
           
           //Lista de Locale disponable
           /*Locale[] availableLocales = Locale.getAvailableLocales();
           
           for  (Locale locale:availableLocales ) {
              //System.out.println(locale.getCountry());
              //System.out.println(locale.getDisplayCountry());
              System.out.println(locale.getDisplayLanguage());
           } 
           */
                     
            /*UserControlador us = new UserControlador();
            User usr = new User(1,"jdextre","2468","Jymmy");
            us.editar(usr);
            //us.crear(usr);
            //us.eliminar(usr);
            //Para listar usuarios
            List<User> usuarios = us.todosLosUsuarios();
            for (User u: usuarios) {
                System.out.println(u.getNombre());
            }
            */
            
            
            
            
            
            
            
            
    }
}
