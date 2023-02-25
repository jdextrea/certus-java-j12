/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.figuras;

public class FiguresManager {

    private Figure figure;
    //Te obliga a crear el estilo de figura
    private FigureType type;

    public FiguresManager(FigureType type) {
        this.type = type;
    }

    public Figure getFigure() {
        return figure;
    }

    public FigureType getType() {
        return type;
    }

    public void createFigure() {
        //Codigo espaguetti.
        //cada vez que añado una figura me obliga a crear una figura.
        //Dificil de gestionar
       //Me crea dependecias con el new
        
        if (this.type == FigureType.CIRCLE) {
            this.figure = new Circle("Circle", 1); //ya tenemos una dependencia de gestor de figuras con circulo
        } else if (this.type == FigureType.SQUARE) {
            this.figure = new Square("Square", 4);
        } else if (this.type == FigureType.TRIANGLE) {
            this.figure = new Triangle("Triangle", 1, 1);
        } else {
            assert false : "unexpected";
        }
    }

    @Override
    public String toString() {
        return "FiguresManager{" +
                "figure=" + figure +
                ", type=" + type +
                '}';
    }
}
