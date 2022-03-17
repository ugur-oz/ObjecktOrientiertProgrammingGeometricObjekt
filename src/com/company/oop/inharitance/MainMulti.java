package com.company.oop.inharitance;

import java.util.List;

public class MainMulti {
    //java da bir klasse nin bir oberklassesi olur 2. olmaz yani sadece 1 tane oberklasse olur

    public static void main(String[] args) {

        FuelCarImpl bmw3er = new FuelCarImpl();
        ElektricCar tesla = new ElectricCarImpl();
        HybridCarImpl toyota = new HybridCarImpl();


        bmw3er.fuel();
        tesla.charge();

        toyota.fuel();
        toyota.charge();


        List<ElektricCar> elektricCarList = List.of(tesla, toyota);
        List<FuelCar> fuelCarList = List.of(bmw3er, toyota);

        for (ElektricCar eCar : elektricCarList) {
            eCar.charge();
        }

        for (FuelCar fCar : fuelCarList) {
            fCar.fuel();
        }

        fuelCarList.forEach(FuelCar::fuel);

    }
}
