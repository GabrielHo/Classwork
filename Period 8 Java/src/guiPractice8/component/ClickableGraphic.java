package guiPractice8.component;

public class ClickableGraphic extends Graphic implements Clickable {

private Action action;

	public ClickableGraphic(int x, int y, double scale, String imageLocation) {
		super(x, y, scale, imageLocation);
		// TODO Auto-generated constructor stub
	}
	
	public ClickableGraphic(int x, int y, String imageLocation){
		super(x,y,imageLocation);
	}

	@Override
	public boolean isHovered(int x, int y) {
		return x > getX() && x <getX() + getHeight() && y > getY() && y < getY() +getWidth();
	}
	
	public void setAction(Action a){
		this.action = a;
	}

	@Override
	public void act() {
		if(action != null){
			action.act();
		}
		
	}

}
