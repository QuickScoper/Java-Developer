package Lesson5.ClassWork.Frame24;


public class BT7 extends OOPTank {

    BT7(ActionField af, OOPBattleField bf) {
        super(af, bf);
        speed = 5;
    }

    BT7(ActionField af, OOPBattleField bf, int x, int y, Direction direction) {
        super(af, bf, 64, 64, Direction.DOWN);
        speed = 5;
    }

}
