package Lesson6.HomeWork.Cofee.Sorts;


public class Espresso extends Sort {
    private int coffe = 5;
    private int water = 25;

    public Espresso() {
        name = "Espresso";
        setCofeeNumber(coffe);
        setWaterNumber(water);
        price = (getCoffeePrice() + getWaterPrice());
        recipe = getCoffee() + ", " + getWater()+".";
        System.out.printf("%-15s%-27s%-1.2f%n",name,recipe,price);
    }

    public Espresso (int num){
        if(checkNum(num) == true) {
            name = "Espresso";
            if(num == 2){
                name = "Double Espresso(Dopio)";
            }
            if(num == 3){
                name = "Triple Espresso(Tripplo)";
            }

            setCofeeNumber(coffe);
            setWaterNumber(water);
            price = (getCoffeePrice() + getWaterPrice());
            recipe = getCoffee() + ", " + getWater() + ".";
            System.out.printf("%-15s%-27s%-1.2f%n", name, recipe, price);
        }else{
            System.out.println("Введите число от 1 до 3");
        }
    }
}
