package Lesson6.ClassWork.AbstractTank;

import java.util.Random;

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

    public String getAgressorLocation() {
        Random r = new Random();
        int locationX = r.nextInt(9);
        int locationY = r.nextInt(9);
        String agrLocation = locationX * 64 + "_" + locationY * 64;
        if (!scanQuadrant(locationY, locationX).trim().isEmpty()) {
            updateQuadrant(locationY, locationX, "");
        }
//        else if (locationX * 64 ==  && locationY * 64 == y) {
//            locationX += 1;
//        }
        return agrLocation;
    }


}
