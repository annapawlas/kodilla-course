package com.kodilla.testing.shape;


import java.util.Objects;

public class Circle implements Shape {
    private final static String shapeName = "Circle";
    private double figureField;

    public Circle(double figureField){
        this.figureField = figureField;
    }

    public double getField() {
        return figureField;
    }
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.figureField, figureField) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(figureField);
    }
}
