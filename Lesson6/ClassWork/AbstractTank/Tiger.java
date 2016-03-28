package Lesson6.ClassWork.AbstractTank;


import java.awt.*;

public class Tiger extends Tank {
    private int armor;

    public Tiger(ActionField af, BattleField bf) {
        super(af, bf);
        armor = 1;
        tankColor = new Color(200, 50, 100);
        gunColor = new Color(90, 90, 90);
    }

    public Tiger(ActionField af, BattleField bf, int x, int y, Direction direction) {
        super(af, bf, x, y, Direction.LEFT);
        armor = 1;
        shootInArmor();
        tankColor = new Color(200, 50, 100);
        gunColor = new Color(90, 90, 90);
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
