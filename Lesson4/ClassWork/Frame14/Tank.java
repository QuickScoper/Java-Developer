package Lesson4.ClassWork.Frame14;


public class Tank {

    String color;
    int crew;
    int maxSpeed;

    Tank(){

    }

 Tank(String color,int crew,int maxSpeed){
     this.color = color;
     this.crew = crew;
     this.maxSpeed = maxSpeed;

    }

    public void printTankInfo(){
        System.out.println("Танк " + color + " цвета с командой из " + crew + " человек, едет со скоростью " + maxSpeed + "км/ч.");
    }
}
