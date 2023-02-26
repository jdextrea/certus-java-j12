/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.solucion;


import com.certus.patronfmethod.Circle;
import com.certus.patronfmethod.FigureType;

/**
 *
 * @author jdextre
 */
public class ProbarPatron {
    public static void main(String[] args) {
        FiguresManagerSol objFigura = new FiguresManagerSol();
        objFigura.setCreator(new CircleCreator());
        objFigura.createFigure();
        double area = objFigura.getFigure().area();
        System.out.println(area);
    
        
    }
}
