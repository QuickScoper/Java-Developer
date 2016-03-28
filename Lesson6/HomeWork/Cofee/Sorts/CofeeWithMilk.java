package Lesson6.HomeWork.Cofee.Sorts;


public class CofeeWithMilk extends Sort{

    private int coffe = 10;
    private int milk = 70;


    public CofeeWithMilk(){
        name = "Coffe with";
        name1 = "Milk";
        setWaterNumber(20);
        setCofeeNumber(coffe);
        setMilkNumber(milk);
        price = (getCoffeePrice() + getWaterPrice() + getMilkPrice());
        recipe = getMilk() + ", " + getCoffee() + ",";
        recipe1 = getWater() +".";
        System.out.printf("%-15s%-27s%-1.2f%n%-15s%-22s%n", name,recipe, price,name1,recipe1);
    }

    public CofeeWithMilk(int i1,int i2){
        name = "Coffe with";
        name1 = "Milk";
        setWaterNumber(20);
        setCofeeNumber(coffe*i1);
        setMilkNumber(milk*i2);
        price = (getCoffeePrice() + getWaterPrice() + getMilkPrice());
        recipe = getMilk() + ", " + getCoffee() + ",";
        recipe1 = getWater() +".";
        System.out.printf("%-15s%-27s%-1.2f%n%-15s%-22s%n", name,recipe, price,name1,recipe1);
    }





}
