package com.company.inharitance;

public class ElectricCarImpl extends Car implements ElektricCar{
    public void charge(){
        System.out.println("charging...");
    }
}
