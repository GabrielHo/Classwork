package guiPractice8;

import guiPractice8.component.Visible;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public abstract class Screen {

	private int width;
	private int height;
	private ArrayList<Visible> viewObjects;
	protected BufferedImage image;

	public Screen (int width, int height){
		viewObjects = new ArrayList<Visible>();
		this.width = width;
		this.height = height;
		initObjects(viewObjects);
		initImage();
	}
	
	public abstract void initObjects(ArrayList<Visible> viewObjects);

	private void initImage(){
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		update();
	}

	public void update() {
		//where we drawing stuff
		Graphics2D g = image.createGraphics();
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.black);
		//drawing all visible stuff
		for(Visible v : viewObjects){
			g.drawImage(v.getImage(), v.getX(), v.getY(), null);
		}
			
//		g.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
//		g.drawString("Wuss poppin", 40, 80);
//		g.drawOval(20, 40, 160, 80);
//		g.drawRect(60,120,80,100);
//		g.drawLine(170,150,110,200);
//		
//		g.setColor(Color.green);
//		for(int i=0; i<image.getWidth(); i+=2){
//			g.drawLine(i,225,i,238);
//		}
	}
	
	public BufferedImage getImage(){
		return image;
	}

	public MouseListener getMouseListener(){
		return null;
	}

	public MouseMotionListener getMouseMotionListener() {
		return null;
	}
}
