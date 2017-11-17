package com.kodilla.testing.shape;

public class Squere implements Shape {

    double length;

    public Squere(double length) {
        this.length = length;
    }

    public String getShapeName(){
        return "Squere";
    };

    public double getField(){
        return length*length;
    }
}
