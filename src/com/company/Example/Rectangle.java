package com.company.Example;

public class Rectangle extends GeometricObject implements GeomObject2D{
    private double a;
    private double b;

    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public double getArea(){
        return a * b;
    }

    @Override
    public double getPerimeter(){

        return 2*a + 2*b ;
    }

    @Override
    public String getName() {
        return "Rechtangle";
    }

}
