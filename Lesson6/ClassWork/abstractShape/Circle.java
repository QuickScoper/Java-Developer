package Lesson6.ClassWork.abstractShape;


import java.awt.*;

public class Circle extends Shape {


    Circle(){
        color = new Color(100,0,90);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
//        g.drawOval(100,100,100,100);
        g.fillOval(100,100,100,100);
    }
}
