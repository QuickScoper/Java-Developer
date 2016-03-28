package Lesson6.HomeWork.Cofee.Sorts;


import Lesson6.HomeWork.Cofee.IngredientsInfo.IngredienInfo;

public class Sort extends IngredienInfo{

    protected String name;
    protected String name1;
    protected double price;
    protected String recipe;
    protected String recipe1;

    public Sort() {
    }

    protected boolean checkNum(int num) {
        if (num < 1 || num > 3) {
            return false;
        }
        return true;
    }



}
