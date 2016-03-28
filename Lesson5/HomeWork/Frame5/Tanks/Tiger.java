package Lesson5.HomeWork.Frame5.Tanks;


import Lesson5.HomeWork.Frame5.ActionField;
import Lesson5.HomeWork.Frame5.BattleField;
import Lesson5.HomeWork.Frame5.Direction;
import Lesson5.HomeWork.Frame5.Tank;

public class Tiger extends Tank {
    private int armor;

    public Tiger(ActionField af, BattleField bf) {
        super(af, bf);
        armor = 1;
    }

    public Tiger(ActionField af, BattleField bf, int x, int y, Direction direction) {
        super(af, bf, x, y, Direction.LEFT);
        armor = 1;
        shootInArmor();
    }

    private void shootInArmor() {
        if (af.processInterception()) {
            if (armor == 1) {
                armor = 0;
            } else {
                destroy();
            }
        }
    }
}
