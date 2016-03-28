package Lesson7.Classwork.Refactoring.Tanks;


import Lesson7.Classwork.Refactoring.BattelField.BattleField;
import Lesson7.Classwork.Refactoring.Direction;

import java.awt.*;

public class Tiger extends Tank {
    private int armor;

    public Tiger(BattleField bf) {
        super(bf);
        armor = 1;
        tankColor = new Color(200, 50, 100);
        gunColor = new Color(90, 90, 90);
    }

    public Tiger(BattleField bf, int x, int y, Direction direction) {
        super(bf, x, y, direction);
        armor = 1;
        tankColor = new Color(200, 50, 100);
        gunColor = new Color(90, 90, 90);
    }


    @Override
    public void destroy() {
        if (armor == 1) {
            armor = 0;
        } else {
            super.destroy();
        }

    }


    @Override
    public Action setUp() {
        return Action.FIRE;
    }

//    @Override
//    public Bullet fire() {
//        return super.fire();
//    }
}
