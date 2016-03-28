package Lesson8.ClassWork.Frame15GuiForShop.TechShop.Service;


import Lesson8.ClassWork.Frame15GuiForShop.TechShop.Products.Notebooks;
import Lesson8.ClassWork.Frame15GuiForShop.TechShop.Products.Planshets;
import Lesson8.ClassWork.Frame15GuiForShop.TechShop.Technic;

import java.util.Random;

public class Storage {

    public Storage() {

    }


    public int stat() {
        int number;
        Random r = new Random();
        number = 5 + r.nextInt(15);
        return number;
    }

    public void storageInformation() {
        Notebooks n = new Notebooks();
        Planshets p = new Planshets();
        Random r = new Random();

        for (int i = 0; i < p.labelStorage.length; i++) {
            for (int j = 0; j < p.labelStorage[i].length; j++) {
                Technic p1 = p.labelStorage[i][j];
                if (p1 != null) {
                    System.out.println(p1.getType() + " * Lable : " + p1.getLabel() + " * Name : " + p1.getName() + " * In storage : " + stat());
                }
            }
        }

        for (int i = 0; i < n.labelStorage.length; i++) {
            for (int j = 0; j < n.labelStorage[i].length; j++) {
                Technic n1 = n.labelStorage[i][j];
                if (n1 != null) {
                    System.out.println(n1.getType() + " * Lable : " + n1.getLabel() + " * Name : " + n1.getName() + " * In storage : " + stat());
                }
            }
        }
    }
}
