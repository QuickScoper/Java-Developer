package Lesson8.ClassWork.GuiForShop;


import java.util.ArrayList;
import java.util.List;

public class bestBirds extends product {


    public product[][] typeStorage;
    

   public bestBirds() {
        typeStorage = new product[30][];
        fillAssortment(typeStorage);

    }


 


    public void addToMag(product birds) {
//        addToStorage(typeStorage[birds.getType()], birds);
//
       int pos = alphabet.indexOf(birds.getType().toUpperCase().charAt(0));
//        addToStorage(nameStorage[pos],birds);
        
        addToStorage(typeStorage[pos],birds);


    }


    public void addToStorage(product[] storage, product birds) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null) {
                storage[i] = birds;
                return;
            }

        }
    }

    public void fillAssortment(product[][] assortment) {
        for (int i = 0; i < assortment.length; i++) {
            assortment[i] = new product[10];
        }



  }

    public List<product> getProducts(){
        List<product> b = new ArrayList<>();
        b.add(0,new product("Chicken",3) );
        b.add(0,new product("Eagle",20) );
        b.add(0,new product("Duck",5) );
        b.add(0,new product("Raven",10));
        return b;

    }

}
