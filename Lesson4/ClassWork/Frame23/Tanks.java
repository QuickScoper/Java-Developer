package Lesson4.ClassWork.Frame23;

import java.util.Arrays;

public class Tanks {

    private String color;
    private int crew;
    private int maxSpeed;

    Tanks(){

    }

    Tanks(String color,int crew,int maxSpeed){
        this.color = color;
        setCrew(crew);
        setMaxSpeed(maxSpeed);
        printTanksInfo(this.color,this.crew,this.maxSpeed);
    }


    public void printTanksInfo(String color,int crew,int maxSpeed) {
            System.out.println("Tank information:[ "+ color + ", " + crew + ", " + maxSpeed + " ]");

    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if(maxSpeed > 200){
            this.maxSpeed = 200;
        }else{
            this.maxSpeed = maxSpeed;
        }
    }

    public int getCrew() {
        return crew;
    }

    public void setCrew(int crew) {
        if(crew > 10) {
            this.crew = 10;
        }else if(crew < 2) {
            this.crew = 2;
        }else{
            this.crew = crew;
        }

    }

}
