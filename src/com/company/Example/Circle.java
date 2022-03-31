package com.company.Example;

public class Circle extends GeometricObject implements GeomObject2D{

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

    @Override
    public String getName() {
        return "Circle";
    }

    public Circle(double a) {
        this.a = a;
    }

}
