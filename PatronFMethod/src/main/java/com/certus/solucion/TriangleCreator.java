/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.solucion;

import com.certus.patronfmethod.Figure;
import com.certus.patronfmethod.Triangle;

/**
 *
 * @author jdextre
 */
public class TriangleCreator extends FigureCreator{

    @Override
    public Figure createFigure() {
        return new Triangle("Triangle", 1, 1);
    }
    
}
