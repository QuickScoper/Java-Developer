package Lesson6.ClassWork.Frame10;


public class MyExeption extends RuntimeException{



    public void checkName(String name) {

        if(name.equals("Masia")){
            System.out.println(name + " Я тебя люблю!");
        }else{
            throw new IllegalArgumentException("Пошла ты!");
        }
    }
}
