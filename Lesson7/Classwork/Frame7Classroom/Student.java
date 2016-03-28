package Lesson7.Classwork.Frame7Classroom;


public class Student {

    private String name;
    private String surname;


    Student(){

    }

    Student(String name,String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student s = (Student) obj;
            if (s.getName() != null && s.getSurname() !=null && name.equals(s.getName()) && surname.equals(s.getSurname())) {
                return true;
            }
        }
        return false;

    }
}
