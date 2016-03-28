package Lesson6.HomeWork.Tanks.Interfaces;

/**
 * Created by QQ on 02.09.2015.
 */
public class test {

    public static void main(String[] args) {
        catcher();
        System.out.println("Done");
    }

    public static void catcher() {

        try {
            throw new Exception();
        } catch (Exception e) {
            throw new IllegalStateException();
        } finally {
            System.out.println("Hi");
        }
    }
}
