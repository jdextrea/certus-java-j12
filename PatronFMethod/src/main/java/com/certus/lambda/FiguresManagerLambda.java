/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.lambda;

import com.certus.patronfmethod.Figure;

/**
 *
 * @author jdextre
 */
public class FiguresManagerLambda {
    private Figure figure;
    private FigureType type;

    //Constructor
    public FiguresManagerLambda(FigureType type) {
        this.type = type;
    }

    public Figure getFigure() {
        return figure;
    }

    public void createFigure() {
        this.figure = this.type.createFigure();
    }
    
    }

