package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape{

    private final static String shapeName = "Triangle";
    private double figureField;

    public Triangle(double figureField){
        this.figureField = figureField;

    }

    public double getField() {
        return figureField;
    }
    public String getShapeName(){
        return shapeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.figureField, figureField) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(figureField);
    }
}