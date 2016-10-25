package arrays;

public class AdvancedArrayMethods {
	
	static int[] array;
	
	public static void main(String[] args){
		array = new int[100];
		int[] someArray = new int[50];
		methodA(someArray);
	}
	
	private static void swap(Object[] arr, int a, int b){
		//make a placeholder and put the information in the placeholder
		Object placeholder = arr[b];
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
	
	private static void shuffle(Object[] array){
		for(int i =0; i < array.length; i++){
			int random = (int)(Math.random()*6);
			swap(array, i, random);
			
		}
	}
	
	public static int longestConsecutiveSequence(int[] array1){
        /**This method counts the longest consequtive sequence in an array.
         * It does not matter where the sequence begins
         * If there are no consecutive numbers, the method should return '1'
         * 
         * Examples:
         * longestSequence({1,2,3,4,5,8,9}) returns '5', since the sequence '1,2,3,4,5' is 5 integers long 
         * longestSequence({0,9,10,11,4,3,8,9}) returns '3', since '9,10,11' is 3 integers long
         * longestSequence({0,9,8,11,4,3,7,9}) returns '1', since there are no consecutive integers
         * */
        int seqNumber = 0;
        for(int i = 1; i < array1.length; i++){
            if(array1[i-1] == array1[i]){
                seqNumber++;
            }
            
        }
        return seqNumber;
    }
	
	public static int longestSharedSequence(int[] array1, int[] array2){
		int max = 0;
	    int count = 0;
	    for(int seqStart = 0; seqStart < array1.length; seqStart++){
	    	int seqEnd = seqStart;
	        int[] seq = getSequence(seqStart, seqEnd, array1);
	        if(checkSequence(seq, array2)){
	        	count ++;
	        	if(count > max){
	        		max = count;
	        	}
	        }
	        //reset the count after every seq has been checked
	        count = 0;
	    }
	    
	    return max;
	    
	}
	
	//returns true if seq is found inside array2
	private static boolean checkSequence(int[] seq, int[] array2) {
		//i checks every value in array 2
		A: for(int i= 0; i <array2.length; i++){
			//j checks every element in seq
		 B:	for(int j = 0; j <seq.length; j++){
				if(j+1 < array2.length && seq[j] != array2[j+1]){
					//breaks out of innermost for loop unless particular for loop is specified (labels "A:")
					break;
				}
				else if(j == seq.length-1){
					return true;
				}
			}
			
		}
		return false;
	}

	//returns a sub-array containing the elements in array1 from seqStart to seqEnd
	private static int[] getSequence(int seqStart, int seqEnd, int[] array1) {
		
		return null;
	}
}
