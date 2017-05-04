package TestReviews;

import java.sql.Array;

public class KatQuestion {
	
	
	
	public static void main (String[] args){
		String[] word = new String[]{"B","A","G","E","L"};
		doSomething(word);
	}
	

	public static void doSomething(String[] arr){
		int h = arr.length-1;
		for(int i = 0; i < arr.length; i++){
			String placeholder = arr[i];
			arr[i] = arr[h];
			arr[h] = placeholder;
			h--;
		}
		for(String s: arr){
			System.out.print(s);
		}
	}


}
