package Lesson4.ClassWork.Frame23;

public class Tank {

    private String color;
    private int crew;
    private int maxSpeed;


    void printTankMasInfo(Tank[] tank) {
        for (int i = 0; i < tank.length; i++) {
            System.out.println("Характеристики танка №" + (i+1) + " : Цвет - " +tank[i].getColor() + ", Кол-во человек - " + tank[i].getCrew() + ", Максимальная скорость - " + tank[i].getMaxSpeed() + ".");
        }
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCrew() {
        return crew;
    }

    public void setCrew(int crew) {
        if (crew > 10) {
            this.crew = 10;
        } else if (crew < 2) {
            this.crew = 2;
        } else {
            this.crew = crew;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 200) {
            this.maxSpeed = 200;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }
}
