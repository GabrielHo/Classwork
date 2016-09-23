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
		String printString = "";
		int cutoff = 35;
		//check for words to add
		//IOW s has a length > 0 
		while(s.length() > 0){
			String cut="";
			String nextWord = "";
			//check to see if the next word will fit on the line
			//there must still be words to add
			while(cut.length() + nextWord.length() < cutoff && s.length() > 0){
				//add the next word to the line
				cut += nextWord;
				
				s = s.substring(nextWord.length());
				
				//identify the following word without the space
				int endOfWord = s.indexOf(" ");
				/*if there are no more spaces, this is the last word,so
				 add the whole thing */
				if(endOfWord == -1){
					endOfWord = s.length() - 1; //-1 for index
				}
				
				nextWord = s.substring(0, endOfWord+1);
			}
			printString += cut+"\n";
		}
		System.out.println(printString);
	}
}

