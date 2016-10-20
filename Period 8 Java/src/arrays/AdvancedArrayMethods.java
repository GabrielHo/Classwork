package arrays;

public class AdvancedArrayMethods {
	
	static int[] array;
	
	public static void main(String[] args){
		array = new int[100];
		int[] someArray = new int[50];
		methodA(someArray);
	}
	
	private static void swap(String[] arr, int a, int b){
		//make a placeholder and put the information in the placeholder
		String placeholder = arr[b];
		arr[b] = arr[a];
		arr[a] = placeholder;
	}
	
	private static void methodA(int[] someArray) {
		int[] newArray = new int[someArray.length];
	}
	
	private static void copyArray(int[] original, int[] target){
		if(original.length == target.length){
			for(int i =0; i < original.length; i++){
				target[i] = original[i];
			}
		}
		else{
			//print an "error" message
			System.out.println("ERROR: tried to copy arrays of two different lengths."); 
		}
	}
}
