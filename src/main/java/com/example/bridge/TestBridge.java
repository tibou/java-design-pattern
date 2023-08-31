package com.example.bridge;


/*
    Structural design pattern

    When we have interface hierarchies in both interfaces as well as implementations, then
    bridge design pattern is used to decouple the interfaces from implementation and hiding
    the implementation details from the client programs.

    According to GoF bridge design pattern is:
        - Decouple an abstraction from its implementation so that the two can vary independently
    The implementation of bridge design pattern follows the notion to prefer Composition
    over inheritance.
    Bridge design pattern can be used when both abstraction and implementation can have
    different hierarchies independently and we want to hide the implementation from the
    client application.
 */
public class TestBridge {

    public static void main(String[] args){
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();

        Shape pent = new Pentagon(new GreenColor());
        pent.applyColor();
    }
}
