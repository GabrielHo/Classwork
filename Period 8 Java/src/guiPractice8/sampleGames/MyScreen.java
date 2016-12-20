package guiPractice8.sampleGames;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import guiPractice8.Screen;
import guiPractice8.component.Action;
import guiPractice8.component.Button;
import guiPractice8.component.Graphic;
import guiPractice8.component.Visible;

public class MyScreen extends Screen implements MouseMotionListener, MouseListener{

	private Graphic pinkguy;
	private Button back;
	
	public MyScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		pinkguy = new Graphic(200,200,.25,"resources/sampleImages/hey thats pretty good.jpeg");
		back = new Button(50,50,100,60,"Back", Color.GRAY, new Action() {
			
			public void act() {
				MouseFollower.game.setScreen(MouseFollower.coordScreen);
			}
		});
		viewObjects.add(pinkguy);
		viewObjects.add(back);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
