package Lesson4.ClassWork.Frame14;

public class Launcher {

    public static void main(String[] args) {

        Tank tank = new Tank();

        tank.color = "Зеленого";
        tank.crew = 8;
        tank.maxSpeed = 100;

        tank.printTankInfo();

        Tank tank1 = new Tank("Черного",4,60);

        tank1.printTankInfo();
    }
}
