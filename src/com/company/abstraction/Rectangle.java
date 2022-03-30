package com.company.abstraction;

public class Rectangle extends Shape implements WithDiagonal {

    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    protected String getColor() {
        return "black";
    }

    @Override
    public double getDiagonalLength() {
        return Math.sqrt(a * a + b * b);
    }
}
