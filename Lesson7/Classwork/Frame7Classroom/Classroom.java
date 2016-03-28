package Lesson7.Classwork.Frame7Classroom;


import java.util.ArrayList;
import java.util.List;

public class Classroom {

    private List<Student> students;


    Classroom() {
        students = new ArrayList<Student>();
        getStudents();

    }


    public boolean enter(Student s) {
        return students.add(s);

    }

    public Student leave(int index) {
        return students.remove(index);
    }

    public int getStudentsCount() {
        return students.toArray().length;

    }


    public void isPrestent(Student s) {
        if (students.contains(s)) {
            System.out.println("This student was presented in a classroom!");
        } else {
            System.out.println("This student wasnt presented in a classroom!");
        }
    }


    public void printStudentsInfo() {
        System.out.printf("%-10s%s%n", "Имя", "Фамилия");
        for (int i = 0; i < students.toArray().length; i++) {
            System.out.printf("%-10s%s%n", students.get(i).getName(), students.get(i).getSurname());
        }
    }



    public void getStudents() {

        Student s = new Student();
        s.setName("Irina");
        s.setSurname("Zinovjeva");
        students.add(s);

        s = new Student();
        s.setName("Anton");
        s.setSurname("Zinovjev");
        students.add(s);

        s = new Student();
        s.setName("Misha");
        s.setSurname("Grishin");
        students.add(s);

        s = new Student();
        s.setName("Ivan");
        s.setSurname("Grishin");
        students.add(s);

        s = new Student();
        s.setName("Ivan");
        s.setSurname("Romanica");
        students.add(s);

        s = new Student();
        s.setName("Nickita");
        s.setSurname("Chernyshev");
        students.add(s);

        s = new Student();
        s.setName("Dmitriy");
        s.setSurname("Kornev");
        students.add(s);
    }

}
