package Lesson8.ClassWork.Tanks.Tanks;

import Lesson8.ClassWork.Tanks.BattelField.BattleField;
import Lesson8.ClassWork.Tanks.Direction;

import java.awt.*;
import java.awt.image.ImageObserver;

public abstract class Tank implements InterfaceTank {

    protected int x;
    protected int y;
    protected int speed = 10;
    protected Direction direction;
    protected Color tankColor;
    protected Color gunColor;
    protected int movePath = 1;
    private boolean destroyed;
    private Bullet bullet;
    protected Image[] image;

//    protected ActionField af;
    protected BattleField bf;

    public Tank(BattleField bf) {
        this(bf, 64, 448, Direction.RIGHT);
    }

    public Image[] getImage() {
        return image;
    }

    public void setImage(Image[] image) {
        this.image = image;
    }

    public Tank(BattleField bf, int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.destroyed = false;
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

    public void move() {

    }

    public Bullet fire() throws Exception{


        bullet = new Bullet(x + 25, y + 25, direction);
//        int bulletX = -100;
//        int bulletY = -100;
//        if (direction == Direction.UP) {
//            bulletX = x + 25;
//            bulletY = y - 64;
//        } else if (direction == Direction.DOWN) {
//            bulletX = x + 25;
//            bulletY = y + 64;
//        } else if (direction == Direction.LEFT) {
//            bulletX = x - 64;
//            bulletY = y + 25;
//        } else if (direction == Direction.RIGHT) {
//            bulletX = x + 64;
//            bulletY = y + 25;
//        }
//        return new Bullet(bulletX, bulletY, direction);
        return  bullet;
    }

    public void turn(Direction direction) {
        this.direction = direction;
    }

//    public void moveRandom() throws Exception {
//        Random r = new Random();
//        int i;
//        while (true) {
//            i = r.nextInt(5);
//            if (i > 0) {
//                if (i == 1) {
//                    direction = Direction.UP;
//                }
//                if (i == 2) {
//                    direction = Direction.DOWN;
//                }
//                if (i == 3) {
//                    direction = Direction.LEFT;
//                }
//                if (i == 4) {
//                    direction = Direction.RIGHT;
//                }
//                fire();
//                af.processTurn(this);
//                af.processMove(this);
//            }
//        }
//    }

    @Override
    public void destroy() throws InterruptedException, Exception {
        // TODO Auto-generated method stub
        direction = Direction.NONE;
        destroyed = true;

    }


    public boolean isDestroyed() {
        return destroyed;
    }

    @Override
    public int getMovePath() {
        return movePath;
    }

    public void moveToQuadrant(int v, int h) throws Exception {
    }

    public void moveRandom() throws Exception {
    }

    public void clean() throws Exception {

    }


    public Bullet getBullet() {
        return bullet;
    }

    @Override
    public void draw(Graphics g) {
        if(!destroyed) {
            if (image != null) {
                int x = getX();
                int y = getY()-70;
                if (getDirection().getId() == 2 || getDirection().getId() == 3){
                    x -=56;
                    y = y;
                }else{
                    x -= 70;
                    y += 20;
                }
                g.drawImage(image[getDirection().getId()], x, y,
                        new ImageObserver() {
                            @Override
                            public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
                                return false;
                            }
                        });
            } else {
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
    }


}
