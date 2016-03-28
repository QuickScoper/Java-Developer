package Lesson8.ClassWork;

import javax.swing.*;
import java.awt.*;

public class Frame4 {

    public static void main(String[] args) {

        JFrame f = new JFrame("LESSON_8");
        f.setVisible(true);
        f.setLocation(560,240);
//        f.setSize(800,600);
        f.setMinimumSize(new Dimension(800,600));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
