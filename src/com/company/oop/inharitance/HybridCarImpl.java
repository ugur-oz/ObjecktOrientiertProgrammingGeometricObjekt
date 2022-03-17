package com.company.oop.inharitance;

public class HybridCarImpl extends Car implements FuelCar,ElektricCar{

    @Override
    public void charge(){

        System.out.println("charging...");

    }

    @Override
    public void fuel(){
        System.out.println("fuelling..");

    }

    //sadece 1 mutterklasse var extend de ama implements ile tüm klaslara erisebilirsin
}
