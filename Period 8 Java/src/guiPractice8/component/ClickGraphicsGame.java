package guiPractice8.component;

import guiPractice8.GUIApplication;

public class ClickGraphicsGame extends GUIApplication{

	public ClickGraphicsGame(){
		super(500,500);
	}
	
	public static void main(String[] args){
		ClickGraphicsGame ccg = new ClickGraphicsGame();
		Thread app = new Thread(ccg);
		app.start();
	}
	@Override
	public void initScreen() {
		GraphicsClickScreen gcs = new GraphicsClickScreen();
		
	}

}
