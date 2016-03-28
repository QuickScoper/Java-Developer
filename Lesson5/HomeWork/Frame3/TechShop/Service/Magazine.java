package Lesson5.HomeWork.Frame3.TechShop.Service;


import Lesson5.HomeWork.Frame3.TechShop.Consumers.Traders;
import Lesson5.HomeWork.Frame3.TechShop.Consumers.TradersInfo;
import Lesson5.HomeWork.Frame3.TechShop.ProductCharacteristics.Label;
import Lesson5.HomeWork.Frame3.TechShop.Products.Notebooks;
import Lesson5.HomeWork.Frame3.TechShop.Products.Planshets;
import Lesson5.HomeWork.Frame3.TechShop.Technic;

import java.util.Arrays;
import java.util.Random;

public class Magazine {

    public Magazine() {

    }

    public void magStooragePrice() {
        Planshets p = new Planshets();
        Notebooks n = new Notebooks();
        for (int i = 0; i < p.labelStorage.length; i++) {
            for (int j = 0; j < p.labelStorage[i].length; j++) {
                Technic p1 = p.labelStorage[i][j];
                if (p1 != null) {
                    System.out.println("Planshet * Lable : " + p1.getLabel() + " * Name : " + p1.getName() + " * Price : " + p1.getPrice() + ".");
                }
            }
        }
        for (int i = 0; i < n.labelStorage.length; i++) {
            for (int j = 0; j < n.labelStorage[i].length; j++) {
                Technic p1 = n.labelStorage[i][j];
                if (p1 != null) {
                    System.out.println("Notebook * Lable : " + p1.getLabel() + " * Name : " + p1.getName() + " * Price : " + p1.getPrice() + ".");
                }
            }
        }
    }

    public int[] stat() {
        int[] statistic;
        Random r = new Random();
        statistic = new int[7];
        for (int i = 0; i < statistic.length; i++) {
            int j = r.nextInt(10);
            statistic[i] = j;
        }
        return statistic;
    }

    public void soldWeekStatistic() {
        Planshets p = new Planshets();
        Notebooks n = new Notebooks();
        for (int i = 0; i < p.labelStorage.length; i++) {
            for (int j = 0; j < p.labelStorage[i].length; j++) {
                Technic p1 = p.labelStorage[i][j];
                if (p1 != null) {
                    System.out.println(p1.getType() + " * Lable : " + p1.getLabel() + " * Name : " + p1.getName() + Arrays.toString(stat()));
                }
            }
        }
        for (int i = 0; i < n.labelStorage.length; i++) {
            for (int j = 0; j < n.labelStorage[j].length; j++) {
                Technic p1 = n.labelStorage[i][j];
                if (p1 != null) {
                    System.out.println(p1.getType() + " * Lable : " + p1.getLabel() + " * Name : " + p1.getName() + " * Price : " + Arrays.toString(stat()));
                }
            }
        }
    }


    public void assortmentOfProducts() {
        TradersInfo t = new TradersInfo();
        Random r = new Random();
        int count = 0;
        System.out.printf("%-8s%-20s%-12s%-20s%-18s%-8s%s%n","№","Trader","Type","Label","Name","Cost","Number");
//        System.out.println("№       Trader             Type         Label           Name               Cost         Number ");
        System.out.println("------------------------------------------------------------------------------------------------");
        for (int i = 0; i < t.traders.length; i++) {
            for (int j = 0; j < t.traders[j].length; j++) {
                Traders tI = t.traders[i][j];
                if (tI != null) {
                    count += 1;
                    int nameLength = tI.getName().length() +1;
                    System.out.printf("%-5d%-8s%-14s",count,tI.getName(),tI.getSurname());
//                    System.out.print(count + "   " + tI.getName() + " " + tI.getSurname() + "        ");
                    int choise = r.nextInt(2) + 1;
                    if (choise == 1) {
                        checkPlanshets();
                    } else {
                        checkNoteBooks();
                    }
                }
            }
        }
        System.out.println("------------------------------------------------------------------------------------------------");

    }

    public void checkPlanshets() {
        Planshets p = new Planshets();
        Random r = new Random();
        while (true) {
            int i = r.nextInt(p.labelStorage.length);
            int j = 0;
            j = r.nextInt(p.labelStorage[j].length);
            Technic p1 = p.labelStorage[i][j];
            if (p1 != null) {
                int num = r.nextInt(5) + 1;
                System.out.printf("%-14s%-16s%-21s%-11d%d%n",p1.getType(),p1.getLabel(),p1.getName(),p1.getPrice(),num);
                return;
            }
        }
    }

    public void checkNoteBooks() {
        Notebooks n = new Notebooks();
        Random r = new Random();
     while (true){
         int i = r.nextInt(n.labelStorage.length);
         int j = 0;
         j = r.nextInt(n.labelStorage[j].length);
                Technic n1 = n.labelStorage[i][j];
                if (n1 != null) {
                    int num = r.nextInt(5) + 1;
                    System.out.printf("%-14s%-16s%-21s%-11d%d%n",n1.getType(),n1.getLabel(),n1.getName(),n1.getPrice(),num);
                    return;
                }
            }
        }


}
