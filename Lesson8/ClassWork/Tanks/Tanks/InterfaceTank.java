package Lesson8.ClassWork.Tanks.Tanks;


import Lesson8.ClassWork.Tanks.BattelField.Interfaces.Destroyable;
import Lesson8.ClassWork.Tanks.BattelField.Interfaces.Drawable;
import Lesson8.ClassWork.Tanks.Direction;

public interface InterfaceTank extends Drawable,Destroyable {

    public Action setUp();

    public void move();

    public Bullet fire() throws Exception;

    public int getX();

    public int getY();

    public Direction getDirection();

    public void updateX(int x);

    public void updateY(int y);

    public int getSpeed();

    public int getMovePath();

}
