package Lesson7.Classwork.Refactoring.Tanks;


import Lesson7.Classwork.Refactoring.BattelField.Interfaces.Drawable;
import Lesson7.Classwork.Refactoring.BattelField.Interfaces.Destroyable;
import Lesson7.Classwork.Refactoring.Direction;

public interface InterfaceTank extends Drawable,Destroyable{

    public Action setUp();

    public void move();

    public Bullet fire();

    public int getX();

    public int getY();

    public Direction getDirection();

    public void updateX(int x);

    public void updateY(int y);

    public int getSpeed();

    public int getMovePath();

}
