package Lesson6.HomeWork.Cofee.Sorts;

/**
 * Created by QQ on 02.09.2015.
 */
public class GreenTea extends Sort{

    private int Tea = 15;

    public GreenTea(){
        name = "Green Tea";
        setWaterNumber(300);
        setTeaNumber(Tea);
        price = (getTeaGreenPrice() + getWaterPrice());
        recipe = getTeaGreen()+",";
        recipe1 = getWater()+".";
        System.out.printf("%-15s%-27s%-1.2f%n%37s%n", name,recipe, price,recipe1);

    }


    public GreenTea(int i1) {
        if (checkNum(i1) == false) {
            System.out.println("Введите число от 1 до 3");
        } else {
            name = "Green Tea";
            setWaterNumber(Tea * i1);
            setTeaNumber(300);
            price = (getTeaGreenPrice() + getWaterPrice());
            recipe = getTeaGreen()+",";
            recipe1 = getWater()+".";
            System.out.printf("%-15s%-27s%-1.2f%n%37s%n", name,recipe, price,recipe1);
        }
    }




   protected boolean checkNum(int num) {
        if (num < 1 || num > 3) {
            return false;
        }
        return true;
    }
}
