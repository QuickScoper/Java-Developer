package Lesson8.ClassWork.GuiForShop;




public class product {


    private String type;
    private int cost;

    public static final String alphabet = "ABCDEFGHIGKLMNOPQRSTUVWXYZ";

    public product(String type,int cost){
        this.type =type;
        this.cost = cost;

    }

    public product(){

    }


    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



}
