package Lesson7.Homework.ArrayList;

/**
 * Created by QQ on 04.02.2016.
 */
public class demo {


    public static void main(String[] args) {
        simpleArrayList list = new simpleArrayList();

        list.addFirst("1");
        list.addLast("2");
        list.addLast("4");
        list.addLast("5");
        list.addAfter("2", "3");
//        list.addFirst(null);

        list.printArrayList();
//        System.out.println(list.getByPosition(3));
//        System.out.println(list.getByPosition(0));

        list.remove("3");

        list.printArrayList();
    }
}
