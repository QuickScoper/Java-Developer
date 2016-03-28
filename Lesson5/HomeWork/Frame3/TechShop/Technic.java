package Lesson5.HomeWork.Frame3.TechShop;


import Lesson5.HomeWork.Frame3.TechShop.ProductCharacteristics.Color;
import Lesson5.HomeWork.Frame3.TechShop.ProductCharacteristics.Label;
import Lesson5.HomeWork.Frame3.TechShop.ProductCharacteristics.OS;
import Lesson5.HomeWork.Frame3.TechShop.ProductCharacteristics.Type;

public class Technic {

    public static final String alphabet = "ABCDEFGHIGKLMNOPQRSTUVWXYZ";

    protected Label label;
    protected Color color;
    protected int price;
    protected OS operationalSystem;
    protected  double screenDiagonal;
    protected String name;
    protected Type type;


    public Technic(){

    }


    public Technic(double screenDiagonal,Label label,Color color,int price,OS operationalSystem,String name){
        this.screenDiagonal = screenDiagonal;
        this.label = label;
        this.color = color;
        this.price = price;
        this.operationalSystem = operationalSystem;
        this.name = name;

    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public OS getOperationalSystem() {
        return operationalSystem;
    }

    public void setOperationalSystem(OS operationalSystem) {
        this.operationalSystem = operationalSystem;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}