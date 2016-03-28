package Lesson5.HomeWork.Frame3.TechShop;


import Lesson5.HomeWork.Frame3.TechShop.Products.Notebooks;
import Lesson5.HomeWork.Frame3.TechShop.Products.Planshets;
import Lesson5.HomeWork.Frame3.TechShop.ProductCharacteristics.Label;
import Lesson5.HomeWork.Frame3.TechShop.Service.Magazine;
import Lesson5.HomeWork.Frame3.TechShop.Service.Storage;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        Planshets pl = new Planshets();
//        pl.searchByLabel(Label.SAMSUNG);
//        System.out.println();
//        System.out.println();
//        pl.searchByName("Galaxy Tab S");
//        System.out.println();
//        System.out.println();
//        System.out.println();
//
        Notebooks n = new Notebooks();
//        n.searchByLabel(Label.ALIENWARE);
//        System.out.println();
//        System.out.println();
//        n.searchByName(Label.APPLE,"MacBook Air 15");

        Magazine m = new Magazine();

//        m.magStooragePrice();

//        m.soldWeekStatistic();

        m.assortmentOfProducts();


        Storage storage = new Storage();

//        storage.storageInformation();
    }
}
