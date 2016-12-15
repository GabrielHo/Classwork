package guiPractice8.component;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Font;
import java.awt.FontMetrics;

public class Button extends TextLabel implements Clickable{
	
	private Color color;
	private Action action;
	
	public Button(int x, int y, int w, int h, String text, Color color, Action action) {
		super(x, y, w, h, text, color, action);
		this.color = color;
		this.action = action;
		update();
		
	}
	
	public Color getColor(){
		return color;
	}
	
	public void setColor(Color c){
		color = c;
		update();
	}
	
	public void update(Graphics2D g){
		g = clear();//clears image and gets new graphics
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(color);
		g.fillRoundRect(400, 500, 500, 200, 25, 30);
		g.setColor(Color.black);
		g.drawRoundRect(400, 500, 500, 200, 25, 30);
		g.setFont(new Font(getFont(),Font.PLAIN,getSize()));
		FontMetrics fm = g.getFontMetrics();
		
		if(getText()!= null){
			g.setColor(Color.white);
			String t = getText();
			int cutoff = t.length();
			while(cutoff > 0 && fm.stringWidth(t) > getWidth()){
				cutoff--;
				t = t.substring(0, cutoff);
			}
			g.drawString(t,(getWidth()-fm.stringWidth(t)/2), (getHeight() + fm.getHeight() - fm.getDescent())/2);
		}
	
	}

	@Override
	public boolean isHovered(int x, int y) {
		
		return false;
	}

	@Override
	public void act() {
		
	}

}
