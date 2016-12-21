package guiPractice8.sampleGames;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import guiPractice8.Screen;
import guiPractice8.component.Action;
import guiPractice8.component.ClickableGraphic;
import guiPractice8.component.Graphic;
import guiPractice8.component.Visible;

public class ClickGraphicScreen extends Screen implements MouseListener{

	private ClickableGraphic pinkguy;
	
	public ClickGraphicScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}
	
	public void initObjects(ArrayList<Visible> viewObjects) {
		pinkguy = new ClickableGraphic(50, 50, .5, "resources/sampleImages/pinkguy.jpg");
		pinkguy.setAction(new Action(){
				public void act() {
					pinkguy.setX(pinkguy.getX() + 50);
					pinkguy.setY(pinkguy.getY() + 50);
				}
				
			});
		viewObjects.add(pinkguy);
	}

	@Override
	public void mouseClicked(MouseEvent m) {
		if(pinkguy.isHovered(m.getX(), m.getY())){
			pinkguy.act();
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public MouseListener getMouseListener(){
		return this;
	}
	
}
