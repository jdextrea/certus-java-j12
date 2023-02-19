/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.certus.proyi18n;

import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author jdextre
 */
public class ProyI18n {

    public static void main(String[] args) {
       // Locale.setDefault(new Locale("es","PE"));
//       ResourceBundle messages = ResourceBundle.getBundle("messages");
       // System.out.println(Locale.getDefault());
       ResourceBundle messages = ResourceBundle.getBundle("messages",Locale.getDefault());
       System.out.println(messages);
       String titulo = messages.getString("app.titulo");
       System.out.println(titulo);
       
       //String titulo = messages.getString("app.titulo");
       //String correo = messages.getString("app.correo");
       //String clave = messages.getString("app.clave");

//       String titulo = messages.getString("app.description");
//       String correo = messages.getString("app.enable-online");
//       String clave = messages.getString("app.name");
       
   //    JOptionPane.showMessageDialog(null,titulo + " - " + correo + " - " + clave);  
       
    }
}
