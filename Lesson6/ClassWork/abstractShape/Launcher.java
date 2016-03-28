package Lesson6.ClassWork.abstractShape;


public class Launcher {

    public static void main(String[] args) {
        Drawable[] shape = new Drawable[]{
            new Square(), new Circle(),new Rectangle(),new Triangle()
        };

        new ShapeTemplete(shape);
    }

}
