package TestReviews;

import java.util.Arrays;

public class Testing {

	public static void main(String[] args) {
		String[] t = {"hello", "blah",  "boom", "elephant"};
		twoCharsTo2D(t);

	}

	public static String[] twoCharsTo2D(String[] words){
        for(int i =0; i<words.length;i++){
            words[i] = words[i].substring(0,2);
        }
        System.out.print(Arrays.toString(words));
        return words;
    }
}
