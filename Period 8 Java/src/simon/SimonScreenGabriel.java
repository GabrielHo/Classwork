package simon;

import java.util.ArrayList;

import guiPractice8.ClickableScreen;
import guiPractice8.component.Button;
import guiPractice8.component.TextLabel;
import guiPractice8.component.Visible;
import guiPractice8.whackAMole.MoleInterface;
import guiPractice8.whackAMole.PlayerInterface;

public class SimonScreenGabriel extends ClickableScreen implements Runnable {
	
	private ArrayList<MoveInterfaceGabriel> moves;
	private TextLabel label;
	private ButtonInterfaceGabriel[] button;
	private ProgressInterfaceGabriel progress;
	
	private int roundNumber;
	private boolean acceptingInput;
	private int sequenceIndex;
	private int lastSelectedButton;
	

	public SimonScreenGabriel(int width, int height) {
		super(width, height);
		Thread app = new Thread(this);
		app.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void initAllObjects(ArrayList<Visible> visibles) {
		addButtons();
		progress = getProgress();
		label = new TextLabel(130,230,300,40,"Let's play Simon!");
		moves = new ArrayList<MoveInterfaceGabriel>();
		//add 2 moves to start
		lastSelectedButton = -1;
		moves.add(randomMove());
		moves.add(randomMove());
		roundNumber = 0;
		viewObjects.add(progress);
		viewObjects.add(label);
	}

	private MoveInterfaceGabriel randomMove() {
		// TODO Auto-generated method stub
		return null;
	}

	private ProgressInterfaceGabriel getProgress() {
		/**
		Placeholder until partner finishes implementation of ProgressInterface
		*/
		return null;
	}

	public void addButtons() {
		Button b;
		//code that randomly selects a ButtonInterfaceX
		return getMove(b); 

	}

}
