package Lesson8.ClassWork.GuiForShop;


public class Demo {

    public static void main(String[] args) {
//        new TechShopUi();

        bestBirds BB = new bestBirds();
        setProducts(BB);
        TechShopUi t = new TechShopUi(BB);
    }


    public static void setProducts(bestBirds shop){



        product p =new product();

        p.setType("Eagle");
        p.setCost(20);
        shop.addToMag(p);

        p = new product();
        p.setType("Duck");
        p.setCost(5);
        shop.addToMag(p);

        p = new product();
        p.setType("Chicken");
        p.setCost(3);
        shop.addToMag(p);

    }


}
