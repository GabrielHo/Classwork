package ChatBot8;

import java.util.Scanner;

public class GabrielMain {
	
	static String response;
	static Scanner input;
	static String user;
	static boolean inMainLoop;
	//list all the chatbots available under this class
	static ChatBot school;
	
	public static void main(String[] args) {
		//demonstrateStringMethods();
		createFields();
		//promptInput();
		promptName();
		promptForever();
	}
		
	public static void promptForever() {
		inMainLoop = true;
		while(inMainLoop){
			print("Hi, "+user+". How are you?");
			response = promptInput();
			
			if(findKeyword(response,"good",0) >= 0){
				print("That's awful. I hate you.");
			}
			else if(response.indexOf("school") >= 0){
				print("I hate school too.");
				//exit this while loop
				inMainLoop = false;
				//go to the school's talk method
				school.talk();
			}
			else{
				print("I don't understand.");
			}
			promptInput();
		}
	}
	
	public static int findKeyword(String searchString, String keyword, int startpsn){
		//delete white space
		searchString = searchString.trim();
		//make lower case
		searchString = searchString.toLowerCase();
		keyword = keyword.toLowerCase();
		//find first position of keyword
		int psn = searchString.indexOf(0);
		//keep searching until context keyword found
		while(psn >= 0){
			//assume preceded and followed by space
			String before = " ";
			String after = " ";
			//check character in front, in it exists
			if(psn > 0){
				before = searchString.substring(psn-1,  psn);
			}
			//check if there is a character after the keyword
			if(psn + keyword.length() < searchString.length()){
				after = searchString.substring(psn +keyword.length(), psn + keyword.length()+ 1);
			}
			if(before.compareTo("a") < 0 && after.compareTo("a") < 0){
				return psn;
			}
			else{
				//psn+1 is one space after out current psn, so this finds the NEXT word
				psn = searchString.indexOf(keyword,psn+1);
			}
		}
		return -1;
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
		
	public static String promptInput(){
		String userInput = input.nextLine();
		return userInput;
	}
		
		
	public static void createFields() {
		input= new Scanner(System.in);
		user = "";
		school = new GabrielSchool(); 
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

