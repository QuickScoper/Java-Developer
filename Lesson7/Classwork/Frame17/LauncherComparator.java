package Lesson7.Classwork.Frame17;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LauncherComparator {

    public static void main(String[] args) {

        List<String> l = new ArrayList<>();

        l.add("Anton");
        l.add("Kirill");
        l.add("Vasilii");
        l.add("Nickolai");
        l.add("Nickita");
        l.add("Inga");
        l.add("Mihail");
        l.add("Ekaterina");
        l.add("Ivan");
        l.add("Andreay");

       Collections.sort(l);

        for(String name : l){
            System.out.println(name);
        }


        System.out.println();

        Collections.sort(l, new NewComparator());

        for(String name : l){
            System.out.println(name);
        }

    }
}
