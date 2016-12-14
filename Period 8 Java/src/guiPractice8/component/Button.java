package guiPractice8.component;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Font;

public class Button extends TextLabel {
	
	private Color color;
	private String Action;
	
	public Button(int x, int y, int w, int h, String text, Color color, Action action) {
		super(x, y, w, h, text, color, action);
		
	}
	
	public void update(Graphics2D g){
		g = clear();//clears image and gets new graphics
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.black);
		g.drawRoundRect(400, 500, 500, 200, 25, 30);
		g.fillRoundRect(400, 500, 500, 200, 25, 30);
	}

}
