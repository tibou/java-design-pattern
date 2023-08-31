package com.example.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape{

    private List<Shape> shapes = new ArrayList<>();

    @Override
    public void draw(String color) {
        shapes.forEach(
                shape -> shape.draw(color)
        );
    }

    // add an element
    public void add(Shape shape){
        this.shapes.add(shape);
    }

    //remove an element
    public void remove(Shape shape){
        this.shapes.remove(shape);
    }

    //remove all elements
    public void clear(){
        System.out.println("Clearing all element");
        this.shapes.clear();
    }
}
