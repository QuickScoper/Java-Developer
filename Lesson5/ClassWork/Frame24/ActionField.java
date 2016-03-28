package Lesson5.ClassWork.Frame24;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;


public class ActionField extends JPanel{
private boolean COLORDED_MODE = false;
 
private OOPBattleField battleField;
private OOPTank tank;
private OOPBullet bullet;
	
public void runTheGame() throws Exception{
	moveToQuadrant(1, 1);
//	tank.moveRandom();
//	tank.fire();
//	tank.fire();
//	tank.fire();
//	tank.fire();
//	tank.move();
//	tank.move();
//	tank.move();
//	tank.turn(3);
//	tank.fire();
//	tank.fire();
//	tank.move();
//	tank.move();
//	tank.turn(1);
//	tank.fire();
//	tank.fire();
//	tank.move();
//	tank.move();
	
	
}

public void processMove(OOPTank tank) throws Exception{
	Direction direction = tank.getDirection();
	this.tank = tank;
	int step = 1;
	int covered = 0;

	// check limits x: 0, 513; y: 0, 513
	if ((direction == Direction.UP && tank.getY() == 0) || (direction == Direction.DOWN && tank.getY() >= 512)
			|| (direction == Direction.LEFT && tank.getX() == 0)
			|| (direction == Direction.RIGHT && tank.getX() >= 512)) {
		System.out.println("[illegal move] direction: " + tank.getDirection()
				+ " tankX: " + tank.getX() + ", tankY: " + tank.getY());
		return;
	}

	tank.turn(direction);

	while (covered < 64) {

		if (direction == Direction.UP) {
			tank.updateY(-step);
			System.out.println("[move up] direction: " + tank.getDirection()
					+ " tankX: " + tank.getX() + ", tankY: " + tank.getY());
		} else if (direction == Direction.DOWN) {
			tank.updateY(step);
			System.out.println("[move down] direction: " + tank.getDirection()
					+ " tankX: " + tank.getX() + ", tankY: " + tank.getY());
		} else if (direction == Direction.LEFT) {
			tank.updateX(-step);
			System.out.println("[move left] direction: " + tank.getDirection()
					+ " tankX: " + tank.getX() + ", tankY: " + tank.getY());
		} else {
			tank.updateX(step);
			System.out.println("[move right] direction: " + tank.getDirection()
					+ " tankX: " + tank.getX() + ", tankY: " + tank.getY());
		}
		covered += step;

		repaint();
		Thread.sleep(tank.getSpeed());
	}

}
public void processTurn(OOPTank tank) throws Exception{
		repaint();
	}

public void processFire(OOPBullet bullet) throws Exception{
	this.bullet = bullet;
	int step = 1;

	while ((bullet.getX() > -14 && bullet.getX() < 590)
			&& (bullet.getY() > -14 && bullet.getY() < 590)) {
		if (tank.getDirection() == Direction.UP) {
			bullet.updateY(-step);
		} else if (tank.getDirection() == Direction.DOWN) {
			bullet.updateY(step);
		} else if (tank.getDirection() == Direction.LEFT) {
			bullet.updateX(-step);
		} else {
			bullet.updateX(step);
		}
		if (processInterception()) {
			bullet.destroy();
		}
		repaint();
		Thread.sleep(bullet.getSpeed());
	}
}
	private boolean processInterception() {

		String coordinates = getQuadrant(bullet.getX(), bullet.getY());
		int y = Integer.parseInt(coordinates.split("_")[0]);
		int x = Integer.parseInt(coordinates.split("_")[1]);

		if (y >= 0 && y < 9 && x >= 0 && x < 9) {
			if (!battleField.scanQuadrant(y, x).trim().isEmpty()) {
				battleField.updateQuadrant(y, x, "");
				return true;
			}
		}

		return false;
	}
	
	

	String getQuadrant(int x, int y) {
		return y / 64 + "_" + x / 64;
	}
	
	String getQuadrantXY(int v, int h) {
		return (v - 1) * 64 + "_" + (h - 1) * 64;
	}

	

	void moveToQuadrant(int v, int h) throws Exception {
		String coordinates = getQuadrantXY(v, h);
		int separator = coordinates.indexOf("_");
		int y = Integer.parseInt(coordinates.substring(0, separator));
		int x = Integer.parseInt(coordinates.substring(separator + 1));

		if (tank.getX() < x) {
			while (tank.getX() != x) {
				tank.turn(Direction.RIGHT);
				tank.fire();
				tank.move();
			}
		} else {
			while (tank.getX() != x) {
				tank.turn(Direction.LEFT);
				tank.fire();
				tank.move();
			}
		}

		if (tank.getY() < y) {
			while (tank.getY() != y) {
				tank.turn(Direction.DOWN);
				tank.fire();
				tank.move();
			}
		} else {
			while (tank.getY() != y) {
				tank.turn(Direction.UP);
				tank.fire();
				tank.move();
			}
		}
	}

	
	

	// Magic bellow. Do not worry about this now, you will understand everything
	// in this course.
	// Please concentrate on your tasks only.

	

	public ActionField() throws Exception {
		battleField = new OOPBattleField();
		tank = new OOPTank(this, battleField);
		bullet = new OOPBullet(-100, -100, Direction.NONE);
		
		JFrame frame = new JFrame("BATTLE FIELD, DAY 2");
		frame.setLocation(750, 150);
		frame.setMinimumSize(new Dimension(battleField.getBfWidth() + 15, battleField.getBfHeight() + 22));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.getContentPane().add(this);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		int i = 0;
		Color cc;
		for (int v = 0; v < 9; v++) {
			for (int h = 0; h < 9; h++) {
				if (COLORDED_MODE) {
					if (i % 2 == 0) {
						cc = new Color(252, 241, 177);
					} else {
						cc = new Color(233, 243, 255);
					}
				} else {
					cc = new Color(180, 180, 180);
				}
				i++;
				g.setColor(cc);
				g.fillRect(h * 64, v * 64, 64, 64);
			}
		}

		for (int j = 0; j < battleField.getDimentionY(); j++) {
			for (int k = 0; k < battleField.getDimentionX(); k++) {
				if (battleField.scanQuadrant(j, k).equals("B")) {
					String coordinates = getQuadrantXY(j + 1, k + 1);
					int separator = coordinates.indexOf("_");
					int y = Integer.parseInt(coordinates
							.substring(0, separator));
					int x = Integer.parseInt(coordinates
							.substring(separator + 1));
					g.setColor(new Color(0, 0, 255));
					g.fillRect(x, y, 64, 64);
				}
			}
		}

		g.setColor(new Color(255, 0, 0));
		g.fillRect(tank.getX(), tank.getY(), 64, 64);

		g.setColor(new Color(0, 255, 0));
		if (tank.getDirection() == Direction.UP) {
			g.fillRect(tank.getX() + 20, tank.getY(), 24, 34);
		} else if (tank.getDirection() == Direction.DOWN) {
			g.fillRect(tank.getX() + 20, tank.getY() + 30, 24, 34);
		} else if (tank.getDirection() == Direction.LEFT) {
			g.fillRect(tank.getX(), tank.getY() + 20, 34, 24);
		} else {
			g.fillRect(tank.getX() + 30, tank.getY() + 20, 34, 24);
		}

		g.setColor(new Color(255, 255, 0));
		g.fillRect(bullet.getX(), bullet.getY(), 14, 14);
	}


}
