package Lesson6.ClassWork.abstractShape;


import java.awt.*;

public class Rectangle extends Shape {


    Rectangle(){
        color = new Color(255,0,0);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
//        g.drawRect(220, 100, 150, 100);
        g.drawPolygon(new int[]{220,220,370,370},new int[]{200,100,100,200},4 );
    }
}
