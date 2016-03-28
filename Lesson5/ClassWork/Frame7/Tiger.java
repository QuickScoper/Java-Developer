package Lesson5.ClassWork.Frame3.Frame7;


public class Tiger extends Tank {
    private int armor;

    Tiger() {
        setColor("BLUE");
        setCrew(8);
        setMaxSpeed(36);
        armor = 1;
        tankClass = "Tiger";
    }

    public void TigerStatus(){
        toString();
    }

    @Override
    public String toString() {
        Tank t = new Tank();

        return super.toString().substring(0,super.toString().length()-1) + " and " + armor + " armor.";
    }
}
