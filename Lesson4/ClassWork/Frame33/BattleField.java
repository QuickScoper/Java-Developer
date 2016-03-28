package Lesson4.ClassWork.Frame33;

public class BattleField {

    private int width = 576;
    private int height = 576;

    String[][] battleField = {
            {"B", "B", "B", "B", "B", "B", "B", "B", "B"},
            {"B", " ", " ", " ", " ", " ", " ", " ", "B"},
            {"B", " ", "B", "B", "B", " ", " ", " ", "B"},
            {"B", " ", "B", " ", "B", " ", " ", " ", "B"},
            {"B", "B", "B", " ", "B", "B", "B", " ", "B"},
            {"B", " ", "B", " ", " ", " ", "B", "B", "B"},
            {"B", "B ", "B", " ", " ", " ", " ", "B","B"},
            {"B", " ", "B", " ", " ", " ", " ", " ", "B"},
            {"B", " ", "B", " ", " ", " ", " ", " ", "B"}
    };


    BattleField(){

    }

    BattleField(String[][] battleField){
        this.battleField = battleField;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDimensionX(){
       return battleField.length;
    }
    public int getDimensionY(){
        return battleField.length;
    }
    public String updateQuadrant(int v,int h,String symbol){
        return battleField[v][h] = symbol;
    }
    public String scanQuadrant(int v,int h){
        return battleField[v][h];

    }


}
