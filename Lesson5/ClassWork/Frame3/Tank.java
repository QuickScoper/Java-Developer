package Lesson5.ClassWork.Frame3;

public class Tank {

    protected String color;
    protected int crew;
    protected int maxSpeed;

    Tank(){

    }

    Tank(String color, int crew, int maxSpeed) {
        this.color = color;
        setCrew(crew);
        setMaxSpeed(maxSpeed);
    }

    public void move() {
        if (checkCrewCount()) {
            System.out.println("moving forward, speed: " + maxSpeed);
        } else {
            System.out.println("moving forward, speed: " + maxSpeed / 2);
        }
    }

    private boolean checkCrewCount() {
        if (crew > 4) {
            return true;
        }
        return false;
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
        if (crew > 8) {
            this.crew = 8;
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

//    public void turn(int direction){
//
//    }
//
//    public void fire(){
//
//    }


}


