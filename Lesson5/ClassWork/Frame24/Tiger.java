package Lesson5.ClassWork.Frame24;


public class Tiger extends OOPTank {
    private int armor;

    Tiger(ActionField af, OOPBattleField bf) {
        super(af, bf);
        armor = 1;
    }

    Tiger(ActionField af, OOPBattleField bf, int x, int y, Direction direction) {
        super(af, bf, 448, 64, Direction.LEFT);
        armor = 1;
    }
}
