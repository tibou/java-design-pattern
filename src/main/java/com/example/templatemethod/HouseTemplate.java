package com.example.templatemethod;

public abstract class HouseTemplate {

    //template method, final so subclasses can't override
    public final void buildHouse(){
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built.");
    }

    // default implementation
    private void buildFoundation(){
        System.out.println("Building foundation with cement,iron rods and sand");
    }

    private void buildWindows(){
        System.out.println("Building Glass Windows");
    }

    //methods to be implemented by subclasses
    public abstract void buildPillars();
    public abstract void buildWalls();



}
