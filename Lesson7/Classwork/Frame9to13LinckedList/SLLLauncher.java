package Lesson7.Classwork.Frame9to13LinckedList;


import java.util.Iterator;

public class SLLLauncher {

    public static void main(String[] args) {

        SimpleLinckedList sll = new SimpleLinckedList();

        sll.addFirst("Я ");
        sll.addLast("Очень ");
        sll.addLast("Cильно ");
        sll.addLast("Люблю ");
        sll.addLast("Свою ");
        sll.addLast("Масечку!");


        for(Iterator<Object> it = sll.iterator();it.hasNext();){
            Object o = it.next();
            System.out.print(o);
        }

        System.out.println();

//        sll.addAfter("НЕ ","Я ");

        for(Object o : sll){
            System.out.print(o);
        }

        System.out.println();
        for(Iterator<Object> it = sll.iterator();it.hasNext();){
            it.next();
            it.next();
//            it.next();
//            it.next();
//            it.next();
//            it.next();
//            it.next();
            it.remove();
            break;
        }

        for(Object o : sll){
            System.out.print(o);
        }

    }
}

