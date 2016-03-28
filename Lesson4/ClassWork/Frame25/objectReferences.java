package Lesson4.ClassWork.Frame25;


public class objectReferences {

    private String name;
    private objectReferences ref;

    objectReferences(String name){
        this.name = name;
    }

    public objectReferences getRef() {
        return ref;
    }

    public void setRef(objectReferences ref) {
        this.ref = ref;
    }

    public String getName() {
        return name;
    }

    void references(){
        System.out.println(name + " -> " + ref.getName());
    }
}
