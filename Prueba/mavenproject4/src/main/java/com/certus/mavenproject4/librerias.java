/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.mavenproject4;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author jdextre
 */
public class librerias {
    private FileOutputStream file;
    private ObjectOutputStream output;
    public ArrayList<Empleado> datos = new ArrayList();
    private FileInputStream fileI;
    private ObjectInputStream input;

    public ArrayList<Empleado> getDatos() {
        return datos;
    }
    public void cerrar() throws IOException {
            if (output!=null) {
            output.close();
            System.out.println("uno");
            } else {
            System.out.println("dos");
            
            }
                
        }
    
    
    public void cerrarI() throws IOException {
            if (input!=null) {
            input.close();
            }
        }
    public void escribir (Empleado emp) throws IOException {
        if (output!=null) {
        output.writeObject(emp);
        datos.add(emp);
        

        } else 
        {
        System.out.println("No existe");
        }
    }
    
    public void abrir() throws IOException {
        file = new FileOutputStream( "personas.dat" );
        output = new ObjectOutputStream(file);
        System.out.println("apertura");
        
    }

    public int contarRegistros() throws IOException, ClassNotFoundException{
        this.abrirLeer();
        this.leer();
        this.cerrarI();
        return datos.size();
    }

    //funcion abrir para leer
    public void abrirLeer() throws IOException {
        fileI = new FileInputStream( "personas.dat" );
        input = new ObjectInputStream(fileI);

    }
    //funcion para deserializar
    public Empleado leer() throws IOException, ClassNotFoundException {
        Empleado emp = null;
            if (input!=null) {
                try {
                emp = (Empleado)input.readObject();
                datos.add(emp);
                
                } catch (EOFException eof) {
                        //Fin del fichero
                }
            }
        return emp;
        
    } 
    
    
}
