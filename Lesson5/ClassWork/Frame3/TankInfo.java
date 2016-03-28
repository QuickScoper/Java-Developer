package Lesson5.ClassWork.Frame3;


public class TankInfo {

    public static void main(String[] args) {
        Tank t34 = new T34();
        System.out.println("TANK COLOR: " + t34.getColor() + ", CREW NUMBER: " + t34.getCrew() + ", TANK MAX SPEED: " + t34.getMaxSpeed());
        System.out.println();
        Tank bt7 = new BT7();
        System.out.println("TANK COLOR: " + bt7.getColor() + ", CREW NUMBER: " + bt7.getCrew() + ", TANK MAX SPEED: " + bt7.getMaxSpeed());
        System.out.println();
        Tank tiger = new Tiger();
        System.out.println("TANK COLOR: " + tiger.getColor() + ", CREW NUMBER: " + tiger.getCrew() + ", TANK MAX SPEED: " + tiger.getMaxSpeed());

    }
}
