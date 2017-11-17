package com.kodilla.testing.shape;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> shapeLibrary = new ArrayList<Shape>();


    public void addFigure(Shape shape) {

        shapeLibrary.add(shape);
    }

    public void removeFigure(Shape shape) {

        shapeLibrary.remove(shape);
    }

    public Shape getFigure(int n) {

        return shapeLibrary.get(n);
    }

    public String showFigures() {

        String figures = "";
        for (int m = 0; m < shapeLibrary.size(); m++) {
            figures = figures+shapeLibrary.get(m).getShapeName();
        }
        return figures;
    }
}
