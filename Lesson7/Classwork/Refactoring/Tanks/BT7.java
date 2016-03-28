package Lesson7.Classwork.Refactoring.Tanks;

import Lesson7.Classwork.Refactoring.BattelField.BattleField;
import Lesson7.Classwork.Refactoring.Direction;

import java.awt.*;


public class BT7 extends Tank{

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

    @Override
    public Action setUp() {
        return Action.MOVE;
    }
}
