package com.company.polymorphism;

public class RectangledTriangle extends Triangle {
    //burada üst klasda final olarak tanimladigimiz seyleri tanimlamak lazim bir kostructor ile

    public RectangledTriangle(double a, double b) {
        super(a, b, Math.sqrt(a * a + b * b));
        System.out.println(this.getFillColor()); // burda üst klasdaki metodu kullandik ama bu metod final o sebeple üzerine yazamayiz
    }

    //burda üst klasdaki metodun üzerine yazdik
    @Override
    public double getArea() {
        return a * b * 0.5;
    }

    protected String getColor() {
        return "aabbcc";
    }

    public void setName(String firstname, String lastname) {
        this.setName(firstname + " " + lastname);
    }

    @Override
    public void setName(String n) {
        System.out.println("do nothing");
    }
}
