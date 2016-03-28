package Lesson8.ClassWork;


import javax.swing.*;
import java.awt.*;


public class Frame7 extends JPanel{

    Frame7(){
    }

    public static void main(String[] args) {

        JFrame f = new JFrame("LESSON 8 - 2D Graphics");
        f.setLocation(560,240);
        f.setMinimumSize(new Dimension(800,600));
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);


        f.getContentPane().add(new Frame7());
        f.pack();



    }


    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(0,0,800,600);
    }
}
