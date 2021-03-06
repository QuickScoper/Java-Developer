package Lesson5.ClassWork.Frame24;

public class OOPBullet {
	
	private int x;
	private int y;
	private int Speed = 5;
	private Direction direction;
	
	
	public OOPBullet(int x, int y, Direction direction){
		this.x = x;
		this.y = y;
		this.direction = direction;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getSpeed() {
		return Speed;
	}
	
	public Direction getDirection() {
		return direction;
	}
	
	public void updateX(int x){
		this.x +=x;
	}
	
	public void updateY(int y){
		this.y +=y;
	}
	
	public void destroy(){
		x = -100;
		y = -100;
	}
	
	
	
	
}
