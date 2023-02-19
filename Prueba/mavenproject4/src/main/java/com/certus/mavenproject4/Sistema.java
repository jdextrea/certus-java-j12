/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.certus.mavenproject4;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
/**
 *
 * @author jdextre
 */
public class Sistema {

    
    
    public static void main(String[] args) {
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        Empleado emp;
        
    try {
        fos = new FileOutputStream("personas.dat");
        salida = new ObjectOutputStream(fos);
        emp = new Empleado("12345678A","Lucas González",30, 1200);
        salida.writeObject(emp);
        emp = new Empleado("98765432B","Anacleto Jiménez", 28, 1000);
        salida.writeObject(emp);
        emp = new Empleado("78234212Z","María Zapata",35, 1100);
        salida.writeObject(emp);
        } catch (FileNotFoundException e) {
        System.out.println(e.getMessage() + "OK");
    } catch (IOException e) {
        System.out.println(e.getMessage() + "OK2" + e.getStackTrace());
        } 
    
    }
    
    
}
