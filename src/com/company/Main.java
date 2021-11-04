package com.company;

public class Main {

    public static void main(String[] args) {

        Car newCar = new Car();

        newCar.name = "Ferra";
        newCar.color = "red";
        newCar.doors = 2;
        newCar.engineCapacity = "5000cc";

        System.out.println(newCar.color);
    }
}
