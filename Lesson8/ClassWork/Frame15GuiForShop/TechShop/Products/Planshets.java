package Lesson8.ClassWork.Frame15GuiForShop.TechShop.Products;


import Lesson8.ClassWork.Frame15GuiForShop.TechShop.ProductCharacteristics.Color;
import Lesson8.ClassWork.Frame15GuiForShop.TechShop.ProductCharacteristics.Label;
import Lesson8.ClassWork.Frame15GuiForShop.TechShop.ProductCharacteristics.OS;
import Lesson8.ClassWork.Frame15GuiForShop.TechShop.ProductCharacteristics.Type;
import Lesson8.ClassWork.Frame15GuiForShop.TechShop.Technic;

public class Planshets extends Technic {


    public Technic[][] labelStorage;

    public Technic[][] nameStorage;

   public Planshets() {
        labelStorage = new Technic[30][];
        fillAssortment(labelStorage);

        nameStorage = new Technic[26][];
        fillAssortment(nameStorage);

        assortmentOfPlanshets();
    }


    public void searchByLabel(Label label){
        for(int i = 0; i<labelStorage[i].length;i++){
            Technic pl = labelStorage[label.getId()][i];
            if(pl != null){
                System.out.println("Name : " + pl.getName() + " * Lable : " + pl.getLabel() + " * Color : " + pl.getColor() + " * OS : "
                        + pl.getOperationalSystem() + " * Screen Diagonal : " + pl.getScreenDiagonal() + "\" * Price : " + pl.getPrice() + "rub.");
            }
        }
    }

    public  void searchByName(String name){
        int pos = alphabet.indexOf(name.charAt(0));
        for(int i = 0;i<nameStorage[i].length;i++){
            Technic p = nameStorage[pos][i];
            if(p != null){
                if(p.getName().equals(name)) {
                    System.out.println("Name : " + p.getName() + " * Lable : " + p.getLabel() + " * Color : " + p.getColor() + " * OS : "
                            + p.getOperationalSystem() + " * Screen Diagonal : " + p.getScreenDiagonal() + "\" * Price : " + p.getPrice() + "rub.");
                }
            }
        }
    }


    public void addTomag(Technic planshets) {
        addToStorage(labelStorage[planshets.getLabel().getId()], planshets);

        int pos = alphabet.indexOf(planshets.getName().toUpperCase().charAt(0));
        addToStorage(nameStorage[pos],planshets);


    }


    public void addToStorage(Technic[] storage, Technic planshets) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null) {
                storage[i] = planshets;
                return;
            }

        }
    }

    public void fillAssortment(Technic[][] assortment) {
        for (int i = 0; i < assortment.length; i++) {
            assortment[i] = new Technic[10];
        }

    }

    public void assortmentOfPlanshets() {

        Technic p = new Technic();
        p.setColor(Color.BLACK);
        p.setLabel(Label.SAMSUNG);
        p.setName("Galaxy Tab S");
        p.setOperationalSystem(OS.ANDROID_4_4);
        p.setPrice(24000);
        p.setScreenDiagonal(10.5);
        p.setType(Type.PLANSHET);
        addTomag(p);

        p = new Technic();
        p.setColor(Color.WHITE);
        p.setLabel(Label.SAMSUNG);
        p.setName("Galaxy Tab 4");
        p.setOperationalSystem(OS.ANDROID_4_4);
        p.setPrice(8000);
        p.setScreenDiagonal(7.0);
        p.setType(Type.PLANSHET);
        addTomag(p);

        p = new Technic();
        p.setColor(Color.WHITE);
        p.setLabel(Label.SAMSUNG);
        p.setName("Galaxy Tab Pro");
        p.setOperationalSystem(OS.ANDROID_4_4);
        p.setPrice(20000);
        p.setScreenDiagonal(10.1);
        p.setType(Type.PLANSHET);
        addTomag(p);

        p = new Technic();
        p.setColor(Color.GREY);
        p.setLabel(Label.SAMSUNG);
        p.setName("Galaxy Tab S2");
        p.setOperationalSystem(OS.ANDROID_4_1);
        p.setPrice(25000);
        p.setScreenDiagonal(9.7);
        p.setType(Type.PLANSHET);
        addTomag(p);

        p = new Technic();
        p.setColor(Color.BLACK);
        p.setLabel(Label.SAMSUNG);
        p.setName("Galaxy Tab 8.9");
        p.setOperationalSystem(OS.ANDROID_4_2);
        p.setPrice(12000);
        p.setScreenDiagonal(8.9);
        p.setType(Type.PLANSHET);
        addTomag(p);

        p = new Technic();
        p.setColor(Color.BLACK);
        p.setLabel(Label.LENOWO);
        p.setName("Tab A8-50");
        p.setOperationalSystem(OS.ANDROID_4_2);
        p.setPrice(8500);
        p.setScreenDiagonal(8.0);
        p.setType(Type.PLANSHET);
        addTomag(p);

        p = new Technic();
        p.setColor(Color.GREY);
        p.setLabel(Label.LENOWO);
        p.setName("Yoga Tablet");
        p.setOperationalSystem(OS.ANDROID_4_1);
        p.setPrice(15500);
        p.setScreenDiagonal(8.0);
        p.setType(Type.PLANSHET);
        addTomag(p);

        p = new Technic();
        p.setColor(Color.BLACK);
        p.setLabel(Label.LENOWO);
        p.setName("IdeaTab");
        p.setOperationalSystem(OS.ANDROID_4_2);
        p.setPrice(11100);
        p.setScreenDiagonal(9.1);
        p.setType(Type.PLANSHET);
        addTomag(p);

        p = new Technic();
        p.setColor(Color.BLACK);
        p.setLabel(Label.LENOWO);
        p.setName("Yoga Tablet 2 Pro");
        p.setOperationalSystem(OS.ANDROID_4_2);
        p.setPrice(27000);
        p.setScreenDiagonal(13.3);
        p.setType(Type.PLANSHET);
        addTomag(p);

        p = new Technic();
        p.setColor(Color.METALLIC);
        p.setLabel(Label.APPLE);
        p.setName("iPad Air 2");
        p.setOperationalSystem(OS.iOS_8_0);
        p.setPrice(28000);
        p.setScreenDiagonal(9.7);
        p.setType(Type.PLANSHET);
        addTomag(p);

        p = new Technic();
        p.setColor(Color.GOLD);
        p.setLabel(Label.APPLE);
        p.setName("iPad mini 3");
        p.setOperationalSystem(OS.iOS_8_0);
        p.setPrice(19500);
        p.setScreenDiagonal(7.9);
        p.setType(Type.PLANSHET);
        addTomag(p);

        p = new Technic();
        p.setColor(Color.BLACK);
        p.setLabel(Label.APPLE);
        p.setName("iPad Air");
        p.setOperationalSystem(OS.iOS_8_0);
        p.setPrice(28000);
        p.setScreenDiagonal(9.7);
        p.setType(Type.PLANSHET);
        addTomag(p);

        p = new Technic();
        p.setColor(Color.WHITE);
        p.setLabel(Label.APPLE);
        p.setName("iPad mini");
        p.setOperationalSystem(OS.iOS_8_0);
        p.setPrice(19500);
        p.setScreenDiagonal(7.9);
        p.setType(Type.PLANSHET);
        addTomag(p);

        p = new Technic();
        p.setColor(Color.BLACK);
        p.setLabel(Label.ASUS);
        p.setName("Transformer Pad");
        p.setOperationalSystem(OS.ANDROID_4_4);
        p.setPrice(9700);
        p.setScreenDiagonal(10.1);
        p.setType(Type.PLANSHET);
        addTomag(p);

        p = new Technic();
        p.setColor(Color.LIGHT_BLUE);
        p.setLabel(Label.ASUS);
        p.setName("PhonePad");
        p.setOperationalSystem(OS.ANDROID_4_1);
        p.setPrice(6500);
        p.setScreenDiagonal(7.0);
        p.setType(Type.PLANSHET);
        addTomag(p);

        p = new Technic();
        p.setColor(Color.WHITE);
        p.setLabel(Label.ASUS);
        p.setName("MeMo");
        p.setOperationalSystem(OS.ANDROID_4_4);
        p.setPrice(15000);
        p.setScreenDiagonal(8.0);
        p.setType(Type.PLANSHET);
        addTomag(p);

        p = new Technic();
        p.setColor(Color.GREY);
        p.setLabel(Label.ASUS);
        p.setName("Transformer Book");
        p.setOperationalSystem(OS.WINDOWS_8_1);
        p.setPrice(25590);
        p.setScreenDiagonal(10.1);
        p.setType(Type.PLANSHET);
        addTomag(p);

        p = new Technic();
        p.setColor(Color.WHITE);
        p.setLabel(Label.ACER);
        p.setName("Iconia Tab");
        p.setOperationalSystem(OS.ANDROID_4_4);
        p.setPrice(7788);
        p.setScreenDiagonal(7.0);
        p.setType(Type.PLANSHET);
        addTomag(p);

        p = new Technic();
        p.setColor(Color.WHITE);
        p.setLabel(Label.ACER);
        p.setName("Aspire Switch");
        p.setOperationalSystem(OS.WINDOWS_8_1);
        p.setPrice(18000);
        p.setScreenDiagonal(11.6);
        p.setType(Type.PLANSHET);
        addTomag(p);

        p = new Technic();
        p.setColor(Color.BLACK);
        p.setLabel(Label.ACER);
        p.setName("Iconia One");
        p.setOperationalSystem(OS.ANDROID_4_4);
        p.setPrice(6900);
        p.setScreenDiagonal(8.0);
        p.setType(Type.PLANSHET);
        addTomag(p);

    }
}
