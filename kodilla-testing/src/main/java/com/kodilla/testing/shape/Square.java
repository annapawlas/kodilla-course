package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {

    private final static String shapeName = "Square";
    private double figureField;

    public Square(double figureField) {
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
        Square square = (Square) o;
        return Double.compare(square.figureField, figureField) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(figureField);
    }
}


