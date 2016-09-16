package Introduction;

public class Freshmen extends Student {

	public Freshmen(String name) {
		super(name);
	}
	
	public void talk(){
		super.talk();
		System.out.println("... and I am a freshmen!");
	}

}
