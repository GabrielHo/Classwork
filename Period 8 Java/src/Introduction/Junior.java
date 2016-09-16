package Introduction;

public class Junior extends Student {

	private String examScore;
	
	public Junior(String name,String score) {
		super(name);
		examScore = score; 
	}
	
	public void talk(){
		super.talk();
		System.out.println("... and I am a junior!");
	}
	
	public void boast(){
		System.out.println("I have a "+examScore+" GPA!");
	}
}
