package Lesson6.HomeWork.Cofee.IngredientsInfo;


public class IngredienInfo {

//    private String milk;
//    private String coffee;
//    private String TeaGreen;
//    private String TeaBlack;
//    private String TeaWithBergamot;
//    private String water;
//    private String cream;

    private int cofeeNumber;
    private int milkNumber;
    private int TeaNumber;
    private int waterNumber;
    private int creamNumber;

//    private double milkPrice;
//    private int coffeePrice;
//    private int TeaGreenPrice;
//    private int TeaBlackPrice;
//    private int TeaWithBergamotPrice;
//    private double creamPrice;
//    private double waterPrice;


    public IngredienInfo() {

    }


    public int getCofeeNumber() {
        return cofeeNumber;
    }

    public void setCofeeNumber(int cofeeNumber) {
        this.cofeeNumber = cofeeNumber;
    }

    public String getCoffee() {
        return "Cofee " + getCofeeNumber() + "g";
    }


    public int getCoffeePrice() {
        return getCofeeNumber() * 21;
    }


    public String getCream() {
        return "Cream " + getCreamNumber() + "ml";
    }

    public int getCreamNumber() {
        return creamNumber;
    }

    public void setCreamNumber(int creamNumber) {
        this.creamNumber = creamNumber;
    }

    public double getCreamPrice() {
        return getCreamNumber() * 0.33;
    }

    public String getMilk() {
        return "Milk " + getMilkNumber() + "ml";
    }

    public int getMilkNumber() {
        return milkNumber;
    }

    public void setMilkNumber(int milkNumber) {
        this.milkNumber = milkNumber;
    }

    public double getMilkPrice() {
        return getMilkNumber() * 0.67;
    }


    public int getTeaNumber() {
        return TeaNumber;
    }

    public void setTeaNumber(int teaNumber) {
        TeaNumber = teaNumber;
    }

    public String getTeaBlack() {
        return "Black tea " + getTeaNumber() + "gr";
    }


    public int getTeaBlackPrice() {
        return getTeaNumber() * 15;
    }


    public String getTeaGreen() {
        return "Green tea " + getTeaNumber() + "gr";
    }

    public int getTeaGreenPrice() {
        return getTeaNumber() * 15;
    }

    public String getTeaWithBergamot() {
        return "Tea with bergamot " + getTeaNumber() + "gr";
    }

    public int getTeaWithBergamotPrice() {
        return getTeaNumber() * 15;
    }


    public String getWater() {
        return "Water " + getWaterNumber() + "ml";
    }


    public int getWaterNumber() {
        return waterNumber;
    }

    public void setWaterNumber(int waterNumber) {
        this.waterNumber = waterNumber;
    }

    public double getWaterPrice() {
        return getWaterNumber() * 0.5;
    }


}
