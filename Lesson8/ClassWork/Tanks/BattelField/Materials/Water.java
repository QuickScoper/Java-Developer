package Lesson8.ClassWork.Tanks.BattelField.Materials;


import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Water extends Material {

    public Water(int x,int y){
        super(x,y);
        color = new Color(20,200,255);
        try{
            image = ImageIO.read(new File("water1.jpg").getAbsoluteFile());
        }catch (IOException e){
            throw new IllegalStateException("FAILED!");
        }
    }
}
