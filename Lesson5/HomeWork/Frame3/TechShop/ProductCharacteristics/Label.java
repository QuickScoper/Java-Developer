package Lesson5.HomeWork.Frame3.TechShop.ProductCharacteristics;


public enum Label {

    SAMSUNG(0),MSI(1),LENOWO(2),ACER(3),APPLE(4),ALIENWARE(5),ASUS(6);


    private int id;

    Label(int id){
        this.id = id;
    }
    public int getId() {
        return id;
    }
}
