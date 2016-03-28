package Lesson8.ClassWork.Tanks.BattelField.Materials;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;


public class Eagle extends Material {

    public Eagle(int x,int y) {
        super(x,y);
        color = new Color(240, 255, 70);
        try{
            image = ImageIO.read(new File("eagle.png").getAbsoluteFile());
        }catch (IOException e){
            throw new IllegalStateException("FAILED!");
        }
    }

}
