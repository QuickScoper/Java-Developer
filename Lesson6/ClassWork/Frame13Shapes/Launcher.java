package Lesson6.ClassWork.Frame13Shapes;


public class Launcher {

    public static void main(String[] args) {
        Shape[] shape = new Shape[]{
            new Square(), new Circle(),new Rectangle(),new Triangle()
        };

        new ShapeTemplete(shape);
    }

}
