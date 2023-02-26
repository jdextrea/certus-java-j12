/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.patronfmethod;

public abstract class Figure {

    private String name;

    //Constructor
    public Figure(String name) {
        this.name = name;
    }
    
    //Get nombre
    public String getName() {
        return name;
    }

    public abstract double area();

    public abstract double numberOfSides();

}
