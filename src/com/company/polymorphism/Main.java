package com.company.polymorphism;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Triangle t = new Triangle(3, 4, 5);
        System.out.println("Fläche Triangle: " + t.getArea());

        RectangledTriangle r = new RectangledTriangle(3, 4);
        System.out.println("Fläche RectangledTriangle: " + r.getArea());

        List<Triangle> lst = List.of(r, t);

        r.setName("Hallo"); // bundan do nothin geldi
        r.setName("Hallo","WOrs"); // bundan do nothing geldi

        // üzerine azarken -> override -> überladung ,,,metod signaturu ayni olmali
    }
}
