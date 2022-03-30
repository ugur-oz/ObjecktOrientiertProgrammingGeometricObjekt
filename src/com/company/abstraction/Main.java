package com.company.abstraction;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(1);
        Square square = new Square(3);
        Rectangle rectangle = new Rectangle(2, 3);

        List<Shape> shapes = List.of(circle, square, rectangle);

        for (Shape shape : shapes) {

            System.out.println(shape.toString() + " => " + shape.getArea());
            //burada klas circle ve square shape klassdaki getArea nin üstüne yazdi ve dogru sonucu verdi _>polimorfism

            if (shape instanceof WithDiagonal withDiagonal) {
                System.out.println("\tdiagonal lenght: " + withDiagonal.getDiagonalLength() + " roundet: " + withDiagonal.getDiagonalLenghtRoundet());
            }
        }


        // WithDiagonal wd = () -> 5;
        // Function<Integer, Integer> mapFunction = x -> x * x;
        // lambda tamamen interfaces ile yürür, yani bir abstracta metodu var ve biz bunu kullaniyoruz
        Stream.of(4, 2, 6, 7).map(new MapFunktion()) // erwartet funktion
                .forEach(x -> System.out.println(x));
    }

    private static class MapFunktion implements Function<Integer, Integer> {

        @Override
        public Integer apply(Integer x) {
            return x * x;
        }
    }
}
