package com.company.Square;

public abstract class GeometricObject {

 public abstract double getArea();
 public abstract double getPerimeter();
 public abstract String getName();

 public String toString() {
  return "Ich bin ein " + getName() + " mit dem Umfang " + getPerimeter() + " und der Fläche " + getArea();

 }


 //her alt klasinda bu fonksiyonlar olmali cunku bu abstract klasse
 // bu objeden yeni bir obje yapamazsin
}
