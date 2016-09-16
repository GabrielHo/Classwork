package Introduction;

public class Student {

	//fields
	private String name;
	
	//constructor (initialize fields)
	//the name in the public student is only a local variable
	public Student(String name){
		this.name = name; 
	}
	
	public void talk(){
		System.out.println("Hello, my name is "+name);
	}
}
