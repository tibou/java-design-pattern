package com.example.decorator;

public class TestDecorator {

    public static void main(String [] args){
        Car sportCar = new SportCar(new BasicCar());
        sportCar.assemble();

        System.out.println("\n*****");

        Car luxurySportCar = new LuxuryCar(new SportCar(new BasicCar()));
        luxurySportCar.assemble();

    }
}
