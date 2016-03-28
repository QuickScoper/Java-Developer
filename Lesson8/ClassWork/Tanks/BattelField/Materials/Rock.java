package Lesson8.ClassWork.Tanks.BattelField.Materials;


import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Rock extends Material {

    public Rock(int x,int y) {
        super(x,y);
        color = new Color(246, 250, 201);
        try{
            image = ImageIO.read(new File("rock1.jpg").getAbsoluteFile());
        }catch (IOException e){
            throw new IllegalStateException("FAILED!");
        }
    }
}
