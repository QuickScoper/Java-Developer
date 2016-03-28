package Lesson5.ClassWork.Frame24;

import java.util.Random;

public class OOPTank {

	private Direction direction;
	private int x;
	private int y;
	protected int speed = 10;

	private ActionField af;
	private OOPBattleField bf;


	public OOPTank(ActionField af, OOPBattleField bf) {
		this(af, bf, 128, 512, Direction.UP);
	}

	public OOPTank(ActionField af, OOPBattleField bf, int x, int y,
			Direction direction) {
		this.af = af;
		this.bf = bf;
		this.x = x;
		this.y = y;
		this.direction = direction;
	}

	public void turn(Direction direction) throws Exception {
		this.direction = direction;
		af.processTurn(this);
	}  

	public void move() throws Exception {
		af.processMove(this);
	}

	public void fire() throws Exception {
		OOPBullet bullet = new OOPBullet((x + 25), (y + 25), direction);
		af.processFire(bullet);
	}

	public void updateX(int x) {
		this.x += x;
	}

	public void updateY(int y) {
		this.y += y;
	}

	public Direction getDirection() {
		return direction;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	public int getSpeed(){
		return speed;
	}
//	void moveRandom() throws Exception {
//		Random r = new Random();
//		int i;
//		while (true) {
//			i = r.nextInt(5);
//			if (i > 0) {
//				fire();
//				direction = i;
//				af.processTurn(this);
//				af.processMove(this);
//			}
//		}
//	}

	public void destroy(){
		x = -100;
		y= -100;
	}
	
}
