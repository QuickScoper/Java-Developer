package Lesson7.Classwork.Frame7Classroom;

public class ClassroomLuncher1 {

    public static void main(String[] args) {

        Classroom c = new Classroom();
        c.printStudentsInfo();
        System.out.println();
        c.isPrestent(new Student("Irina","Zinovjeva"));
        c.leave(0);
        c.isPrestent(new Student("Irina","Zinovjeva"));
        System.out.println();
        c.printStudentsInfo();
        System.out.println();
        c.enter(new Student("Petr","Guliashev"));
        c.printStudentsInfo();
    }
}
