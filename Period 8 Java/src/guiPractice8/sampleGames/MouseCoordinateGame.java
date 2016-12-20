package guiPractice8.sampleGames;

import guiPractice8.GUIApplication;

public class MouseCoordinateGame extends GUIApplication {

	public static MouseCoordinateGame game;
	public static MyScreen myScreen;

	public static void main(String[] args){

		game = new MouseCoordinateGame();
		Thread app = new Thread(game);
		app.start();
	}

	protected void initScreen() {
		MyScreen myScreen;
			
	}
}