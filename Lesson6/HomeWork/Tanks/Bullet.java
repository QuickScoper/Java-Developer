package Lesson6.HomeWork.Tanks;


import Lesson6.HomeWork.Tanks.Interfaces.Destroyable;
import Lesson6.HomeWork.Tanks.Interfaces.Drawable;

import java.awt.*;

public class Bullet implements Drawable,Destroyable {

    private int x;
    private int y;
    private int speed = 1;
    private Direction direction;


    Bullet(int x,int y,Direction direction){
        this.x = x;
        this.y = y;
        this.direction = direction;
    }



    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSpeed() {
        return speed;
    }

    public Direction getDirection() {
        return direction;
    }


    public void updateX(int x){
        this.x+=x;
    }
    public void updateY(int y){
        this.y+=y;
    }

    @Override
    public void destroy(){
        x = -100;
        y = -100;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(new Color(0, 0, 0));
        g.fillRect(this.getX(), this.getY(), 14, 14);
    }
}
