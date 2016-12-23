package guiPractice8;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import guiPractice8.component.Clickable;
import guiPractice8.component.Visible;

public abstract class ClickableScreen extends Screen implements MouseListener {

	private ArrayList<Clickable> clickables;
	
	public ClickableScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	public abstract void initAllObjects(ArrayList<Visible> visibles);
	
	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		initAllObjects(viewObjects);
		clickables = new ArrayList<Clickable>();
		for(int i = 0; i <viewObjects.size();i++){
			if(viewObjects.get(i) instanceof Clickable){
				clickables.add((Clickable) viewObjects.get(i));
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		for (int i = 0; i < clickables.size(); i++){
			if(clickables.get(i).isHovered(e.getX(), e.getY())){
				clickables.get(i).act();
					break;
			}
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public MouseListener getMouseListener(){
		return this;
	}
	
	

}