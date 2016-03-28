package Lesson6.HomeWork.Tanks;


import Lesson6.HomeWork.Tanks.Materials.Ground;
import Lesson6.HomeWork.Tanks.Materials.Material;
import Lesson6.HomeWork.Tanks.Materials.Rock;
import Lesson6.HomeWork.Tanks.Materials.Water;

import javax.swing.*;
import java.awt.*;

public class ActionField extends JPanel {

    private BattleField battleField;
    private Bullet bullet;
    private Tank defender;
    private Direction direction;
    private Tiger agressor;
    private Rock rock;

    final boolean COLORDED_MODE = false;


    public void runTheGame() throws Exception {

//        defender.moveRandom();
        clean();
    }

    String getQuadrant(int x, int y) {
        return y / 64 + "_" + x / 64;
    }


    void processMove(Tank tank) throws Exception {
        this.defender = tank;
        int step = 1;
        int covered = 0;
        Direction dir = tank.getDirection();

        if ((dir == direction.UP && tank.getY() == 0) || (dir == direction.DOWN && tank.getY() >= 512)
                || (dir == Direction.LEFT && tank.getX() == 0)
                || (dir == Direction.RIGHT && tank.getX() >= 512)) {
            System.out.println("[illegal move] direction: " + tank.getDirection()
                    + " tankX: " + tank.getX() + ", tankY: " + tank.getY());
            return;
        }

        tank.turn(dir);

        while (covered < 64) {

            if (dir == direction.UP) {
                tank.updateY(-step);
                System.out.println("[move up] direction: " + tank.getDirection()
                        + " tankX: " + tank.getX() + ", tankY: " + tank.getY());
            } else if (dir == direction.DOWN) {
                tank.updateY(step);
                System.out.println("[move down] direction: " + tank.getDirection()
                        + " tankX: " + tank.getX() + ", tankY: " + tank.getY());
            } else if (dir == direction.LEFT) {
                tank.updateX(-step);
                System.out.println("[move left] direction: " + tank.getDirection()
                        + " tankX: " + tank.getX() + ", tankY: " + tank.getY());
            } else {
                tank.updateX(step);
                System.out.println("[move right] direction: " + tank.getDirection()
                        + " tankX: " + tank.getX() + ", tankY: " + tank.getY());
            }
            covered += step;

            repaint();
            Thread.sleep(tank.getSpeed());
        }


    }


    void processTurn(Tank tank) throws Exception {
        repaint();
    }


    void processFire(Bullet bullet) throws Exception {
        this.bullet = bullet;
        int step = 1;

        while ((bullet.getX() > -14 && bullet.getX() < 590)
                && (bullet.getY() > -14 && bullet.getY() < 590)) {
            if (defender.getDirection() == Direction.UP) {
                bullet.updateY(-step);
            } else if (defender.getDirection() == Direction.DOWN) {
                bullet.updateY(step);
            } else if (defender.getDirection() == direction.LEFT) {
                bullet.updateX(-step);
            } else {
                bullet.updateX(step);
            }
            if (processInterception()) {
                bullet.destroy();
            }
            repaint();
            Thread.sleep(bullet.getSpeed());
        }

    }

    void moveToQuadrant(int v, int h) throws Exception {
        String coordinates = getQuadrantXY(v, h);
        int separator = coordinates.indexOf("_");
        int x = Integer.parseInt(coordinates.substring(0, separator));
        int y = Integer.parseInt(coordinates.substring(separator + 1));

        if (defender.getX() < x) {
            while (defender.getX() != x) {
                defender.turn(Direction.RIGHT);
                defender.fire();
                defender.move();
            }
        } else {
            while (defender.getX() != x) {
                defender.turn(Direction.LEFT);
                defender.fire();
                defender.move();
            }
        }
        if (defender.getY() < y) {
            while (defender.getY() != y) {
                defender.turn(Direction.DOWN);
                defender.fire();
                defender.move();
            }
        } else {
            while (defender.getY() != y) {
                defender.turn(Direction.UP);
                defender.fire();
                defender.move();
            }
        }
    }


    void clean() throws Exception {


        moveToQuadrant(1, 1);
        defender.turn(Direction.DOWN);
        while (bullet.getX() == -100) {
            defender.fire();
        }
        moveToQuadrant(2, 1);
        defender.turn(Direction.DOWN);
        while (bullet.getX() == -100) {
            defender.fire();
        }
        moveToQuadrant(3, 1);
        defender.turn(Direction.DOWN);
        while (bullet.getX() == -100) {
            defender.fire();
        }
        moveToQuadrant(4, 1);
        defender.turn(Direction.DOWN);
        while (bullet.getX() == -100) {
            defender.fire();
        }
        moveToQuadrant(5, 1);
        defender.turn(Direction.DOWN);
        while (bullet.getX() == -100) {
            defender.fire();
        }
        moveToQuadrant(6, 1);
        defender.turn(Direction.DOWN);
        while (bullet.getX() == -100) {
            defender.fire();
        }
        moveToQuadrant(7, 1);
        defender.turn(Direction.DOWN);
        while (bullet.getX() == -100) {
            defender.fire();
        }
        moveToQuadrant(8, 1);
        defender.turn(Direction.DOWN);
        while (bullet.getX() == -100) {
            defender.fire();
        }
        moveToQuadrant(9, 1);
        defender.turn(Direction.DOWN);
        while (bullet.getX() == -100) {
            defender.fire();
        }


    }


    public boolean processInterception() {

        String coordinates = getQuadrant(bullet.getX(), bullet.getY());
        int y = Integer.parseInt(coordinates.split("_")[0]);
        int x = Integer.parseInt(coordinates.split("_")[1]);

        if (y >= 0 && y < 9 && x >= 0 && x < 9) {
            Material material = battleField.scanQuadrant(y,x);
            if (!material.destroyable() && !(material instanceof Rock) && !(material instanceof Water) &&
                    !(material instanceof Ground)) {
                battleField.updateQuadrant(y, x);
                return true;
            }

            if(material instanceof Rock){
                bullet.destroy();
            }

            if (checkProcInterception(getQuadrant(agressor.getX(), agressor.getY()), coordinates)) {
                agressor.destroy();
                return true;
            }

//            if (checkProcInterception(getQuadrant(defender.getX(), defender.getY()), coordinates)) {
//                defender.destroy();
//                return true;
//            }
        }

        return false;
    }


    public boolean checkProcInterception(String coordinates, String quadrant) {
        int cy = Integer.parseInt(coordinates.split("_")[0]);
        int cx = Integer.parseInt(coordinates.split("_")[1]);

        int qy = Integer.parseInt(quadrant.split("_")[0]);
        int qx = Integer.parseInt(quadrant.split("_")[1]);

        if (cy >= 0 && cx >= 0 && cy < 9 && cx < 9) {
            if (cy == qy && cx == qx) {
                return true;
            }
        }
        return false;
    }

    public String getQuadrantXY(int v, int h) {
        return (v - 1) * 64 + "_" + (h - 1) * 64;
    }


    public ActionField() throws Exception {
        battleField = new BattleField();
        defender = new T34(this, battleField);
        bullet = new Bullet(-100, -100, Direction.NONE);
        String location = battleField.getAgressorLocation();
        agressor = new Tiger(this, battleField,
                Integer.parseInt(location.split("_")[1]), Integer.parseInt(location.split("_")[0]), Direction.LEFT);


        JFrame frame = new JFrame("BATTLE FIELD, DAY 2");
        frame.setLocation(750, 150);
        frame.setMinimumSize(new Dimension(battleField.getWidth() + 16, battleField.getHeight() + 38));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(this);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int i = 0;
        Color cc;
        for (int v = 0; v < 9; v++) {
            for (int h = 0; h < 9; h++) {
                if (COLORDED_MODE) {
                    if (i % 2 == 0) {
                        cc = new Color(252, 241, 177);
                    } else {
                        cc = new Color(233, 243, 255);
                    }
                } else {
                    cc = new Color(200,200,100);
                }
                i++;
                g.setColor(cc);
                g.fillRect(h * 64, v * 64, 64, 64);
            }
        }

       battleField.draw(g);
//        for (int j = 0; j < battleField.getDimensionY(); j++) {
//            for (int k = 0; k < battleField.getDimensionX(); k++) {
//                if (battleField.scanQuadrant(j, k).equals("R")) {
//                    String coordinates = getQuadrantXY(j + 1, k + 1);
//                    int separator = coordinates.indexOf("_");
//                    int y = Integer.parseInt(coordinates
//                            .substring(0, separator));
//                    int x = Integer.parseInt(coordinates
//                            .substring(separator + 1));
//                    g.setColor(new Color(250, 200,110));
//                    g.fillRect(x, y, 64, 64);
//                }
//            }
//        }
        defender.draw(g);
        agressor.draw(g);
        bullet.draw(g);


    }

}
