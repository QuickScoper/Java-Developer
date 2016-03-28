package Lesson8.ClassWork;


import javax.swing.*;
import java.awt.*;

public class HowToDraw extends JPanel{

    private static int x = 100;

    public HowToDraw(){

        JFrame f = new JFrame("LESSON 8 2D Graphics");
        f.setVisible(true);
        f.setLocation(560,240);
        f.setMinimumSize(new Dimension(800,600));
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        JPanel p = new JPanel();

        f.getContentPane().add(this);

        f.pack();

//        repaint();

    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(new Color(188, 13, 109));
        g.fillRect(50,50,500,400);

        g.setColor(Color.BLUE);
        g.fillOval(x,100,200,200);
    }

    public static void main(String[] args) throws Exception{
        HowToDraw htd = new HowToDraw();

        Thread.sleep(5000);
        System.out.println("Woke up");

        x = 200;
        htd.repaint();

    }

}
