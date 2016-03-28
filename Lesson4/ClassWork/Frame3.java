package Lesson4.ClassWork;

public class Frame3 {

    public static void main(String[] args) {
        if(args.length == 2) {
            System.out.println("Hello " + args[0] + "!!! " + args[1] + " LOVES YOU!!!");
        }else{
            System.out.println("Please write your name 1st and than the name of a person, who,do you think, loves you!Example: java GreetingService Masia Anton.");
        }
    }
}

