package com.example.decorator;

public class SportCar extends CarDecorator{

    public SportCar(Car car){
        super(car);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.println("This is a sport car.");
    }
}
