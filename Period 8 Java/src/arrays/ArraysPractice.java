package arrays;

public class ArraysPractice {
	
	static boolean[] boos3;

	public static void main(String[] args){
		//how do you time a process?
		long currentTime = System.currentTimeMillis();
		
		int x = 10;
		
		
		
		String[] someStrings = new String[1000];
		standardPopulate(someStrings);
		String s = someStrings[999];
		makeSpecial(s);
		print(someStrings);
		
		long endTime = System.currentTimeMillis();
		System.out.println("The process took "+(endTime-currentTime)+" ms.");
	}
	
	private static void increase(int i){
		i++;
		//same as i = i+1;
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
