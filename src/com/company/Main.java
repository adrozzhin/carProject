package com.company;

public class Main {

    public static void main(String[] args) {

        Car newCar = new Car();

        newCar.name = "Lambo";
        newCar.engineCapacity = "7000cc";
        newCar.doors = 2;
        newCar.model = "Huracan";

        System.out.println(newCar.model);
        
    }
}
