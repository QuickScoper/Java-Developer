package Lesson7.Homework.Stack;

/**
 * Created by QQ on 05.02.2016.
 */
public class Demo {


    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push("Люблю!");
        stack.push("тебя");
        stack.push("Я");

        stack.printStack();



        stack.pop();

        stack.printStack();


        System.out.println(stack.peek());
    }
}
