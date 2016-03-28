package Lesson4.HomeWork;


public class Frame4Car {

    private Frame3Color color;
    private String name;
    private String number;
    private boolean moving;
    private boolean autoOpeningDoors;
    private int doorsNumber;
    private boolean neonExistence;
    private boolean lighting;
    private int maxSpeed;
    private int secsTo100KmS;

    public Frame4Car(String name,String number,Frame3Color color,boolean moving,boolean autoOpeningDoors,int doorsNumber,
                     boolean neonExistence,boolean lighting,int maxSpeed,int secsTo100KmS){
        this.name = name;
        this.number = number;
        this.color = color;
        this.moving = moving;
        this.autoOpeningDoors = autoOpeningDoors;
        this.doorsNumber = doorsNumber;
        this.neonExistence = neonExistence;
        this.lighting = lighting;
        this.maxSpeed = maxSpeed;
        this.secsTo100KmS = secsTo100KmS;
    }









    public void startMoving(){
        moving = true;
    }
    public void stopMoving(){
        moving = false;
    }
    public String getName(){
        return name;
    }
    public String getNumber() {
        return number;
    }
    public Frame3Color getColor() {
        return color;
    }
    public boolean isAutoOpeningDoors() {
        return autoOpeningDoors;
    }
    public int getDoorsNumber() {
        return doorsNumber;
    }
    public boolean isNeonExistence() {
        return neonExistence;
    }
    public boolean isLighting() {
        return lighting;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public int getSecsTo100KmS() {
        return secsTo100KmS;
    }
    public boolean isMoving() {
        return moving;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public void setColor(Frame3Color color) {
        this.color = color;
    }
    public void setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public void setSecsTo100KmS(int secsTo100KmS) {
        this.secsTo100KmS = secsTo100KmS;
    }
}

