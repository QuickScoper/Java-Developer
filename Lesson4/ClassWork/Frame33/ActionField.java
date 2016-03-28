package Lesson4.ClassWork.Frame33;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class ActionField extends JPanel {

    private BattleField battleField;
    private Bullet bullet;
    private Tank tank;
    private Direction direction;

    final boolean COLORDED_MODE = false;


    public void runTheGame() throws Exception {

        tank.moveRandom();
//        clean();
    }

    String getQuadrant(int x, int y) {
        return y / 64 + "_" + x / 64;
    }


    void processMove(Tank tank) throws Exception {
        this.tank = tank;
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
            if (tank.getDirection() == Direction.UP) {
                bullet.updateY(-step);
            } else if (tank.getDirection() == Direction.DOWN) {
                bullet.updateY(step);
            } else if (tank.getDirection() == direction.LEFT) {
                bullet.updateX(-step);
            } else {
                bullet.updateX(step);
            }
            if (processInterception()) {
                bullet.destoy();
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

        if (tank.getX() < x) {
            while (tank.getX() != x) {
                tank.turn(Direction.RIGHT);
                tank.fire();
                tank.move();
            }
        } else {
            while (tank.getX() != x) {
                tank.turn(Direction.LEFT);
                tank.fire();
                tank.move();
            }
        }
        if (tank.getY() < y) {
            while (tank.getY() != y) {
                tank.turn(Direction.DOWN);
                tank.fire();
                tank.move();
            }
        } else {
            while (tank.getY() != y) {
                tank.turn(Direction.UP);
                tank.fire();
                tank.move();
            }
        }
    }


    void clean() throws Exception {

//        int x= tank.getX()/64;
//        int y = tank.getY()/64;
//        int x1 = tank.getX();
//        int y1 = tank.getY();
//
//            int coor = 0;
//
//            if ((battleField.scanQuadrant(x + 1, y) == "B")) {
//                coor = 1;
//            } else if (battleField.scanQuadrant(x + 1, y + 1) == "B") {
//                coor = 2;
//            } else if (battleField.scanQuadrant(x, y + 1) == "B") {
//                coor = 3;
//            } else if (battleField.scanQuadrant(x + 1, y - 1) == "B") {
//                coor = 4;
//            } else if (battleField.scanQuadrant(x, y - 1) == "B") {
//                coor = 5;
//            } else if (battleField.scanQuadrant(x - 1, y - 1) == "B") {
//                coor = 6;
//            } else if (battleField.scanQuadrant(x - 1, y) == "B") {
//                coor = 7;
//            } else if (battleField.scanQuadrant(x - 1, y + 1) == "B") {
//                coor = 8;
//            }
//
//            if (coor == 1) {
//                moveToQuadrant(x1 + 64, y1);
//            }else
//            if (coor == 2) {
//                moveToQuadrant(x1 + 64, y1 + 64);
//            }else
//            if (coor == 3) {
//                moveToQuadrant(x1, y1 + 64);
//            }else
//            if (coor == 4) {
//                moveToQuadrant(x1 + 64, y1 - 64);
//            }else
//            if (coor == 5) {
//                moveToQuadrant(x1, y1 - 64);
//            }else
//            if (coor == 6) {
//                moveToQuadrant(x1 - 64, y1 - 64);
//            }else
//            if (coor == 7) {
//                moveToQuadrant(x1 - 64, y1);
//            }else
//            if (coor == 8) {
//                moveToQuadrant(x1 - 64, y1 + 64);
//            }
//

        moveToQuadrant(1, 1);
        tank.turn(Direction.DOWN);
        while (bullet.getX() == -100) {
            tank.fire();
        }
        moveToQuadrant(2, 1);
        tank.turn(Direction.DOWN);
        while (bullet.getX() == -100) {
            tank.fire();
        }
        moveToQuadrant(3, 1);
        tank.turn(Direction.DOWN);
        while (bullet.getX() == -100) {
            tank.fire();
        }
        moveToQuadrant(4, 1);
        tank.turn(Direction.DOWN);
        while (bullet.getX() == -100) {
            tank.fire();
        }
        moveToQuadrant(5, 1);
        tank.turn(Direction.DOWN);
        while (bullet.getX() == -100) {
            tank.fire();
        }
        moveToQuadrant(6, 1);
        tank.turn(Direction.DOWN);
        while (bullet.getX() == -100) {
            tank.fire();
        }
        moveToQuadrant(7, 1);
        tank.turn(Direction.DOWN);
        while (bullet.getX() == -100) {
            tank.fire();
        }
        moveToQuadrant(8, 1);
        tank.turn(Direction.DOWN);
        while (bullet.getX() == -100) {
            tank.fire();
        }
        moveToQuadrant(9, 1);
        tank.turn(Direction.DOWN);
        while (bullet.getX() == -100) {
            tank.fire();
        }


    }


    boolean processInterception() {

        String coordinates = getQuadrant(bullet.getX(), bullet.getY());
        int y = Integer.parseInt(coordinates.split("_")[0]);
        int x = Integer.parseInt(coordinates.split("_")[1]);

        if (y >= 0 && y < 9 && x >= 0 && x < 9) {
            if (!battleField.scanQuadrant(y, x).trim().isEmpty()) {
                battleField.updateQuadrant(y, x, "");
                return true;
            }
        }

        return false;
    }

    String getQuadrantXY(int v, int h) {
        return (v - 1) * 64 + "_" + (h - 1) * 64;
    }


    public ActionField() throws Exception {
        battleField = new BattleField();
        tank = new Tank(this, battleField);
        bullet = new Bullet(-100, -100, Direction.NONE);

        JFrame frame = new JFrame("BATTLE FIELD, DAY 2");
        frame.setLocation(750, 150);
        frame.setMinimumSize(new Dimension(battleField.getWidth() + 15, battleField.getHeight() + 22));
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
                    cc = new Color(180, 180, 180);
                }
                i++;
                g.setColor(cc);
                g.fillRect(h * 64, v * 64, 64, 64);
            }
        }

        for (int j = 0; j < battleField.getDimensionY(); j++) {
            for (int k = 0; k < battleField.getDimensionX(); k++) {
                if (battleField.scanQuadrant(j, k).equals("B")) {
                    String coordinates = getQuadrantXY(j + 1, k + 1);
                    int separator = coordinates.indexOf("_");
                    int y = Integer.parseInt(coordinates
                            .substring(0, separator));
                    int x = Integer.parseInt(coordinates
                            .substring(separator + 1));
                    g.setColor(new Color(0, 0, 255));
                    g.fillRect(x, y, 64, 64);
                }
            }
        }

        g.setColor(new Color(255, 0, 0));
        g.fillRect(tank.getX(), tank.getY(), 64, 64);

        g.setColor(new Color(0, 255, 0));
        if (tank.getDirection() == direction.UP) {
            g.fillRect(tank.getX() + 20, tank.getY(), 24, 34);
        } else if (tank.getDirection() == direction.DOWN) {
            g.fillRect(tank.getX() + 20, tank.getY() + 30, 24, 34);
        } else if (tank.getDirection() == direction.LEFT) {
            g.fillRect(tank.getX(), tank.getY() + 20, 34, 24);
        } else {
            g.fillRect(tank.getX() + 30, tank.getY() + 20, 34, 24);
        }

        g.setColor(new Color(255, 255, 0));
        g.fillRect(bullet.getX(), bullet.getY(), 14, 14);
    }

}
