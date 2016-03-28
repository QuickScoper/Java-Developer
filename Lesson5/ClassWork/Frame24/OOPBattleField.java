package Lesson5.ClassWork.Frame24;

public class OOPBattleField {
	
	private int BfWidth = 576;
	private int BfHeight = 576;

	String[][] battleField = { 
			{ "B", "B", "B", "B", "B", "B", "B", "B", "B" },
			{ "B", " ", " ", " ", " ", " ", " ", " ", "B" },
			{ "B", " ", "B", "B", "B", " ", " ", " ", "B" },
			{ "B", " ", "B", " ", "B", " ", " ", " ", "B" },
			{ "B", " ", "B", " ", "B", "B", "B", " ", "B" },
			{ "B", " ", "B", " ", " ", " ", "B", "B", "B" },
			{ "B", " ", "B", " ", " ", " ", " ", "B", "B" },
			{ "B", " ", "B", " ", " ", " ", " ", " ", "B" },
			{ "B", " ", " ", " ", " ", " ", " ", " ", "B" }
};
	
	
	public OOPBattleField(){
	}
	public OOPBattleField(String[][] battleField){
		this.battleField = battleField;
	}
	
	public int getBfWidth() {
		return BfWidth;
	}
	public int getBfHeight() {
		return BfHeight;
	}
	public String scanQuadrant(int v , int h){
		return battleField[v][h];
	}
	public String updateQuadrant(int v , int h, String symbol){
		return battleField[v][h] = symbol;
	}
	public int getDimentionX(){
		return battleField.length;
	}
	public int getDimentionY(){
		return battleField.length;
	}
}
