package Lesson8.ClassWork.Tanks;


import Lesson8.ClassWork.Tanks.BattelField.BattleField;
import Lesson8.ClassWork.Tanks.BattelField.Materials.*;
import Lesson8.ClassWork.Tanks.Tanks.*;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ActionField extends JPanel {

    private BattleField battleField;
    private Bullet bullet;
    private Tank defender;
    private Direction direction;
    private Tiger agressor;


    final boolean COLORDED_MODE = false;


    public void runTheGame() throws Exception {

//        while (true) {
//            if (!agressor.isDestroyed() && !defender.isDestroyed()) {
//                processAction(agressor.setUp(), agressor);
//            }
//            if (!agressor.isDestroyed() && !defender.isDestroyed()) {
//                processAction(defender.setUp(), defender);
//            }
//        }

//
        if (agressor.findEagle(5 * 64, 8 * 64)) {
            moveToQuadrant(agressor, 5, 8);
        } else {
            throw new IllegalStateException("WRONG COORDINATES OF EAGLE!");
        }
//        defender.moveRandom();
//        clean();
    }

    public static String getQuadrant(int x, int y) {
        return y / 64 + "_" + x / 64;
    }


    public void processAction(Lesson8.ClassWork.Tanks.Tanks.Action a, Tank t) throws Exception {
        if (a == Lesson8.ClassWork.Tanks.Tanks.Action.MOVE) {
            if (checkNextQuadrant(t)) {
                processMove(t);
            }
        } else if (a == Lesson8.ClassWork.Tanks.Tanks.Action.FIRE) {
            processTurn(t);
            processFire(t);
        }

    }


    public void processMove(Tank tank) throws Exception {
        processTurn(tank);
        int step = 1;
//        int covered = 0;
        Direction dir = tank.getDirection();

        for (int i = 0; i < tank.getMovePath(); i++) {
            int covered = 0;

//            String tankQuadrant = getQuadrant(tank.getX(), tank.getY());
//            int v = Integer.parseInt(tankQuadrant.split("_")[0]);
//            int h = Integer.parseInt(tankQuadrant.split("_")[1]);

            if ((dir == Direction.UP && tank.getY() == 0) || (dir == Direction.DOWN && tank.getY() >= 512)
                    || (dir == Direction.LEFT && tank.getX() == 0)
                    || (dir == Direction.RIGHT && tank.getX() >= 512)) {
                System.out.println("[illegal move] direction: " + tank.getDirection()
                        + " tankX: " + tank.getX() + ", tankY: " + tank.getY());
                return;
            }

            if (!checkNextQuadrant(tank)) {
                return;
            }

            while (covered < 64) {

                if (dir == Direction.UP) {
                    tank.updateY(-step);
//                    System.out.println("[move up] direction: " + tank.getDirection()
//                            + " tankX: " + tank.getX() + ", tankY: " + tank.getY());
                } else if (dir == Direction.DOWN) {
                    tank.updateY(step);
//                    System.out.println("[move down] direction: " + tank.getDirection()
//                            + " tankX: " + tank.getX() + ", tankY: " + tank.getY());
                } else if (dir == Direction.LEFT) {
                    tank.updateX(-step);
//                    System.out.println("[move left] direction: " + tank.getDirection()
//                            + " tankX: " + tank.getX() + ", tankY: " + tank.getY());
                } else {
                    tank.updateX(step);
//                    System.out.println("[move right] direction: " + tank.getDirection()
//                            + " tankX: " + tank.getX() + ", tankY: " + tank.getY());
                }
                covered += step;

                repaint();
                Thread.sleep(tank.getSpeed());
            }

        }
    }


    public void processMoveRandom(Tank tank) throws Exception {

        Random r = new Random();
        int i;
        i = r.nextInt(5);
        if (i > 0) {
            tank.turn(Direction.getDirection(i));
            processMove(tank);
        }
    }


    public boolean checkNextQuadrant(Tank tank) throws Exception {


        Direction dir = tank.getDirection();

        String tankQuadrant = getQuadrant(tank.getX(), tank.getY());
        int v = Integer.parseInt(tankQuadrant.split("_")[0]);
        int h = Integer.parseInt(tankQuadrant.split("_")[1]);

        String agressorCoordinates = getQuadrant(agressor.getX(), agressor.getY());
        String defenderCoordinates = getQuadrant(defender.getX(), defender.getY());


        if (dir == Direction.UP && v > 0) {
            v--;
        } else if (dir == Direction.DOWN && v < 9) {
            v++;
        } else if (dir == Direction.RIGHT && h < 9) {
            h++;
        } else if (dir == Direction.LEFT && h > 0) {
            h--;
        }


        if (v < 0 || v > 8 || h < 0 || h > 8) {
            return false;
        }

        String coordinatesNext = getQuadrantXY(v, h);
        int vNext = Integer.parseInt(coordinatesNext.split("_")[0]);
        int hNext = Integer.parseInt(coordinatesNext.split("_")[1]);

        String quadrantNext = getQuadrant(hNext, vNext);

        if (tank instanceof T34 && agressorCoordinates.equals(quadrantNext) && !(agressor.isDestroyed())) {
            processFire(tank);
        }

        if (tank instanceof Tiger && defenderCoordinates.equals(quadrantNext) && !(defender.isDestroyed())) {
            processFire(tank);
        }

        Material material = battleField.scanQuadrant(v, h);

        if (/*!(material instanceof Water) &&*/ !(material.isDestroyed()) && !(material instanceof Ground)) {
            if (material instanceof Brick){
                processFire(tank);
            } else if (tank instanceof Tiger && material instanceof Rock) {
                processFire(tank);
            }else  if(material instanceof Eagle && tank instanceof Tiger){
                processFire(tank);
               throw new IllegalStateException("GAME IS OVER!");

            }else {
                processMoveRandom(tank);
            }
        }

        if (isTheNextQuadrantEmpty(hNext, vNext)) {
            return true;
        }

        return false;
    }


    public boolean isTheNextQuadrantEmpty(int checkX, int checkY) {

        String coordinates;
        coordinates = getQuadrant(checkX, checkY);

        int separator = coordinates.indexOf("_");
        int y = Integer.parseInt(coordinates.substring(0, separator));
        int x = Integer.parseInt(coordinates.substring(separator + 1));

        String agressorLocation = getQuadrant(agressor.getX(), agressor.getY());
        String defenderLocation = getQuadrant(defender.getX(), defender.getY());

        if (x >= 0 && x < battleField.getDimensionX() && y >= 0 && y < battleField.getDimensionY()) {

            Material material = battleField.scanQuadrant(y, x);

            if (!(material.isDestroyed()) /*&& !(material instanceof Water)*/ && !(material instanceof Ground)) {
                return false;
            }

            if ((agressorLocation.equals(coordinates) && !(agressor.isDestroyed())) || (defenderLocation.equals(coordinates) && !(defender.isDestroyed()))) {
                return false;
            }

        }
        return true;
    }


    public void processTurn(Tank tank) throws Exception {
        repaint();
    }


    public void processFire(Tank tank) throws Exception {
        this.bullet = tank.fire();
        Direction direction = bullet.getDirection();
        int step = 1;


        while ((bullet.getX() > -14 && bullet.getX() < 590)
                && (bullet.getY() > -14 && bullet.getY() < 590)) {
            if (direction == Direction.UP) {
                bullet.updateY(-step);
            } else if (direction == Direction.DOWN) {
                bullet.updateY(step);
            } else if (direction == Direction.LEFT) {
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

    public void moveToQuadrant(Tank tank, int v, int h) throws Exception {
        String coordinates = getQuadrantXY(v, h);
        int separator = coordinates.indexOf("_");
        int x = Integer.parseInt(coordinates.substring(0, separator));
        int y = Integer.parseInt(coordinates.substring(separator + 1));

        while (tank.getX() != x || tank.getY() != y){

            if (tank.getX() < x) {
                while (tank.getX() != x) {
                    tank.turn(Direction.RIGHT);
                    //   checkNextQuadrant(tank);
                    processMove(tank);
                }
            } else {
                while (tank.getX() != x) {
                    tank.turn(Direction.LEFT);
                    //checkNextQuadrant(tank);
                    processMove(tank);
                }
            }
            if (tank.getY() < y) {
                while (tank.getY() != y) {
                    tank.turn(Direction.DOWN);
                    //checkNextQuadrant(tank);
                    processMove(tank);
                }
            } else {
                while (tank.getY() != y) {
                    tank.turn(Direction.UP);
                    //     checkNextQuadrant(tank);
                    processMove(tank);
                }
            }

        }

    }


    public void processRandomAction(Tank tank)throws Exception{

        Random r = new Random();

        while (true) {
            int i;

            i = r.nextInt(2);
            if (i > 0) {
                if (i == 1) {
                    processMoveRandom(tank);
                } else {
                    processFire(tank);
                }
            }
        }

    }



    void clean() throws Exception {


//        moveToQuadrant(1, 1);
//        defender.turn(Direction.DOWN);
//        while (bullet.getX() == -100) {
//            defender.fire();
//        }
//        moveToQuadrant(2, 1);
//        defender.turn(Direction.DOWN);
//        while (bullet.getX() == -100) {
//            defender.fire();
//        }
//        moveToQuadrant(3, 1);
//        defender.turn(Direction.DOWN);
//        while (bullet.getX() == -100) {
//            defender.fire();
//        }
//        moveToQuadrant(4, 1);
//        defender.turn(Direction.DOWN);
//        while (bullet.getX() == -100) {
//            defender.fire();
//        }
//        moveToQuadrant(5, 1);
//        defender.turn(Direction.DOWN);
//        while (bullet.getX() == -100) {
//            defender.fire();
//        }
//        moveToQuadrant(6, 1);
//        defender.turn(Direction.DOWN);
//        while (bullet.getX() == -100) {
//            defender.fire();
//        }
//        moveToQuadrant(7, 1);
//        defender.turn(Direction.DOWN);
//        while (bullet.getX() == -100) {
//            defender.fire();
//        }
//        moveToQuadrant(8, 1);
//        defender.turn(Direction.DOWN);
//        while (bullet.getX() == -100) {
//            defender.fire();
//        }
//        moveToQuadrant(9, 1);
//        defender.turn(Direction.DOWN);
//        while (bullet.getX() == -100) {
//            defender.fire();
//        }


    }


    public boolean processInterception() throws Exception {


        boolean isTiger = (agressor instanceof Tiger);

        String coordinates = getQuadrant(bullet.getX(), bullet.getY());
        int y = Integer.parseInt(coordinates.split("_")[0]);
        int x = Integer.parseInt(coordinates.split("_")[1]);


        String agressorCoordinates = getQuadrant(agressor.getX(), agressor.getY());
        String defenderCoordinates = getQuadrant(defender.getX(), defender.getY());


        if (y >= 0 && y < battleField.getDimensionY() && x >= 0 && x < battleField.getDimensionX()) {
            Material material = battleField.scanQuadrant(y, x);

            if (!material.isDestroyed() && !(material instanceof Water) &&
                    !(material instanceof Ground)) {

                if (material instanceof Rock) {
                    if (isTiger && bullet == agressor.getBullet()) {
                        battleField.destroyQuadrant(y, x);
                    } else {
                        bullet.destroy();
                    }
                } else {
                    battleField.destroyQuadrant(y, x);
                }
                return true;
            }

//            if (material instanceof Rock) {
//                bullet.destroy();
//            }

            if (agressorCoordinates.equals(coordinates) && agressor.getBullet() != bullet) {
                agressor.destroy();
                return true;
            }

            if (defenderCoordinates.equals(coordinates) && defender.getBullet() != bullet) {
                defender.destroy();
                return true;
            }
        }

        return false;
    }


//    public boolean checkProcInterception(String coordinates, String quadrant) {
//        int cy = Integer.parseInt(coordinates.split("_")[0]);
//        int cx = Integer.parseInt(coordinates.split("_")[1]);
//
//        int qy = Integer.parseInt(quadrant.split("_")[0]);
//        int qx = Integer.parseInt(quadrant.split("_")[1]);
//
//        if (cy >= 0 && cx >= 0 && cy < 9 && cx < 9) {
//            if (cy == qy && cx == qx) {
//                return true;
//            }
//        }
//        return false;
//    }

    public String getQuadrantXY(int v, int h) {
        return v * 64 + "_" + h * 64;
    }


    public ActionField() throws Exception {
        battleField = new BattleField();
        defender = new T34(battleField);
        bullet = new Bullet(-100, -100, Direction.NONE);
        String location = battleField.getAgressorLocation();
        agressor = new Tiger(battleField,
                Integer.parseInt(location.split("_")[1]), Integer.parseInt(location.split("_")[0]), Direction.LEFT);
//        bt7 = new BT7(battleField,
//                Integer.parseInt(location.split("_")[1]), Integer.parseInt(location.split("_")[0]), Direction.LEFT);


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
                    cc = new Color(129, 124, 100);
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
