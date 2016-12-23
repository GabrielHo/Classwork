package guiPractice8.whackAMole;

import java.awt.Color;
import java.awt.Graphics2D;

import guiPractice8.component.Component;

public class Player extends Component implements PlayerInterface {
	
	private int score;

	public Player(int x, int y) {
		super(x, y, 100, 100);
		score = 0;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void increaseScore(int i) {
		score += i;
		update();
	}

	@Override
	public void update(Graphics2D g) {
		g.setColor(Color.white);
		g.fillRect(x,y,getWidth(),getHeight());
		g
	}

}
