package Lesson6.ClassWork.abstractShape;


import java.awt.*;

public class Square extends Rectangle {

    Square(){
        color = new Color(0,0,0);
    }


    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(600,100,100,100);
    }
}
