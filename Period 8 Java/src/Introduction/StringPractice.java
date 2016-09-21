package Introduction;

public class StringPractice {

	public static void main(String[] args) {
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
		System.out.println(s);
	}

}
