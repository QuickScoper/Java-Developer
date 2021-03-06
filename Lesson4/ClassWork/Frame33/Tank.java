package Lesson4.ClassWork.Frame33;

import java.util.Random;

public class Tank {

    private int x;
    private int y;
    private int speed = 10;
    private Direction direction;

    private ActionField af;
    private BattleField bf;

    Tank(ActionField af,BattleField bf){
        this(af,bf,64,64,Direction.DOWN);
    }

    Tank(ActionField af,BattleField bf,int x,int y, Direction direction){
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

    public void updateX(int x){
        this.x+=x;
    }
    public void updateY(int y){
        this.y+=y;
    }

    public void move()throws Exception{
        af.processMove(this);
    }
    public void fire()throws Exception{
        Bullet bullet = new Bullet((x+25),(y+25),direction);
        af.processFire(bullet);
    }

    public void turn(Direction direction) throws Exception{
        this.direction = direction;
        af.processTurn(this);
    }

    public void moveRandom() throws Exception{
        Random r = new Random();
        int i;
        while (true) {
            i = r.nextInt(5);
            if (i > 0) {
                if(i == 1){direction = Direction.UP;}
                if(i == 2){direction = Direction.DOWN;}
                if(i == 3){direction = Direction.LEFT;}
                if(i == 4){direction = Direction.RIGHT;}
                fire();
                af.processTurn(this);
                af.processMove(this);
            }
        }
    }



}
