/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.figuras.solucion;

import com.certus.figuras.Figure;
import com.certus.figuras.Square;
import com.certus.figuras.Triangle;

/**
 *
 * @author jdextre
 */
public class TriangleCreator extends FigureCreator{
    //sobrecribir el metodo
    @Override 
    public Figure createFigure() {
        //Se que soy un circulo por valores por defecto
        return new Triangle("Triangle",1,1);
    }
}
