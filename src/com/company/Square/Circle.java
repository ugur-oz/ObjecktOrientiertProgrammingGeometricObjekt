package com.company.Square;

public class Circle extends GeometricObject{

    private double a;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return a * a * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * a * Math.PI;
    }

    public Circle(double a) {
        this.a = a;
    }

}
