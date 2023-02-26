/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.solucion;

import com.certus.patronfmethod.Figure;

/**
 *
 * @author jdextre
 */
public class FiguresManagerSol {
     //Para saber la figura
    private Figure figure;
    
    //Get de Figure
    public Figure getFigure() {
        return figure;
    }
    
    //Ya no importa que brinde un tipo de figura, debe darme es un objeto creado de figuras
    private FigureCreator creator;

    //set del atributo
    public void setCreator(FigureCreator creator) {
        this.creator = creator;
    }
    
    //No poner el tipo de figura
    public void createFigure() {
        this.figure = this.creator.createFigure();
    }
    
    
}
