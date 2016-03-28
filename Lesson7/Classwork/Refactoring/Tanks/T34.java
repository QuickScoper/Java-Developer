package Lesson7.Classwork.Refactoring.Tanks;


import Lesson7.Classwork.Refactoring.ActionField;
import Lesson7.Classwork.Refactoring.BattelField.BattleField;
import Lesson7.Classwork.Refactoring.Direction;

import java.awt.*;

public class T34 extends Tank {

    public T34( BattleField bf) {
        super( bf);
        tankColor = new Color(140, 100, 0);
        gunColor = new Color(123, 50, 220);
    }

    public T34(BattleField bf, int x, int y, Direction direction) {
        super(bf, x, y, Direction.LEFT);
        tankColor = new Color(140, 100, 0);
        gunColor = new Color(123, 50, 220);
    }

    private Object[] actoins = new Object[] {
            Direction.RIGHT,
            Action.FIRE,
            Action.MOVE,
            Action.FIRE,
            Action.MOVE,
            Action.FIRE,
            Action.FIRE
    };

    private int step = 0;

    @Override
    public Action setUp() {
        if (step >= actoins.length) {
            step = 0;
        }
        if (!(actoins[step] instanceof Action)) {
            turn((Direction) actoins[step++]);
        }
        if (step >= actoins.length) {
            step = 0;
        }
        return (Action) actoins[step++];
    }

}
