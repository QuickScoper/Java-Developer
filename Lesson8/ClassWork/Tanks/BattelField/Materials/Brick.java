package Lesson8.ClassWork.Tanks.BattelField.Materials;


import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Brick extends Material {


    public Brick(int x,int y){
        super(x,y);
        color = new Color(3, 79, 0);
        try{
            image = ImageIO.read(new File("brick.jpg").getAbsoluteFile());
        }catch (IOException e){
            throw new IllegalStateException("FAILED!");
        }
    }
}
