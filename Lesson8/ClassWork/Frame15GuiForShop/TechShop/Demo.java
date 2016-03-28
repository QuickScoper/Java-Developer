package Lesson8.ClassWork.Frame15GuiForShop.TechShop;


import Lesson8.ClassWork.Frame15GuiForShop.TechShop.Products.Notebooks;
import Lesson8.ClassWork.Frame15GuiForShop.TechShop.Products.Planshets;
import Lesson8.ClassWork.Frame15GuiForShop.TechShop.Service.Magazine;
import Lesson8.ClassWork.Frame15GuiForShop.TechShop.Service.Storage;

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
