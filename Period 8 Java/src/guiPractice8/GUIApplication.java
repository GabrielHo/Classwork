package guiPractice8;

import java.awt.Graphics;
import javax.swing.JFrame;

public abstract class GUIApplication extends JFrame{

	private Screen currentScreen;
	
	//main method for practice only
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new GUIApplication();
	//}

	public GUIApplication(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(false);
		int x = 40;
		int y = 40;
		int width = 600;
		int height = 400;
		setBounds(x,y,width,height);
		initScreen();
		setVisible(true);
		
	}

	//method for creating and setting the starting screen
	protected abstract void initScreen();
	
	public void setScreen(Screen screen){
		currentScreen = screen;
	}
	
	public void paint(Graphics g){
		g.drawImage(currentScreen.getImage(), 0, 0, null);
	}
}
