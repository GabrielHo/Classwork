package arrays;

public class ArraysPractice {
	
	static boolean[] boos3;

	public static void main(String[] args){
		//how do you time a process?
		long currentTime = System.currentTimeMillis();
		
		int[] fiftyNumbers = new int[50];
		populate(fiftyNumbers);
		print(fiftyNumbers);
		randomize(fiftyNumbers, 50);
		print(fiftyNumbers);
		rollDice(fiftyNumbers, 3);
		//count each die roll and provide a percentage.
		countResult(fiftyNumbers, 3);
		
		long endTime = System.currentTimeMillis();
		System.out.println("The process took "+(endTime-currentTime)+" ms.");
	}
	
	private static void populate(int[] s){
		for(int i =0; i <s.length; i++){
			s[i] = i+1;
		}
	}
	
	private static void print(int[] s){
		for(int i =0; i < s.length; i++){
			System.out.println(s[i]);
		}
	}
	
	private static void randomize(int[] s, int max){
		for(int i =0; i <s.length; i++){
			int random = (int)(1 + Math.random()*max);
			s[i] = random;
		}
	}
	
	private static void rollDice(int[] s, int numberOfDice){
		for(int i =0; i< s.length; i++){
			int dice = 0;
			for(int j = 0; j <numberOfDice; j++){
				dice = dice + (int)(1+ 6*Math.random());
			}
			s[i] = dice;
		}
	}
	
	private static void countResult(int[] intArray, int numberOfDice){
		int[] counter = new int[numberOfDice*6];
		for(int n : intArray){
			counter[n-1] = counter[n-1] +1;
		}
		for(int i =numberOfDice-1; i<counter.length; i++){
			System.out.println((i+1) + " was rolled " 
					+ 100*counter[i]/intArray.length+ " percent of the time.");
		}
	}
	
	
	
	private void demonstratePassByValue(){
		int x = 10;
		x = increase(x);
		System.out.println(x);
		
		
		String[] someStrings = new String[1000];
		standardPopulate(someStrings);
		String s = someStrings[999];
		makeSpecial(s);
		someStrings[999] = getASpecialString();
		print(someStrings);
	}
	
	private static String getASpecialString() {
		String s = "THIS STRING IS SPECIAL!";
		return s;
	}

	private static int increase(int i){
		return i++;
	}
	
	private static void makeSpecial(String s) {
		s = "THIS STRING IS SPECIAL!";
	}

	private static void print(String[] s) {
		for(int i =0; i < s.length; i++){
			System.out.println(s[i]);
		}
	}

	private static void standardPopulate(String[] s) {
		for(int i =0; i < s.length; i++){
			s[i] = "String #"+(i+1);
		}
	}
	
	public static void initializingArrayExample() {
		/** Arrays: fixed length, indices start at zero, indexed(ordered), common data type, 
		  	       arrays of any type must be Object[]
		  -If you want to put different primitive types into an array, you must use their wrapper class(classes 
		   that represent the primitive types?). 
		   -Primitive types are already in the system and start as zero. Cannot mix types.
		   -Object arrays, unless initialized, start as null and can have different types of objects of common super class.
		 */
		//two different ways to instatiate an array
		boolean[] boos1 = new boolean[3];
		//this can ONLY be done at the declaration because it sets size AND content
		boolean[] boos2 = {false, false, false};
		//this does not work:
		//boos3 = {false, false, false};
		//this is all that will work:
		boos3 = new boolean[3];
		
		/**2 ways of iterating through an array:
		   STANDARD FOR LOOP
		   	-the index is important to keep track of
		   	-you need to customize the order
		*/
		
		for(int i = 0; i < boos1.length; i++){
			System.out.println(boos1[i]);
		}
		
		/** FOR EACH LOOP
		 		- the index is not important
		 		- don't need to customize
		 		- automatically assigns a "handle"(an identifier)
		 		- faster 
		*/
		
		for(boolean b : boos1){
			System.out.println(b);
		}
		
		//OBJECT ARRAYS
		String[] someStrings2 = {"a", "b", "c"};
		String[] someStrings1 = new String[3];
		//you can do this to instantiate the elements
		someStrings1[0] = "a";
		someStrings1[1] = "b";
		someStrings1[2] = "c";
		//but is repetitive 
		
		//try a loop to instantiate:
		for(int i =0; i <someStrings1.length; i++){
			someStrings1[i] = "a new String";
		}
		//a loop to print it:
		for(String s: someStrings1){
			System.out.println(s);
		}
	}
}
