package Lesson4.ClassWork.Frame25;


public class Launcher {

    public static void main(String[] args) {

        objectReferences ref1 = new objectReferences("ref1");
        objectReferences ref2 = new objectReferences("ref2");
        objectReferences ref3 = new objectReferences("ref3");

        ref1.setRef(ref2);
        ref2.setRef(ref3);
        ref3.setRef(ref1);

        ref1.references();
        ref2.references();
        ref3.references();

    }
}
