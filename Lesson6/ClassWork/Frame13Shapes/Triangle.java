package Lesson6.ClassWork.Frame13Shapes;


import java.awt.*;

public class Triangle extends Shape{

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        g2d.setStroke(new BasicStroke(5));
        g.setColor(new Color(255,0,0));
        g.drawPolygon(new int[]{390,550,470},new int[]{200,200,100},3);
    }
}
