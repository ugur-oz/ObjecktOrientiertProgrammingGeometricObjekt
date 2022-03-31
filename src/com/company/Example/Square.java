package com.company.Example;

public class Square extends Rectangle implements GeomObject2D{

    public Square(double a) {
        super(a, a);
    }

    @Override
    public String getName(){
        return "Quadrat";
    }

    public double getA(){
        return super.getA();
    }

}
