package Lesson6.ClassWork.Frame13Shapes;


import java.awt.*;

public class Rectangle extends Shape{

    @Override
    public void draw(Graphics g) {
        g.setColor(new Color(255,0,0));
//        g.drawRect(220, 100, 150, 100);
        g.drawPolygon(new int[]{220,220,370,370},new int[]{200,100,100,200},4 );
    }
}
