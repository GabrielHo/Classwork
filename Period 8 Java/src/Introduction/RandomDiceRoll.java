package Introduction;

public class RandomDiceRoll {

	public static void main(String[] args) {
		//declare variable, logic test, and increment
		int[] results = new int[6];
		for(int index = 0; index < 1000; index ++){
			int result = rollFairDie();
			System.out.println("Roll #"+(index+1)+
					": "+result);
			results[result-1] ++;
		}
		//print the results
		for(int i = 0; i < 6; i++){
			System.out.println((i+1)+" appeared " + results[i]+" times.");
		}
	}
	
	public static int rollFairDie(){
	//returns 1,2,3,4,5,6 with equal probability
		double rand = Math.random(); //returns a double between 0 and 1 exclusive 
		int roll = (int) (6*rand); //[0,5]
		roll++;//[1,6]
		return roll;
	}
}
	