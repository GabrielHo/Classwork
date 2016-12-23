package guiPractice8.whackAMole;

import java.util.ArrayList;

import guiPractice8.component.TextLabel;
import guiPractice8.component.Visible;
import guiPractice8.sampleGames.ClickableScreen;

public class WackAMoleScreen extends ClickableScreen {

	private ArrayList<MoleInterface> moles;
	private PlayerInterface player;
	private TextLabel label;
	private TextLabel timeLabel;
	private double timeLeft;
	 
	public WackAMoleScreen(int width, int height) {
		super(width, height);
		initTimeLeft(60);
	}

	private void initTimeLeft(int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initAllObjects(ArrayList<Visible> visibles) {
		// TODO Auto-generated method stub
		player = new getAPlayer();
		moles = new ArrayList();
	}
	
	/**
	*to implement later, after Character Team implements PlayerInterface
	*/
	private PlayerInterface getAPlayer() {
	 return null;
	}

	/**
	*to implement later, after EnemyTeam implements MoleInterface
	*/
	private MoleInterface getAMole() {
	return null;
	}

}
