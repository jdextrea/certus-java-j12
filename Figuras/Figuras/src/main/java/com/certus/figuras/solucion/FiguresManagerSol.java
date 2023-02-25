/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.figuras.solucion;

import com.certus.figuras.Figure;
import com.certus.figuras.FigureType;

/**
 *
 * @author jdextre
 */
public class FiguresManagerSol {
    private Figure figure;

    public Figure getFigure() {
    return figure;
    }
    //Ya no me vas a dar un tipo de figuras, me daras un objeto creado de figuras.
    private FigureCreator creator;
    //Puedes dar por un metodo set, por el constructor, como sea.  
    
    public void setCreator (FigureCreator creator) {
        this.creator = creator;
        //cojo mi creador y le digo mi creador.crear figura y lo guardo como crear figura.
    }
    //No aparece ni circulo ni cuadrado, mi para crearlas ni para manejarlas.
    public void createFigure() {
        this.figure = this.creator.createFigure();
    }
    

}
