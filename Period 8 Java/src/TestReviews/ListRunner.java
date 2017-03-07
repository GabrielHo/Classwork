package TestReviews;

import java.util.ArrayList;

public class ListRunner {

	static ArrayList<Item> shoppinglist;
	
	public static void main(String[] args){
		String[] justDescriptions = getDescriptions();
		initList(justDescriptions);
		doSomeShopping();
		printPurchasedItems();
	}

	private static String[] getDescriptions() {
		String[] test = {"coffee", "videogames", "potato chips", "a life"};
		return null;
	}

	private static void doSomeShopping() {
		shoppinglist.get(0).setPurchased(true);
		shoppinglist.get(3).setPurchased(true);
		
	}
	
	//STUDY THIS
	private static void initList(String[] justDescriptions) {
		shoppinglist = new ArrayList<Item>();//1 point
		for(String s: justDescriptions){//.5 point
			Item temp = new Item(s);//1 point
			shoppinglist.add(temp);	//.5 point
		}
		
	}

	//STUDY THIS
	private static void printPurchasedItems() {
		for(int i = 0; i < shoppinglist.size(); i++){
			if(shoppinglist.get(i).isPurchased()){
				System.out.println(shoppinglist.get(i).getDescription());
				shoppinglist.remove(i);
				i--;
			}
		}
		
	}
}
