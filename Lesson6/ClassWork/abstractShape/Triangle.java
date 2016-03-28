package Lesson6.ClassWork.abstractShape;


import java.awt.*;

public class Triangle extends Shape {

    Triangle(){
        color = new Color(255,0,0);
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        g2d.setStroke(new BasicStroke(5));
        g.setColor(color);
        g.drawPolygon(new int[]{390,550,470},new int[]{200,200,100},3);
    }
}
