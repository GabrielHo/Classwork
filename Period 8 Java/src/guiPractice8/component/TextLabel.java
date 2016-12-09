package guiPractice8.component;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class TextLabel extends Component {

	//FIELDS
	private String text;
	private String font;
	private int size;
	
	public TextLabel(int x, int y, int w, int h, String text){
		super(x,y,w,h);
		this.text = text;
		font = "Helvetica";
		size = 20;
		update();
	}
	
	public void setFont(String s){
		this.font = s;
	}
	
	public void setSize(int s){
		this.size = s;
	}
	
	public void setText(String s){
		this.text = s;
	}
	
	public void update(Graphics2D g) {
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.black);
		g.setFont(new Font(font, Font.PLAIN,size));
		g.drawString(text, 4, getHeight()-5);

	}

}
