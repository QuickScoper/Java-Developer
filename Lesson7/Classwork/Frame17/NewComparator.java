package Lesson7.Classwork.Frame17;


import java.util.Comparator;

public class NewComparator implements Comparator<Object>{

    @Override
    public int compare(Object o1, Object o2) {
        String e1 = (String)o1;
        String e2 = (String)o2;

        int result = e1.compareToIgnoreCase(e2);
        if(result < 0){
            return 1;
        }else if(result > 0){
            return -1;
        }
        return 0;
    }
}
