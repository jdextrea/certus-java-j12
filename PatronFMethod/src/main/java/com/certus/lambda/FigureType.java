/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.lambda;

import com.certus.patronfmethod.Circle;
import com.certus.patronfmethod.Figure;
import com.certus.patronfmethod.Square;
import com.certus.patronfmethod.Triangle;
import java.util.function.Supplier;

/**
 *
 * @author jdextre
 */
public enum FigureType {
    CIRCLE(() -> new Circle("Circle",1)),
    SQUARE(() -> new Square("Square", 4)),
    TRIANGLE(() -> new Triangle("Triangle", 1, 1));
    
        private final Supplier<Figure> figureCreator;
        
        FigureType(Supplier<Figure> figureCreator) {
            this.figureCreator = figureCreator;
        }
        
        public Figure createFigure() {
            return this.figureCreator.get();
        } 
}
