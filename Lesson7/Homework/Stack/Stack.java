package Lesson7.Homework.Stack;

/**
 * Created by QQ on 05.02.2016.
 */
public class Stack {

    private Node first;
    private Node prev;
    private Node cur;
    private int size;


    private class Node {
        Node node;
        Object object;
    }


    public void push(Object obj) {
        Node n = new Node();
        n.object = obj;

        if (first != null) {
            n.node = first;
        }

        first = n;
        size += 1;
    }


    public Object pop() {

        Object returningObject;

        if (first == null) {
            throw new IllegalStateException("Stack has no elements.");
        }


        returningObject = first.object;

        cur = first;
        if(cur.node == null && prev == null){
            cur = null;
            first = cur;
        }else if(cur.node != null && prev == null){
            first = cur.node;
            cur= first;
        }

        size--;


        return returningObject;
    }





    public Object peek(){

        Object returningObject;

        if (first == null) {
            throw new IllegalStateException("Stack has no elements.");
        }


        returningObject = first.object;

        return returningObject;
    }

    public int getSize() {
        return size;
    }


    public void printStack() {

        if (size == 0) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("[");

        Node currentNode = first;
        while (currentNode.node != null) {
            System.out.print(currentNode.object + ", ");
            currentNode = currentNode.node;
        }

        System.out.print(currentNode.object);
        System.out.println("]");
    }

}
