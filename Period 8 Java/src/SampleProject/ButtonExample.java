package SampleProject;

import java.awt.Color;

import guiPractice8.component.Button;

public class ButtonExample extends Button {
	
	//private static final Color _BUTTON_COLOR = new Color;
	private static final int _BUTTON_WIDTH = 80;
	private static final int _BUTTON_HEIGHT = 40;

	public ButtonExample(Thing target) {
		super(target.getX(), target.getY(), w, h, text, color, action);
		// TODO Auto-generated constructor stub
			public void act(){
				target.feed();
				Project.game.setScreen(Project.otherScreen);//for changing screen when button is clicked
				//make sure the screens are static
			}
	}

}
