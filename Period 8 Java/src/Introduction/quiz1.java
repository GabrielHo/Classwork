package Introduction;

import java.util.Scanner;

public class quiz1 {

static Scanner input = new Scanner(System.in);

	public static String waitForEntry(){
		return input.nextLine();
	}
	// 1 point visibility private
	//1 point data type declaration
	private static String username = "test_user";
	private static String password = "test";
	
	//1 point correct method
	public static void main(String[] args){
		//1 point for asking username once
		if(correctUser()){
			askPassword();
		}
		else{
			System.out.println("Unkown username, please contact the network administrator.");
		}
	}

	private static void askPassword() {
		boolean inLoop = true;
		int triesRemaining = 3;
		while(inLoop){
			System.out.println("Enter your password.");
			//1 point use waitForEntry() correctly
			String entry = waitForEntry();
			if(entry.equals(password)){
				System.out.println("You're in!");
				inLoop = false;
			}
			else{
				//.5 triesRemaining is changing
				triesRemaining --;
				if(triesRemaining == 0){
					//.5 point printing invalid password
					System.out.println("Invalid password.");
					//.5 point MAX 3 tries
					inLoop = false;
				}
				else{
					//.5 point for correct number of tries left
					System.out.println("You have " +triesRemaining +" attempt(s) left.");
				}
			}
		}
	}

	private static boolean correctUser() {
		System.out.println("Enter a username.");
		//1 point, comparing strings
		return waitForEntry().equals(username);
		// the alternative itself is already a boolean so it would return true or false;
	}
	
}
	
		
