package guiPractice8.component;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GraphicClickScreen implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent m) {
		if(picture.isHovered(m.getX(), m.getY())){
			return image;
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
	
}
