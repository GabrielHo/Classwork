package guiPractice8.whackAMole;

import guiPractice8.GUIApplication;

public class WackAMoleGame extends GUIApplication {

	public WackAMoleGame() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initScreen() {
		WackAMoleScreen wams = new WackAMoleScreen(getWidth(), getHeight());
		setScreen(wams);

	}

	public static void main(String[] args) {
		WackAMoleGame game = new WackAMoleGame();
		Thread app = new Thread(game);
		app.start();
	}

}
