package Introduction;

public class Senior extends Student {
//this means that Student is the superclass of Senior
//Senior is a student but a student isn't a senior 
	
	public Senior(String name) {
		super(name); //constructs a Student firsts
	}
	
	public void talk(){
		super.talk();
		System.out.println("... and I am a senior!");
	}

}
