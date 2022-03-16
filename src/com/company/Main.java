package com.company;

import com.company.Square.*;

import java.util.List;
import java.util.function.BiFunction;

public class Main {

    public static void main(String[] args) {

        Square quadrat1 = new Square(3.0);
        Square quadrat2 = new Square(7.0);

        System.out.println("Fläche Q1 : " +  quadrat1.getArea());
        System.out.println("Umfang Q1 : " + quadrat1.getPerimeter());

        System.out.println("Fläche Q2 : " + quadrat2.getArea());
        System.out.println("Umfang Q2 : " + quadrat2.getPerimeter());

        Rectangle rechteck1 = new Rectangle(2.0, 3.0);
        Rectangle rechteck2 = new Rectangle(4.0, 5.0);

        System.out.println("Fläche R1 : " + rechteck1.getArea());
        System.out.println("Umfang R1 : " + rechteck1.getPerimeter());

        System.out.println("Fläche R2 : " + rechteck2.getArea());
        System.out.println("Umfang R2 : " + rechteck2.getPerimeter());

        /*
        double sum1 = objects.stream()
                .mapToDouble(GeometricObject::getArea)
                .sum();
       */

        Circle c1 = new Circle(2.0);
        Circle c2 = new Circle(5.0);

        System.out.println("Fläche c1 : " + c1.getArea());
        System.out.println("Fläche c2 : " + c2.getArea());

        System.out.println("Umfang c1 : " + c1.getPerimeter());
        System.out.println("Umfang c2 : " + c2.getPerimeter());

        RightAngledTriangle tri1 = new RightAngledTriangle(3,4);
        RightAngledTriangle tri2 = new RightAngledTriangle(6,8);

        System.out.println("Fläche tri1 : " + tri1.getArea());
        System.out.println("Umfang tri1 : " + tri1.getPerimeter());

        System.out.println("Fläche tri2 : " + tri2.getArea());
        System.out.println("Umfang tri2 : " + tri2.getPerimeter());

        List<GeometricObject> objects = List.of(quadrat1,quadrat2, rechteck1,rechteck2,c1,c2);

        double sum = 0;
        for(GeometricObject element : objects) {
            sum += element.getArea();
        }
        System.out.println("Summe  Flächeninhalt: " + sum);

    }
}
