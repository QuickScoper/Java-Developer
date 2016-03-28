package Lesson5.ClassWork.Frame3.Frame7;

public class Tank {

    protected String color;
    protected int crew;
    protected int maxSpeed;
    protected String tankClass;

    public String getTankClass() {
        return tankClass;
    }

    public void setTankClass(String tankClass) {
        this.tankClass = tankClass;
    }

    Tank() {

    }

    Tank(String color, int crew, int maxSpeed) {
        this.color = color;
        setCrew(crew);
        setMaxSpeed(maxSpeed);
    }

    public String move() {
        if (checkCrewCount()) {
            return "full moving forward with speed: " + maxSpeed + "mpH";
        } else {
            return "moving forward with speed: " + maxSpeed / 2 + "mpH";
        }
    }

    private boolean checkCrewCount() {
        if (crew > 6) {
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

    @Override
    public String toString() {
     return getTankClass() + " which color is " + getColor() + " " + move() + ",and crew number of " + getCrew() + " soldiers.";
    }

}


