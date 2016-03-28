package Lesson6.HomeWork.Cofee.Sorts;


public class TeaWithBergamot extends Sort {

    private int Tea = 15;

    public TeaWithBergamot() {
        name = "Tea with";
        name1 = "Bergamote";
        setWaterNumber(300);
        setTeaNumber(Tea);
        price = (getTeaWithBergamotPrice() + getWaterPrice());
        recipe = getTeaWithBergamot() + ",";
        recipe1 = getWater() + ".";
        System.out.printf("%-15s%-27s%-1.2f%n%-15s%-22s%n", name, recipe, price, name1, recipe1);
    }

    public TeaWithBergamot(int i1) {
        if (checkNum(i1) == false) {
            System.out.println("Введите число от 1 до 3");
        } else {
            name = "Tea with";
            name1 = "Bergamote";
            setWaterNumber(300);
            setTeaNumber(Tea * i1);
            price = (getTeaWithBergamotPrice() + getWaterPrice());
            recipe = getTeaWithBergamot() + ",";
            recipe1 = getWater() + ".";
            System.out.printf("%-15s%-27s%-1.2f%n%-15s%-22s%n", name, recipe, price, name1, recipe1);
        }
    }

    protected boolean checkNum(int num) {
        if (num < 1 || num > 2) {
            return false;
        }
        return true;
    }


}
