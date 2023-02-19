/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.sesion18;

/**
 *
 * @author jdextre
 */
public class Libro {
    @Imprimible(mayusculas=true)
    String titulo;
    @Imprimible(mayusculas=false)
    String autor;
    
    Integer paginas;
    
    
    
    //Integer paginas;
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
   

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
}
