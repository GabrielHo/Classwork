package guiPractice8.whackAMole;

import java.awt.image.BufferedImage;

import guiPractice8.component.Action;
import guiPractice8.component.ClickableGraphic;

public class Mole extends ClickableGraphic implements MoleInterface {
	
	private int appearanceTime;

	public Mole(int x, int y) {
		super(x,y,.50, "resources/sampleImages/mole.jpg");
	}
	
	@Override
	public int getAppearanceTime() {
		// TODO Auto-generated method stub
		return appearanceTime;
	}

	@Override
	public void setAppearanceTime(int d) {
		this.appearanceTime = d;
		
	}

}