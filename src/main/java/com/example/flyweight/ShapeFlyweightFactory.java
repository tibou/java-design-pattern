package com.example.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFlyweightFactory {
    private final static Map<ShapeType, Shape> shapes = new HashMap<>();

    public static Shape getShape(ShapeType shapeType) {
        Shape shape = shapes.get(shapeType);

        if (shape == null) {
            if (shapeType.equals(ShapeType.LINE)) {
                shape = new Line();
            } else if (shapeType.equals(ShapeType.OVAL_NOFILL)) {
                shape = new Oval(false);
            } else {
                shape = new Oval(true);
            }

            shapes.put(shapeType, shape);
        }

        return shape;
    }


    public static enum ShapeType {
        LINE, OVAL_FILL, OVAL_NOFILL;
    }
}
