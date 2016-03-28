package Lesson8.ClassWork.Tanks.Tanks;


import Lesson8.ClassWork.Tanks.BattelField.Interfaces.Destroyable;
import Lesson8.ClassWork.Tanks.BattelField.Interfaces.Drawable;
import Lesson8.ClassWork.Tanks.Direction;

import java.awt.*;

public class Bullet implements Drawable,Destroyable {

    private int x;
    private int y;
    private int speed = 5;
    private Direction direction;

    private boolean destroyed;

    public Bullet(int x,int y,Direction direction){
        this.x = x;
        this.y = y;
        this.direction = direction;
        //this.destroyed = false;
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

    public boolean isDestroyed() {
        return destroyed;
    }

    @Override
    public void destroy(){
        x = -100;
        y = -100;
      direction = direction.NONE;
        destroyed = true;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(new Color(0, 0, 0));
        g.fillRect(this.getX(), this.getY(), 14, 14);
    }
}
