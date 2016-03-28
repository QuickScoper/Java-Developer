package Lesson8.ClassWork.Tanks.Tanks;

import Lesson8.ClassWork.Tanks.ActionField;
import Lesson8.ClassWork.Tanks.BattelField.BattleField;
import Lesson8.ClassWork.Tanks.BattelField.Materials.Eagle;
import Lesson8.ClassWork.Tanks.BattelField.Materials.Material;
import Lesson8.ClassWork.Tanks.Direction;

import java.awt.*;


public class BT7 extends Tank {

    public BT7(BattleField bf) {
        super(bf);
        tankColor = new Color(255, 0, 0);
        gunColor = new Color(0, 255, 0);
        movePath = 2;
    }

    public BT7(BattleField bf, int x, int y, Direction direction) {
        super(bf, x, y, direction);
        tankColor = new Color(255, 0, 0);
        gunColor = new Color(0, 255, 0);
        movePath = 2;
    }


    private Action[] actions = new Action[]{Action.NONE};


    private int step = 0;

    @Override
    public Action setUp() {
        if (step >= actions.length) {
            step = 0;
        }
        return (Action) actions[step++];
    }


    public boolean findEagle(int x, int y) {

        String eagleCoordinates = ActionField.getQuadrant(x, y);

        int separator = eagleCoordinates.indexOf("_");

        int eY = Integer.parseInt(eagleCoordinates.substring(0, separator));
        int eX = Integer.parseInt(eagleCoordinates.substring(separator + 1));

        if (eX > 0 && eX < bf.getDimensionX() && eY > 0 && eY < bf.getDimensionY()) {

            Material material = bf.scanQuadrant(eY, eX);

            if (!(material.isDestroyed()) && material instanceof Eagle) {
                return true;
            }
        }

        return false;
    }
}