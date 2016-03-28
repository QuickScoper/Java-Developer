package Lesson8.ClassWork;



import java.text.SimpleDateFormat;
import java.util.Date;


public class Frame13Date {

    public static void main(String[] args) throws Exception {

        Date today = new Date();
        System.out.println(today);

        SimpleDateFormat s = new SimpleDateFormat("dd MMM yyyy");
        System.out.println(s.format(today)+" года");

        String str = "01 Дек 1993";
        Date myBirth = s.parse(str);
        System.out.println(s.format(myBirth));
        System.out.println(myBirth);
    }
}
