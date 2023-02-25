/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.figuras.solucion;

//import com.certus.figuras.c;
//import com.certus.figuras.FigureType;
//import com.certus.figuras.FiguresManager;

/**
 *
 * @author jdextre
 */
public class FigurasSol {
    
     public static void main(String[] args) {
         FiguresManagerSol objFigura = new FiguresManagerSol();
         objFigura.setCreator(new CircleCreator());
         objFigura.createFigure();
         double area  = objFigura.getFigure().area();
         System.out.println(area);
     }
     
        
//        objFigura.createFigure();
 //      double area =  objFigura.getFigure().area();
  //      System.out.print(area);
  //  }
}
