package Lesson8.ClassWork.Tanks.Tanks;



import Lesson8.ClassWork.Tanks.ActionField;
import Lesson8.ClassWork.Tanks.BattelField.BattleField;
import Lesson8.ClassWork.Tanks.BattelField.Materials.Eagle;
import Lesson8.ClassWork.Tanks.BattelField.Materials.Material;
import Lesson8.ClassWork.Tanks.Direction;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Tiger extends Tank {
    private int armor;

    public Tiger( BattleField bf) {
        super(bf);
       setArmor(1);
        tankColor = new Color(200, 50, 100);
        gunColor = new Color(90, 90, 90);
        setImage();
    }

    public Tiger(BattleField bf, int x, int y, Direction direction) {
        super(bf, x, y, direction);
        armor = 1;
        tankColor = new Color(200, 50, 100);
        gunColor = new Color(90, 90, 90);
        setImage();
    }



    private void setImage(){
        image = new Image[4];
        try{
            image[0] = ImageIO.read(new File("sc2Tank-up.png").getAbsoluteFile());
            image[1] = ImageIO.read(new File("sc2Tank-down.png").getAbsoluteFile());
            image[2] = ImageIO.read(new File("sc2Tank-left.png").getAbsoluteFile());
            image[3] = ImageIO.read(new File("sc2Tank-right.png").getAbsoluteFile());
            }catch (IOException e){
            throw new IllegalStateException("Cant find image");
        }
    }


    @Override
    public void destroy() throws Exception{
        if (getArmor() > 0) {
            setArmor(0);
        } else {
            super.destroy();
        }

    }

    private Object[] actions = new Object[] {
            Direction.LEFT,
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



    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
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

