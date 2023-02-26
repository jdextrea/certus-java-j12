/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.solucion;

import com.certus.patronfmethod.Circle;
import com.certus.patronfmethod.Figure;

/**
 *
 * @author jdextre
 */
public class CircleCreator extends FigureCreator{

    @Override
    public Figure createFigure() {
        return new Circle("Circle",1);
    }
    
}
