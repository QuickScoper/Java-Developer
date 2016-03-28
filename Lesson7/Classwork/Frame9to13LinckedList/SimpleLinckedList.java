package Lesson7.Classwork.Frame9to13LinckedList;


import java.util.Iterator;

public class SimpleLinckedList implements Iterable<Object> {

    Node root;
    int size;

    public SimpleLinckedList() {

    }


    public void addFirst(Object obj) {
        Node n = new Node();
        n.obj = obj;
        if (root != null) {
            n.ref = root;
        }
        root = n;
        size += 1;
    }

    public void addLast(Object obj) {
        Node n = new Node();
        n.obj = obj;
        if (root == null) {
            root = n;
        }
        Node CP = root;
        Node LE = root;
        while (CP.ref != null) {
            LE = CP;
            CP = CP.ref;
        }

        CP.ref = n;
        size += 1;
    }

    public void addAfter(Object obj, Object prev) {
        Node CP = root;
        Node PP = null;

        do {
            if (CP.obj == prev) {
                PP = CP;
                break;
            }
            CP = CP.ref;

        } while (CP != null && CP.ref != null);

        if (PP == null) {
            throw new IllegalStateException("List doesnt contans prev obj");
        }

        Node n = new Node();
        n.obj = obj;

       if(PP.ref != null) {
            n.ref = PP.ref;
        }
        PP.ref = n;
        size += 1;
    }

    public int getSize() {
        return size;
    }


    private class Node {

        Object obj;
        Node ref;

    }

    @Override
    public Iterator<Object> iterator() {
        return new SLLIterator();
    }

    class SLLIterator implements Iterator<Object> {

        Node CP;
        Node PP;

        @Override
        public boolean hasNext() {
            return (CP != null && CP.ref != null) || (root != null && CP == null);
        }

        @Override
        public Object next() {
            if (root != null && CP == null) {
                CP = root;
                return CP.obj;
            }

            if (hasNext()) {
               PP = CP;
                CP = CP.ref;
                return CP.obj;
            }

            throw new IllegalStateException("LIST HAS NO MORE ELEMENTS!");
        }

        @Override
        public void remove() {

            if(!hasNext() && PP == null){
                CP = null;
                root = CP;
            }else if(!hasNext() && PP != null){
                PP.ref = CP.ref;
                CP = PP.ref;
            }else if(hasNext() && PP == null){
               root = CP.ref;
                CP= root;
            }else{
                PP.ref = CP.ref;
                CP = null;
            }
            size--;
        }
    }


}
