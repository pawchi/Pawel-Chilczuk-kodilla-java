package com.kodilla.testing.shape;

public class Triangle implements Shape {

    double height;
    double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public String getShapeName(){
        return "Triangle";
    };

    public double getField(){
        return 0.5*height*base;
    }
}
