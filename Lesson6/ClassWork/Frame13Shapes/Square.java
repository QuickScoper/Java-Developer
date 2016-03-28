package Lesson6.ClassWork.Frame13Shapes;


import java.awt.*;

public class Square extends Rectangle{


    @Override
    public void draw(Graphics g) {
        g.setColor(new Color(0,0,0));
        g.fillRect(600,100,100,100);
    }
}
