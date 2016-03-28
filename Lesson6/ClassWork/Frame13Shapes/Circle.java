package Lesson6.ClassWork.Frame13Shapes;


import java.awt.*;

public class Circle extends Shape{

    @Override
    public void draw(Graphics g) {
//        System.out.println("Nice Circle!");
        g.setColor(new Color(100,0,90));
//        g.drawOval(100,100,100,100);
        g.fillOval(100,100,100,100);
    }
}
