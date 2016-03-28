package Lesson8.ClassWork.Tanks.Tanks;


import Lesson8.ClassWork.Tanks.BattelField.BattleField;
import Lesson8.ClassWork.Tanks.Direction;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class T34 extends Tank {

    public T34( BattleField bf) {
        super(bf);
        tankColor = new Color(140, 100, 0);
        gunColor = new Color(123, 50, 220);
        setImage();
    }

    public T34(BattleField bf, int x, int y, Direction direction) {
        super(bf, x, y, Direction.LEFT);
        tankColor = new Color(140, 100, 0);
        gunColor = new Color(123, 50, 220);
        setImage();
    }



    private void setImage(){
        image = new Image[4];
        try{
            image[0] = ImageIO.read(new File("sc2BlueTank-up.png").getAbsoluteFile());
            image[1] = ImageIO.read(new File("sc2BlueTank-down.png").getAbsoluteFile());
            image[2] = ImageIO.read(new File("sc2BlueTank-left.png").getAbsoluteFile());
            image[3] = ImageIO.read(new File("sc2BlueTank-right.png").getAbsoluteFile());
        }catch (IOException e){
            throw new IllegalStateException("Cant find image");
        }
    }

    private Object[] actions = new Object[] {
            Direction.UP,
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
        if (step >= actions.length) {
            step = 0;
        }
        if (!(actions[step] instanceof Action)) {
            turn((Direction) actions[step++]);
        }
        if (step >= actions.length) {
            step = 0;
        }
        return (Action) actions[step++];
    }

}
