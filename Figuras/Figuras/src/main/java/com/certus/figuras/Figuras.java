/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.certus.figuras;

/**
 *
 * @author jdextre
 */
public class Figuras {

    public static void main(String[] args) {
        FiguresManager objFigura = new FiguresManager(FigureType.SQUARE);
        
        objFigura.createFigure();
       double area =  objFigura.getFigure().area();
        System.out.print(area);
    }
}
