package Lesson7.Classwork.Refactoring.Tanks;


import Lesson7.Classwork.Refactoring.BattelField.Interfaces.Destroyable;
import Lesson7.Classwork.Refactoring.BattelField.Interfaces.Drawable;
import Lesson7.Classwork.Refactoring.Direction;

import java.awt.*;

public class Bullet implements Drawable,Destroyable {

    private int x;
    private int y;
    private int speed = 10;
    private Direction direction;

    private boolean destroyed;

    public Bullet(int x,int y,Direction direction){
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.destroyed = false;
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
      destroyed = true;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(new Color(0, 0, 0));
        g.fillRect(this.getX(), this.getY(), 14, 14);
    }
}
