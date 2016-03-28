package Lesson4.ClassWork.Frame23;

import java.util.Arrays;

public class Launcher {

    public static void main(String[] args) {

        Tanks [] t = new Tanks[5];
        t[0] = new Tanks("red",7,90);
        t[1] = new Tanks("green",18,80);
        t[2] = new Tanks("grey",4,100);
        t[3] = new Tanks("black",6,220);
        t[4] = new Tanks("dark green",6,60);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        Tank [] t1 = new Tank[5];
        Tank t11 = new Tank();
        t1[0] = new Tank();
        t1[0].setColor("red");
        t1[0].setCrew(7);
        t1[0].setMaxSpeed(90);

        t1[1] = new Tank();
        t1[1].setColor("green");
        t1[1].setCrew(18);
        t1[1].setMaxSpeed(80);

        t1[2] = new Tank();
        t1[2].setColor("grey");
        t1[2].setCrew(4);
        t1[2].setMaxSpeed(100);

        t1[3] = new Tank();
        t1[3].setColor("black");
        t1[3].setCrew(6);
        t1[3].setMaxSpeed(220);

        t1[4] = new Tank();
        t1[4].setColor("dark green");
        t1[4].setCrew(6);
        t1[4].setMaxSpeed(60);

        t11.printTankMasInfo(t1);

    }

}
