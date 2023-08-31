package com.example.flyweight;

import java.awt.*;

public class Line implements Shape {

    public Line() {
        System.out.println("Creating line object");
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }


    @Override
    public void draw(Graphics g, int x, int y, int x1, int y1, Color color) {
        g.setColor(color);
        g.drawLine(x, y, x1, y1);
    }
}
