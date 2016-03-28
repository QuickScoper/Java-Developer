package Lesson6.ClassWork.AbstractTank;


import java.awt.*;

public class T34 extends Tank{

    public T34(ActionField af, BattleField bf) {
        super(af, bf);
        tankColor = new Color(140, 100, 0);
        gunColor = new Color(123, 50, 220);
    }

    public T34(ActionField af, BattleField bf, int x, int y, Direction direction) {
        super(af, bf, x, y, Direction.LEFT);
        tankColor = new Color(140, 100, 0);
        gunColor = new Color(123, 50, 220);
    }
}
