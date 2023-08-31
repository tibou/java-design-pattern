package com.example.flyweight;

import java.awt.*;

public class Oval implements Shape{
    private boolean fill;

    public Oval(boolean fill){
        System.out.println("Creating oval object with fill: " + fill);
        this.fill = fill;
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics g, int x, int y, int width, int height, Color color) {
        g.setColor(color);
        g.drawOval(x, y, width, height);
        if(this.fill){
            g.fillOval(x, y, width, height);
        }
    }
}
