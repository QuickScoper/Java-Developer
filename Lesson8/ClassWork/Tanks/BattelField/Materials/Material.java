package Lesson8.ClassWork.Tanks.BattelField.Materials;


import Lesson8.ClassWork.Tanks.BattelField.Interfaces.Destroyable;
import Lesson8.ClassWork.Tanks.BattelField.Interfaces.Drawable;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;


public abstract class Material implements Drawable, Destroyable {

    protected int x;
    protected int y;
    protected boolean destroyed = false;
    protected Color color;
    protected String name;
    protected Image image;


    Material(int x, int y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public void destroy() {
        destroyed = true;
    }

    @Override
    public void draw(Graphics g){
        if (!destroyed) {
            if (image != null) {
                    if (image.equals((new File("eagle.png")))) {

                        g.drawImage(image, getX(), getY(), new ImageObserver() {
                            @Override
                            public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
                                return false;
                            }
                        });
                    }

                    g.drawImage(image, getX(), getY(), getX() + 64, getY() + 64, getX(), getY(), getX() + 64, getY() + 64, new ImageObserver() {
                        @Override
                        public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
                            return false;
                        }
                    });

                }else{
                    g.setColor(this.color);
                    g.fillRect(this.getX(), this.getY(), 64, 64);
                }
            }

        }


    public boolean isDestroyed(){
        return destroyed;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}


