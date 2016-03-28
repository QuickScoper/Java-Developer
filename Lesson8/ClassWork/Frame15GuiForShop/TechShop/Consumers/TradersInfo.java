package Lesson8.ClassWork.Frame15GuiForShop.TechShop.Consumers;

public class TradersInfo extends Traders {

    public Traders[][] traders;

    public static final String alphabet = "ABCDEFGHIGKLMNOPQRSTUVWXYZ";

    public TradersInfo(){

        traders = new Traders[26][];
        fillTraders(traders);

        listOfTraders();
    }



    public void fillTraders(Traders[][] traders){
        for(int i = 0;i<traders.length;i++){
            traders[i] = new Traders[10];
        }
    }

    public void addToList(Traders trader){
        int pos = alphabet.indexOf(trader.getName().charAt(0));
        fillList(traders[pos],trader);
    }

    public void fillList(Traders[] trader,Traders trade){

        for(int i = 0;i<trader.length;i++){
            if(trader[i] == null){
                trader[i] = trade;
                return;
            }
        }
    }


    public void listOfTraders(){

        Traders t = new Traders();
        t.setName("Nickita");
        t.setSurname("Chernyshev");
        addToList(t);

        t = new Traders();
        t.setName("Irina");
        t.setSurname("Tolmacheva");
        addToList(t);

        t = new Traders();
        t.setName("Anton");
        t.setSurname("Zinovjev");
        addToList(t);

        t = new Traders();
        t.setName("Mihail");
        t.setSurname("Grishin");
        addToList(t);

        t = new Traders();
        t.setName("Ivan");
        t.setSurname("Romanica");
        addToList(t);

        t = new Traders();
        t.setName("Elena");
        t.setSurname("Mihailova");
        addToList(t);

        t = new Traders();
        t.setName("Petr");
        t.setSurname("Ivanov");
        addToList(t);

        t = new Traders();
        t.setName("Sergei");
        t.setSurname("Nikolaev");
        addToList(t);

        t = new Traders();
        t.setName("Semen");
        t.setSurname("Lobanov");
        addToList(t);


    }
}
