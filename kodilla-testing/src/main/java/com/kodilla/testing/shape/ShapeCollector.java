package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapeCollection = new ArrayList<>();
    public List<Shape> getShapeCollection() {
        return shapeCollection;
    }

    public void addFigure(Shape shape){
        shapeCollection.add(shape);

    }

    public boolean removeFigure(Shape shape){
        return shapeCollection.remove(shape);
    }

    public Shape getFigure(int n){
        return shapeCollection.get(n);
    }

    public String showFigures(){
        return shapeCollection.toString();
    }

}
