/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.principal;

/**
 *
 * @author jdextre
 */



public class Libro {
    @Imprimible(mayusculas=false)
     String titulo;
    @Imprimible(mayusculas=true)
     String autor;
    
    Integer paginas;
 
    public Libro(String titulo, String autor) {
        super();
        this.titulo = titulo;
        this.autor = autor;
    }
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
 
}
