package Lesson7.Classwork.Frame5ListClassroom;

public class ClassroomLuncher {

    public static void main(String[] args) {

        Classroom c = new Classroom();
        c.printStudentsInfo();
        System.out.println();
        c.isPrestent("Irina","Zinovjeva");
        c.leave(0);
        c.isPrestent("Irina","Zinovjeva");
        System.out.println();
        c.printStudentsInfo();
        System.out.println();
        c.enter(new Student("Petr","Guliashev"));
        c.printStudentsInfo();
    }
}
