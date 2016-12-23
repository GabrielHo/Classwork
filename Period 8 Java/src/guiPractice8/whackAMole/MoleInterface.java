package guiPractice8.whackAMole;

import guiPractice8.component.Action;
import guiPractice8.component.Clickable;

public interface MoleInterface extends Clickable {

	int getAppearanceTime();

	void setAppearanceTime(int i);

	void setAction(Action action);
	
	
}
