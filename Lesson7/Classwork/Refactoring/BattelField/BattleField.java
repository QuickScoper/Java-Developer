package Lesson7.Classwork.Refactoring.BattelField;

import Lesson6.ClassWork.abstractShape.Drawable;
import Lesson7.Classwork.Refactoring.BattelField.Materials.*;

import java.awt.*;
import java.util.Random;

public class BattleField implements Drawable {

    private int width = 576;
    private int height = 576;
    private String Brick = "B";
    private String Water = "W";
    private String Eagle = "E";
    private String Rock = "R";

     String[][] battleField = {
            {"B", "B", "B", "B", "B", "B", "B", "B", "B"},
            {"B", " ", " ", " ", " ", " ", " ", " ", "B"},
            {"B", " ", "B", "B", "B", " ", "R", "R", "B"},
            {"B", " ", "B", " ", "B", " ", " ", " ", "B"},
            {"B", "B", "B", "W", "W", "W", "W", "W", "W"},
            {"W", "W", "W", "W", " ", " ", "B", "B", "B"},
            {"B", "R", "R", " ", " ", " ", " ", "B", "B"},
            {"B", " ", "B", " ", "R", "R", "R", " ", "B"},
            {"B", " ", "B", " ", "B", "E", "B", " ", "B"}
    };

    private Material[][] BattleField2 = new Material[battleField.length][battleField.length];

    public BattleField() {
        bfDraw();
    }

    BattleField(String[][] battleField) {
        this.battleField = battleField;
        bfDraw();
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDimensionX() {
        return battleField.length;
    }

    public int getDimensionY() {
        return battleField.length;
    }

    public void updateQuadrant(int v, int h) {
        BattleField2[v][h].destroy();
    }

    public Material scanQuadrant(int v, int h) {
        return BattleField2[v][h];

    }

    public String getAgressorLocation() {
        Random r = new Random();
        int locationX = r.nextInt(9);
        int locationY = r.nextInt(9);
        Material material = scanQuadrant(locationY,locationX);
        String agrLocation = locationX * 64 + "_" + locationY * 64;
        if (!(material instanceof Ground)) {
            updateQuadrant(locationY, locationX);
        }
//        else if (locationX * 64 ==  && locationY * 64 == y) {
//            locationX += 1;
//        }
        return agrLocation;
    }

    @Override
    public void draw(Graphics g) {
        for (int i = 0; i < getDimensionX(); i++) {
            for (int j = 0; j < getDimensionY(); j++) {
                BattleField2[i][j].draw(g);
            }
        }
    }

    public String getQuadrantXY(int v, int h) {
        return (v - 1) * 64 + "_" + (h - 1) * 64;
    }

    public void bfDraw() {
        for (int j = 0; j < getDimensionY(); j++) {
            for (int k = 0; k < getDimensionX(); k++) {
                    String coordinates = getQuadrantXY(j + 1, k + 1);
                    int separator = coordinates.indexOf("_");
                    int y = Integer.parseInt(coordinates
                            .substring(0, separator));
                    int x = Integer.parseInt(coordinates
                            .substring(separator + 1));
                    String bf = battleField[j][k];
                    Material material;
                    if (bf.equals(Brick)) {
                        material = new Brick(x, y);
                    } else if (bf.equals(Eagle)) {
                        material = new Eagle(x, y);
                    } else if (bf.equals(Water)) {
                        material = new Water(x, y);
                    } else if (bf.equals(Rock)) {
                        material = new Rock(x, y);
                    } else {
                        material = new Ground(x, y);
                    }

                    BattleField2[j][k] = material;
            }
        }
    }
}
