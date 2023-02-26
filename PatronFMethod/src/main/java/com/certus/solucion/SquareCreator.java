/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.solucion;

import com.certus.patronfmethod.Figure;
import com.certus.patronfmethod.Square;

/**
 *
 * @author jdextre
 */
public class SquareCreator extends FigureCreator{

    @Override
    public Figure createFigure() {
        return new Square("Square", 4);

    }
    
}
