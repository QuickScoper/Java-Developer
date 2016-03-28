package Lesson8.ClassWork;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Frame14Calendar {

    public static void main(String[] args) throws Exception{

        Calendar c = new GregorianCalendar();
        c.set(Calendar.MINUTE,0);
        c.set(Calendar.SECOND,0);
        c.set(1993, 11, 01);
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DAY_OF_WEEK));

        System.out.println(c.getTime());

//        System.out.println(String.valueOf(c.getActualMaximum(Calendar.DAY_OF_MONTH)));

        SimpleDateFormat f = new SimpleDateFormat("u");
        Date myBirth = f.parse("" + c.get(Calendar.DAY_OF_WEEK));
        f = new SimpleDateFormat("EEE");
        System.out.println(f.format(myBirth));
    }
}
