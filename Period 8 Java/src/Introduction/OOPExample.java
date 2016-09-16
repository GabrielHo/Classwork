package Introduction;

public class OOPExample {

	public static void main(String[] args) {
		//new Senior works because of the "is a" connection
		//A senior is a student but not vice versa
		Student jillian = new Senior("Jillian");
		Student jordan = new Junior("Jordan","100");
		Student joseph = new Freshmen("Joseph");
		
		jillian.talk();
		jordan.talk();
		((Junior)jordan).boast();
		joseph.talk();
	}
}
