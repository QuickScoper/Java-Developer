package Lesson6.HomeWork.Cofee.Sorts;


public class BlackTea extends Sort {

    private int Tea = 15;

    public BlackTea() {
        name = "Black Tea";
        setWaterNumber(300);
        setTeaNumber(Tea);
        price = (getTeaBlackPrice() + getWaterPrice());
        recipe = getTeaBlack()+",";
        recipe1 = getWater()+".";
        System.out.printf("%-15s%-27s%-1.2f%n%37s%n", name,recipe, price,recipe1);

    }

    public BlackTea(int i1) {
        if (checkNum(i1) == false) {
            System.out.println("Введите число от 1 до 3");
        } else {
            name = "Black Tea";
            setWaterNumber(Tea * i1);
            setTeaNumber(300);
            price = (getTeaBlackPrice() + getWaterPrice());
            recipe = getTeaBlack()+",";
            recipe1 = getWater()+".";
            System.out.printf("%-15s%-27s%-1.2f%n%37s%n", name,recipe, price,recipe1);
        }
    }

    protected boolean checkNum(int num) {
        if (num < 1 || num > 2) {
            return false;
        }
        return true;
    }
}
