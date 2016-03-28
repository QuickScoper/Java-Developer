package Lesson6.HomeWork.Cofee;


import Lesson6.HomeWork.Cofee.Sorts.*;

public class Menu {



    public void CaffeMenu() {


        System.out.printf("%-20s%-23s%s%n", "Name", "Engredients", "Price");
        System.out.println("------------------------------------------------");
        new Americano();
        System.out.println("------------------------------------------------");
        new BlackTea();
        System.out.println("------------------------------------------------");
        new Capuchino();
        System.out.println("------------------------------------------------");
        new CofeeWithMilk();
        System.out.println("------------------------------------------------");
        new Espresso();
        System.out.println("------------------------------------------------");
        new GreenTea();
        System.out.println("------------------------------------------------");
        new Latte();
        System.out.println("------------------------------------------------");
        new TeaWithBergamot();
        System.out.println("------------------------------------------------");
    }


}
