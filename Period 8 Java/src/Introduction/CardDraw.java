package Introduction;

public class CardDraw {

	public static void main(String[] args) {
		String[] values = {"King","Queen","Jack","Ten"};
		String[] suits = {"Spades","Hearts","Clubs","Diamonds"};
		int value = (int) (Math.random()*values.length); 
		int suit = (int) (Math.random()*suits.length);
		System.out.println(values[value]+" of "+suits[suit]);
	}

}
