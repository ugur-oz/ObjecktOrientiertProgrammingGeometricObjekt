package com.company.oop.inharitance;

import java.util.List;

public class Main {
    public static void main(String[] args){

        //burda instanceof ile calisirsan hangi objenin nereye ait oldugunu bulursun


        FuelCarImpl bmw3er = new FuelCarImpl();
        Motorcycle kawasaki = new Motorcycle();

        List<Vehicle> list = List.of(bmw3er, kawasaki);

        System.out.println(bmw3er.getClass());
        System.out.println(kawasaki.getClass());

        System.out.println("bmw3er instanceof FuelCar " + (list.get(0) instanceof FuelCarImpl));
        System.out.println("kawasaki instanceof Motorcycle " + (list.get(0) instanceof Motorcycle));
        System.out.println("bmw3er instanceof Vehicle " + (list.get(0) instanceof Vehicle));
        System.out.println("bmw3er instanceof Object " + (list.get(0) instanceof Object));

        Vehicle veh3er = (Vehicle) bmw3er; // instanceof true ise bunu yapabilirsun

        System.out.println("kawasaki instanceof Motorcycle " + (list.get(1) instanceof Motorcycle));
        System.out.println("kawasaki instanceof Vehicle " + (list.get(1) instanceof Vehicle));

        Vehicle veh4er = (Vehicle)  list.get(0);

        bmw3er.fuel();
        ((FuelCarImpl)veh3er).fuel();
        ((FuelCarImpl)list.get(0)).fuel();

        System.out.println(veh3er.getClass());
        System.out.println(veh3er instanceof FuelCarImpl);
        System.out.println(veh3er instanceof  Car);
        System.out.println(veh3er instanceof  Vehicle);

        for(Vehicle v : list) {
            if(v instanceof FuelCarImpl x){
                x.fuel();
                x.drive();


            }
        }

    getInfo(bmw3er);
    getInfo(kawasaki);

    doDrive(bmw3er);

    }
    public static void getInfo(Vehicle vehicle){
        System.out.println("info: " + vehicle.tyres);
    }

    public static void doDrive(Car car){
        car.drive();
    }


}
