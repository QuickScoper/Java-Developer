package Lesson6.HomeWork.Tanks.Materials;


import Lesson6.HomeWork.Tanks.Interfaces.Destroyable;
import Lesson6.HomeWork.Tanks.Interfaces.Drawable;

import java.awt.*;


public abstract class Material implements Drawable, Destroyable {

    protected int x;
    protected int y;
    protected boolean destroyable = false;
    protected Color color;
    protected String name;


    Material(int x, int y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public void destroy() {
        destroyable = true;
    }

    @Override
    public void draw(Graphics g) {
        if (!destroyable) {
            g.setColor(this.color);
            g.fillRect(this.getX(),this.getY(),64,64);
        }

    }

    public boolean destroyable(){
        return destroyable;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}


