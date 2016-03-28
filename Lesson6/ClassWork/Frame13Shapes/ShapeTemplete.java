package Lesson6.ClassWork.Frame13Shapes;


import javax.swing.*;
import java.awt.*;

public class ShapeTemplete extends JPanel{

   private Shape [] shape;

    public ShapeTemplete(Shape [] shapes){
        shape = shapes;
        if(shapes == null || shapes.length < 0){
            shape = new Shape[0];
        }

        JFrame frame = new JFrame("SHAPES");
        frame.setLocation(750,150);
        frame.setMinimumSize(new Dimension(800,400));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(this);
        frame.pack();
        frame.setVisible(true);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        for(Shape s : shape){
            s.draw(g);
        }
    }
}
