package guiPractice8.component;

import java.awt.image.BufferedImage;

public class Graphic implements Visible {
	
	private int x;
	private int y;
	private BufferedImage image;
	private boolean loadedImages;

	public Graphic(int x, int y, String imageLocation){
		this.x = x;
		this.y = y;
		loadedImages - false;
	}
	
	@Override
	public BufferedImage getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isAnimated() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
