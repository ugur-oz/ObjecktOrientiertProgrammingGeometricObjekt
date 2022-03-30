package com.company.abstraction;

public class Square extends Shape {

    private final double a;

    public Square(double a) {
        this.a = a;
    } // burada initialieren yaptik degistirilmesin diye a yi final yaptik sonra onun icin kontstruktor kurduk

    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    protected String getColor() {
        return "blau";
    }
}
