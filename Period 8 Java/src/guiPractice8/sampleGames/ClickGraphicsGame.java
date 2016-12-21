package guiPractice8.sampleGames;

import guiPractice8.GUIApplication;
import guiPractice8.sampleGames.*;

public class ClickGraphicsGame extends GUIApplication{

	public static ClickGraphicScreen clickScreen;
	public static ClickGraphicsGame game;
	
	public static void main(String[] args){
		game = new ClickGraphicsGame();
		Thread app = new Thread(game);
		app.start();
	}
	@Override
	public void initScreen() {
		clickScreen = new ClickGraphicScreen(getWidth(), getHeight());
		setScreen(clickScreen);
		
	}

}
