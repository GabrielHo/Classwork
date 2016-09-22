package Introduction;

import java.util.Scanner;

public class StringPractice {
	public static void main(String[] args) {
		//demonstrateStringMethods();
		createFields();
		//promptInput();
		promptName();
		promptForever();
	}
	
	public static void promptForever() {
		while(true){
			promptInput();
		}
	}
	
	public static void promptName() {
		print("Please enter your name");
		user = input.nextLine();
		print("Glad to meet you, "+user+"."  
				+ "For the rest of time, "
				+ "I will call you, "+user+"."
				+ "\nYou may call me Computer. "
				+ "\nWe should become friends.");
	}
	
	public static void promptInput(){
		print("Please type something.");
		String userInput= input.nextLine();
		print("Congratulations! You typed:" +userInput+ ".");
	}
	
	static Scanner input; 
	static String user;
	
	public static void createFields() {
		input= new Scanner(System.in);
		user = "";
	}
	
	public static void demonstrateStringMethods(){
		String text1 = new String("Hello world!");
		String text2 = "Hello world!";
		
		if(text1.equals(text2)){
			print("These strings are equal.");
		}
		print(text1);
		print(text2);
		
		String word1 = "Abracadabra";
		String word2 = "Cadabra";
		//when the strings are the same, they equal zero
		//http://apcentral.collegeboard.com/apc/public/repository/ap_comp_sci_a_quick_reference.pdf
		if(word1.compareTo(word2) < 0){
			print("word1 comes before word2");
		}
	}
		
	public static void print(String s){
		String printString = s;
		int cutoff = 45;
		if(printString.length() > cutoff){
			for(int i = 0; i*cutoff < s.length(); i++){
				printString += getCut(s,cutoff,i+1)+"\n";
			}	
		}	
		System.out.println(printString);
	}

	private static String getCut(String s, int cutoff, int cut){
		int cutIndex = cut * cutoff;
		if(cutIndex > s.length())cutIndex = s.length();
		String currentCut = s.substring(0, cutIndex);
		//start at last index and go backwards through the string
		int indexOfLastSpace = currentCut.length()-1;
		for(int i = currentCut.length()-1; i>=0; i--){
			String letter = currentCut.substring(i, i+1);
			if(letter.equals(" ")){
				indexOfLastSpace = i;
				break;
			}
		}
		//shorten the cut to end on a space
		currentCut=currentCut.substring(0, indexOfLastSpace);
		return currentCut; 
	}
}
