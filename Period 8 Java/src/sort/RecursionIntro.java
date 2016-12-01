package sort;

public class RecursionIntro {

	public static void main(String[] args) {
		int n = 100;
		System.out.println("The "+n+"th Fibonacci is "+ fibonacci(n));
		/**
		System.out.println("Using a for loop");
		for(int i = 0; i < 5; i++){
			System.out.println("hello World"+" x"+i);
		}
		System.out.println("Without using a for loop");
		forLoop(5, new Action() {
			
			private int value = 0;
			public void act() {
				System.out.println("Hello world"+" x"+value);
				value++;
			}
		});
		**/
		hanoiSolution(3,"A","B","C");
		
	}
	
	private static int fibonacci(int n) {
		if(n <=1){
			return 1;
		}
		else{
			int previous = fibonacci(n-1);
			print("Before we find fibonacci "+n+" we need to find fibonacci "+(n-1)+
					", which is "+previous);
			int beforePrevious = fibonacci(n-2);
			return previous+beforePrevious;
		}
	}

	private static int count =1;
	public static void print(String s){
		System.out.println("Move #"+count+":"+s);
		count++;
	}
	
	private static int factorial(int x){
		//for loop method
		int factorial = 1;
		for(int i=0; i<x; i++){
			factorial = factorial * i;
		}
		System.out.println(factorial);
		return factorial;
		
		//recursive method
		/**
		if(x >1){
			return x *factorial(x-1);
		}
		return 1;
		**/
		
	}
	
	public static void hanoiSolution(int numberOfDiscs, String startPeg, String midPeg, String endPeg){
		if(numberOfDiscs <= 3){
			print("Move " +startPeg+" to "+endPeg);
		}
		else{
			System.out.println("In order to move "+numberOfDiscs +" over to peg "+endPeg+" we must move "+(numberOfDiscs-1)+
					" over to peg "+midPeg);
			hanoiSolution(numberOfDiscs-1, startPeg, endPeg, midPeg);
			hanoiSolution(1, startPeg, midPeg, endPeg);
			hanoiSolution(numberOfDiscs-1, midPeg, startPeg, endPeg);
		}
	}
	
	private static void forLoop(int i, Action action) {
		if(i <=0){
			//base case
			return;
		}
		else{
			//standard action
			action.act();
			//recursive call
			forLoop(i-1, action);
		}
		
	}
/**
 * When is recursion useful?
 * 	Whenever a problem is based off a "trivial case".
 * How will it be tested?
 * 	Multiple choice only: reading recursive methods.
 */
}
