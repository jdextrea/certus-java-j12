/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.mavenproject4;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author jdextre
 */
public class LeerFicheros {
    public static void main(String[] args) {
 FileInputStream fis = null;
 ObjectInputStream entrada = null;
 Empleado emp;

 try {
    fis = new
    FileInputStream("personas.dat");
    entrada = new ObjectInputStream(fis);
    emp = (Empleado) entrada.readObject();
    System.out.println(emp.getNif() + " " + emp.getNombre() + " " + emp.getEdad() + " " + emp.getSueldo());
    emp = (Empleado) entrada.readObject();
    System.out.println(emp.getNif() + " " + emp.getNombre() + " " + emp.getEdad() + " " + emp.getSueldo());
    emp = (Empleado) entrada.readObject();
    System.out.println(emp.getNif() + " " + emp.getNombre() + " "   + emp.getEdad() + " " + emp.getSueldo());
    } catch (FileNotFoundException e) {
        System.out.println(e.getMessage());
    } catch (ClassNotFoundException e) {
     System.out.println(e.getMessage());
    }   catch (IOException e) {
     System.out.println(e.getMessage());
    } 
 }
}
