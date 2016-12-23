package guiPractice8.whackAMole;

import java.util.ArrayList;

import guiPractice8.ClickableScreen;
import guiPractice8.component.Action;
import guiPractice8.component.TextLabel;
import guiPractice8.component.Visible;

public class WackAMoleScreen extends ClickableScreen implements Runnable{

	private ArrayList<MoleInterface> moles;
	private PlayerInterface player;
	private TextLabel label;
	private TextLabel timeLabel;
	private double timeLeft;
	 
	public WackAMoleScreen(int width, int height) {
		super(width, height);
		timeLeft =30.0;
		Thread play = new Thread(this);
		play.start();
	}

	private void initTimeLeft(int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub
		player = getAPlayer();
		moles = new ArrayList<MoleInterface>();
		label = new TextLabel(getWidth()/2-60,50,120,60,"Ready...");
		timeLabel  = new TextLabel(getWidth()/2-60,50,120,60,"");
		viewObjects.add(label);
		//viewObjects.add(player);
		viewObjects.add(timeLabel);
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

	public void update(){
		super.update();
	}
	
	
	@Override
	public void run() {
		changeText("Set...");
		changeText("Go!");
		changeText("");
		timeLabel.setText(""+timeLeft);
		while(timeLeft > 0){
			//frame updates every 100ms
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			timeLeft -= .1;
			timeLabel.setText("" +(int)(timeLeft*10)/10.0);
			disappearMoles();
			addNewMoles();
		}
	}

	private void addNewMoles() {
		//probability of mole appearing depends on time left
		double probability = .2*(30.0-timeLeft)/30;
		if(Math.random() < probability){
			final MoleInterface mole = getAMole();
			//between .5 and 2.5 seconds
			mole.setAppearanceTime((int)(500 + Math.random() *2000));
			mole.setAction(new Action(){
				public void act(){
					player.increaseScore(1);
					//removeMole from viewObjects
					remove(mole);
					//remove mole from database
					moles.remove(mole);
				}
			});
			//add moles to visible
			addObject(mole);
			//add mole to mole list
			moles.add(mole);
			}
		
	}

	private void disappearMoles() {
		for(int i = 0; i < moles.size(); i++){
			MoleInterface m = moles.get(i);
			m.setAppearanceTime(m.getAppearanceTime() - 100);
			if(m.getAppearanceTime() <=0){
				//remove from viewObjects
				remove(m);
				//remove it from our mole database
				moles.remove(i);
				i--;//compensate for i++;
			}
		}
	}

	private void changeText(String s){
		try{
			Thread.sleep(1000);
			label.setText(s);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}


}
