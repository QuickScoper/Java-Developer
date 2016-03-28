package Lesson6.HomeWork.Cofee.Sorts;


public class Latte extends Sort{



    public Latte(){
        name = "Latte";
        setWaterNumber(25);
        setCofeeNumber(5);
        setMilkNumber(60);
        setCreamNumber(30);
        price = (getCoffeePrice() + getWaterPrice() + getMilkPrice() + getCreamPrice());
        recipe = getCream() + ", " + getCoffee() + ",";
        recipe1 = getMilk() + ", " + getWater() +".";
        System.out.printf("%-15s%-27s%-1.2f%n%37s%n", name,recipe, price,recipe1);
    }
}
