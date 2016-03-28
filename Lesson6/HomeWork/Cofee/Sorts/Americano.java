package Lesson6.HomeWork.Cofee.Sorts;


import Lesson6.HomeWork.Cofee.IngredientsInfo.IngredienInfo;


public class Americano extends Sort {
    private int cofeeNum = 5;


    public Americano() {
        name = "Americano";
        setCofeeNumber(cofeeNum);
        setWaterNumber(120);
        price = (getCoffeePrice() + getWaterPrice());
        recipe = getCoffee() + ", " + getWater()+".";
        System.out.printf("%-15s%-27s%-1.2f%n",name,recipe,price);
    }


    public Americano(int i1) {
        if (checkNum(i1) == false) {
            System.out.println("Введите число от 1 до 3");
        } else {
            name = "Americano";
            setCofeeNumber(cofeeNum * i1);
            setWaterNumber(120);
            price = (getCoffeePrice() + getWaterPrice());
            recipe = getCoffee() + ", " + getWater()+".";
            System.out.printf("%-15s%-27s%-1.2f%n", name, recipe, price);
        }
    }


}
