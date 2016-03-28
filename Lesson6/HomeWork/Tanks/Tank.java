package Lesson6.HomeWork.Tanks;

import Lesson6.HomeWork.Tanks.Interfaces.Destroyable;
import Lesson6.HomeWork.Tanks.Interfaces.Drawable;

import java.awt.*;
import java.util.Random;

public abstract class Tank implements Drawable,Destroyable {

    protected int x;
    protected int y;
    protected int speed = 10;
    protected Direction direction;
    protected Color tankColor;
    protected Color gunColor;

    protected ActionField af;
    protected BattleField bf;

    public Tank(ActionField af, BattleField bf) {
        this(af, bf, 64, 64, Direction.DOWN);
    }

    public Tank(ActionField af, BattleField bf, int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.af = af;
        this.bf = bf;
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

    public void updateX(int x) {
        this.x += x;
    }

    public void updateY(int y) {
        this.y += y;
    }

    public void move() throws Exception {
        af.processMove(this);
    }

    public void fire() throws Exception {
        Bullet bullet = new Bullet((x + 25), (y + 25), direction);
        af.processFire(bullet);
    }

    public void turn(Direction direction) throws Exception {
        this.direction = direction;
        af.processTurn(this);
    }

    public void moveRandom() throws Exception {
        Random r = new Random();
        int i;
        while (true) {
            i = r.nextInt(5);
            if (i > 0) {
                if (i == 1) {
                    direction = Direction.UP;
                }
                if (i == 2) {
                    direction = Direction.DOWN;
                }
                if (i == 3) {
                    direction = Direction.LEFT;
                }
                if (i == 4) {
                    direction = Direction.RIGHT;
                }
                fire();
                af.processTurn(this);
                af.processMove(this);
            }
        }
    }

    public void destroy() {
        x = -100;
        y = -100;
    }

    @Override
    public void draw(Graphics g) {

        g.setColor(tankColor);
        g.fillRect(this.getX(), this.getY(), 64, 64);

        g.setColor(gunColor);
        if (this.getDirection() == direction.UP) {
            g.fillRect(this.getX() + 20, this.getY(), 24, 34);
        } else if (this.getDirection() == direction.DOWN) {
            g.fillRect(this.getX() + 20, this.getY() + 30, 24, 34);
        } else if (this.getDirection() == direction.LEFT) {
            g.fillRect(this.getX(), this.getY() + 20, 34, 24);
        } else {
            g.fillRect(this.getX() + 30, this.getY() + 20, 34, 24);
        }
    }
}
