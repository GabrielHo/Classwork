package guiPractice8.sampleGames;

import guiPractice8.GUIApplication;

public class MouseCoordinateGame extends GUIApplication {

	public static MouseCoordinateGame game;

	public static void main(String[] args){

		game = new MouseCoordinateGame();
		Thread app = new Thread(game);
		app.start();
	}

	protected void initScreen() {
			// TODO Auto-generated method stub
			
	}
}