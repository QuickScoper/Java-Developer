package Lesson8.ClassWork;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;


public class Frame9 extends JPanel{

    private static final String IMAGE_NAME = "sc2Tank.png";
    private Image myTank;

    public Frame9(){
        try {
            myTank = ImageIO.read(new File(IMAGE_NAME));
        }catch (IOException e){
            System.err.println("Cant fing image " + IMAGE_NAME);
        }

    }




   @Override
   public void paintComponent(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(0,0,800,600);

        g.setColor(Color.BLACK);
        g.fillRect(100,100,300,300);

        g.setColor(Color.RED);
        g.fill3DRect(400,200,100,100,true);

        g.setColor(Color.GREEN);
        g.fill3DRect(300,300,100,100,false);


        g.setColor(Color.black);
        g.setFont(new Font(Font.MONOSPACED,Font.BOLD,32));
        g.drawString("I LIKE KADEKIMA COURSES!!!",150,50);


       g.drawImage(myTank, 100,200, new ImageObserver() {
           @Override
           public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
               return false;
           }
       });
    }

    public static void main(String[] args) {

        JFrame f = new JFrame("LESSON 8 - 2D Graphics");
        f.setLocation(560,240);
        f.setMinimumSize(new Dimension(800,600));
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        f.getContentPane().add(new Frame9());

        //   JLabel label = new JLabel();
        //   label.setFont(new Font(Font.MONOSPACED,Font.BOLD,24));
        //     f.getContentPane().add(label);

        f.pack();
        f.setVisible(true);


    }

}
