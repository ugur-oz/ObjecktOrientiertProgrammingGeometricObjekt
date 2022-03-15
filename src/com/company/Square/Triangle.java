package com.company.Square;

public class Triangle extends GeometricObject {

    private double a;
    private double b;

    @Override
    public double getArea() {
        return a * b / 2 ;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
