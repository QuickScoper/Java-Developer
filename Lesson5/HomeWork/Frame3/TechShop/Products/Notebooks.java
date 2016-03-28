package Lesson5.HomeWork.Frame3.TechShop.Products;


import Lesson5.HomeWork.Frame3.TechShop.ProductCharacteristics.Type;
import Lesson5.HomeWork.Frame3.TechShop.Technic;
import Lesson5.HomeWork.Frame3.TechShop.ProductCharacteristics.Color;
import Lesson5.HomeWork.Frame3.TechShop.ProductCharacteristics.Label;
import Lesson5.HomeWork.Frame3.TechShop.ProductCharacteristics.OS;

public class Notebooks extends Technic {

    public Technic[][] labelStorage;

   public Notebooks() {

        labelStorage = new Technic[26][];
        fillStorage(labelStorage);

        assortementOfNoteBooks();
    }


    public void searchByLabel(Label label) {

        for (int i = 0; i < labelStorage[label.getId()].length; i++) {
            Technic n = labelStorage[label.getId()][i];
            if (n != null) {
                System.out.println("Name : " + n.getName() + " * Lable : " + n.getLabel() + " * Color : " + n.getColor() + " * OS : "
                        + n.getOperationalSystem() + " * Screen Diagonal : " + n.getScreenDiagonal() + "\" * Price : " + n.getPrice() + "rub.");
            }
        }

    }

    public void searchByName(Label label, String name) {
        for (int i = 0; i < labelStorage[label.getId()].length; i++) {
            Technic n = labelStorage[label.getId()][i];
            if (n != null) {
                if (n.getName().toLowerCase().equals(name.toLowerCase())) {
                    System.out.println("Name : " + n.getName() + " * Lable : " + n.getLabel() + " * Color : " + n.getColor() + " * OS : "
                            + n.getOperationalSystem() + " * Screen Diagonal : " + n.getScreenDiagonal() + "\" * Price : " + n.getPrice() + "rub.");

                }
            }
        }

    }


    public void fillStorage(Technic[][] storage) {
        for (int i = 0; i < storage.length; i++) {
            storage[i] = new Technic[10];
        }
    }


    public void addToMag(Technic notebooks) {

        addToStorage(labelStorage[notebooks.getLabel().getId()], notebooks);

    }

    public void addToStorage(Technic[] storage, Technic notebooks) {

        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null) {
                storage[i] = notebooks;
                return;
            }
        }
    }

    public void assortementOfNoteBooks() {


        Technic n = new Technic();
        n.setOperationalSystem(OS.WINDOWS_8_1_64);
        n.setName("GT72 2QE");
        n.setLabel(Label.MSI);
        n.setColor(Color.BLACK);
        n.setScreenDiagonal(17.3);
        n.setPrice(105860);
        n.setType(Type.NOTEBOOK);
        addToMag(n);

        n = new Technic();
        n.setOperationalSystem(OS.WINDOWS_8_1_64);
        n.setName("GE70 2PE");
        n.setLabel(Label.MSI);
        n.setColor(Color.BLACK);
        n.setScreenDiagonal(17.3);
        n.setPrice(57000);
        n.setType(Type.NOTEBOOK);
        addToMag(n);

        n = new Technic();
        n.setOperationalSystem(OS.WINDOWS_8_1_64);
        n.setName("GS70 2QE");
        n.setLabel(Label.MSI);
        n.setColor(Color.RED);
        n.setScreenDiagonal(17.3);
        n.setPrice(85000);
        n.setType(Type.NOTEBOOK);
        addToMag(n);

        n = new Technic();
        n.setOperationalSystem(OS.WINDOWS_8_1_64);
        n.setName("GS60 2QE");
        n.setLabel(Label.MSI);
        n.setColor(Color.WHITE);
        n.setScreenDiagonal(15.6);
        n.setPrice(100000);
        n.setType(Type.NOTEBOOK);
        addToMag(n);

        n = new Technic();
        n.setOperationalSystem(OS.MacOS);
        n.setName("MacBook Pro 15");
        n.setLabel(Label.APPLE);
        n.setColor(Color.WHITE);
        n.setScreenDiagonal(15.4);
        n.setPrice(140000);
        n.setType(Type.NOTEBOOK);
        addToMag(n);

        n = new Technic();
        n.setOperationalSystem(OS.MacOS);
        n.setName("MacBook Pro 13");
        n.setLabel(Label.APPLE);
        n.setColor(Color.BLACK);
        n.setScreenDiagonal(13.3);
        n.setPrice(100000);
        n.setType(Type.NOTEBOOK);
        addToMag(n);

        n = new Technic();
        n.setOperationalSystem(OS.MacOS);
        n.setName("MacBook Air 11");
        n.setLabel(Label.APPLE);
        n.setColor(Color.GOLD);
        n.setScreenDiagonal(11.6);
        n.setPrice(88000);
        n.setType(Type.NOTEBOOK);
        addToMag(n);

        n = new Technic();
        n.setOperationalSystem(OS.MacOS);
        n.setName("MacBook Air 15");
        n.setLabel(Label.APPLE);
        n.setColor(Color.BLACK);
        n.setScreenDiagonal(15.3);
        n.setPrice(130000);
        n.setType(Type.NOTEBOOK);
        addToMag(n);

        n = new Technic();
        n.setOperationalSystem(OS.WINDOWS_8_64);
        n.setName("Alienware 15");
        n.setLabel(Label.ALIENWARE);
        n.setColor(Color.BLACK);
        n.setScreenDiagonal(15.6);
        n.setPrice(112000);
        n.setType(Type.NOTEBOOK);
        addToMag(n);

        n = new Technic();
        n.setOperationalSystem(OS.WINDOWS_7_ULTIMATE);
        n.setName("Alienware 18");
        n.setLabel(Label.ALIENWARE);
        n.setColor(Color.GREY);
        n.setScreenDiagonal(18.4);
        n.setPrice(233563);
        n.setType(Type.NOTEBOOK);
        addToMag(n);

        n = new Technic();
        n.setOperationalSystem(OS.WINDOWS_7_ULTIMATE);
        n.setName("Alienware M17x");
        n.setLabel(Label.ALIENWARE);
        n.setColor(Color.RED);
        n.setScreenDiagonal(17.3);
        n.setPrice(174290);
        n.setType(Type.NOTEBOOK);
        addToMag(n);

        n = new Technic();
        n.setOperationalSystem(OS.WINDOWS_8_1_32);
        n.setName("S20-30");
        n.setLabel(Label.LENOWO);
        n.setColor(Color.BLACK);
        n.setScreenDiagonal(11.6);
        n.setPrice(14400);
        n.setType(Type.NOTEBOOK);
        addToMag(n);

        n = new Technic();
        n.setOperationalSystem(OS.WINDOWS_8_64);
        n.setName("IdeaPad Z5070");
        n.setLabel(Label.LENOWO);
        n.setColor(Color.METALLIC);
        n.setScreenDiagonal(15.6);
        n.setPrice(43400);
        n.setType(Type.NOTEBOOK);
        addToMag(n);

        n = new Technic();
        n.setOperationalSystem(OS.WINDOWS_8_1_64);
        n.setName("ATIV Book 9 Lite");
        n.setLabel(Label.SAMSUNG);
        n.setColor(Color.WHITE);
        n.setScreenDiagonal(13.3);
        n.setPrice(40000);
        n.setType(Type.NOTEBOOK);
        addToMag(n);

        n = new Technic();
        n.setOperationalSystem(OS.WINDOWS_8_1_64);
        n.setName("X552WA");
        n.setLabel(Label.ASUS);
        n.setColor(Color.BLACK);
        n.setScreenDiagonal(15.6);
        n.setPrice(22500);
        n.setType(Type.NOTEBOOK);
        addToMag(n);

        n = new Technic();
        n.setOperationalSystem(OS.WINDOWS_8_1_64);
        n.setName("G751JY");
        n.setLabel(Label.ASUS);
        n.setColor(Color.BLACK);
        n.setScreenDiagonal(17.3);
        n.setPrice(129990);
        n.setType(Type.NOTEBOOK);
        addToMag(n);


        n = new Technic();
        n.setOperationalSystem(OS.WINDOWS_8_1_64);
        n.setName("N750JK");
        n.setLabel(Label.ASUS);
        n.setColor(Color.WHITE);
        n.setScreenDiagonal(17.3);
        n.setPrice(63000);
        n.setType(Type.NOTEBOOK);
        addToMag(n);


        n = new Technic();
        n.setOperationalSystem(OS.WINDOWS_8_1_64);
        n.setName("Aspire E5-771G-348S");
        n.setLabel(Label.ACER);
        n.setColor(Color.GREY);
        n.setScreenDiagonal(17.3);
        n.setPrice(29500);
        n.setType(Type.NOTEBOOK);
        addToMag(n);

        n = new Technic();
        n.setOperationalSystem(OS.WINDOWS_8_1_64);
        n.setName("Extensa 2510G-53DE");
        n.setLabel(Label.ACER);
        n.setColor(Color.BLACK);
        n.setScreenDiagonal(15.6);
        n.setPrice(23800);
        n.setType(Type.NOTEBOOK);
        addToMag(n);

        n = new Technic();
        n.setOperationalSystem(OS.WINDOWS_8_1_64);
        n.setName("Aspire V Nitro");
        n.setLabel(Label.ACER);
        n.setColor(Color.BLACK);
        n.setScreenDiagonal(15.6);
        n.setPrice(76900);
        n.setType(Type.NOTEBOOK);
        addToMag(n);


    }
}