package Lesson8.HomeWork;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by QQ on 27.03.2016.
 */
public class test {


    public static void main(String[] args) {

        int [] mas1 = new int[]{1,2,3,4,5};
        int [] mas2 = new int [mas1.length];

        int j = mas1.length-1;

        System.out.println(j);

        for(int i = 0;i < mas1.length; i++,j--){
            mas2[j] = mas1[i];
        }
        mas1 = mas2;
        System.out.println(Arrays.toString(mas1));
    }

}

