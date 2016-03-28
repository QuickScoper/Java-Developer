package Lesson6.HomeWork.Cofee.Sorts;


public class Capuchino  extends Sort{


    public Capuchino(){
        name = "Capuchino";
        setWaterNumber(30);
        setCofeeNumber(10);
        setMilkNumber(45);
        setCreamNumber(120);
        price = (getCoffeePrice() + getWaterPrice() + getMilkPrice() + getCreamPrice());
        recipe = getCream() + ", " + getCoffee() + ",";
        recipe1 = getMilk() + ", " + getWater() +".";
        System.out.printf("%-15s%-27s%-1.2f%n%37s%n", name,recipe, price,recipe1);

    }



}
