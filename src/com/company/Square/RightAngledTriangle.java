package com.company.Square;

public class RightAngledTriangle extends GeometricObject {
    private final double a;
    private final double b;

    public RightAngledTriangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b / 2;
    }

    @Override
    public double getPerimeter() {
        return Math.sqrt(a * a + b * b) + a + b;
    }
}
