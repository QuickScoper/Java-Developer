package Lesson7.Classwork.Frame23hashCode;


public class Adress {

    String city;
    String street;
    int house;

    Adress(String city,String street,int house){
        if(city == null || street == null || house<=0){
            throw new IllegalStateException("Parametrs should not contain null values and house should be > 0");
        }
        this.city = city;
        this.street = street;
        this.house = house;
    }


    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Adress){
            Adress a = (Adress) obj;
            if(street.equals(a.getStreet()) && city.equals(a.getCity()) && house == a.getHouse()){
                return true;
            }
        }
        return false;
    }


    @Override
    public int hashCode() {
        int result = 25;
        result = 37*result + city.hashCode();
        result = 37*result + street.hashCode();
        result = 37*result + house;
        return result;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
