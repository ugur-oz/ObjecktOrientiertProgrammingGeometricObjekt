package com.company.abstraction;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(1);
        Square square = new Square(3);
        Rectangle rectangle = new Rectangle(2, 3);


        List<Shape> shapes = List.of(circle, square, rectangle);

        for (Shape shape : shapes) {

            System.out.println(shape.toString() + " => " + shape.getArea());
            //burada klas circle ve square shape klassdaki getArea nin üstüne yazdi ve dogru sonucu verdi _>polimorfism
        }
    }
}
