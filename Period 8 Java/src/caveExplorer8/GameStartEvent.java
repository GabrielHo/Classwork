package caveExplorer8;

public class GameStartEvent implements Playable {

	private static final String[] SEQUENCE_1 = {"<A little yellow mouse with brown stripes and a lightning shaped tail runs up top to you.>",
												"Hi, I can see that you are not from around here.", "Do you like puzzles?"};
	
	private static final String[] SEQUENCE_2 = {"You are going to have so much fun playing my 2-D games.", "Take this map."};
	
												
	public GameStartEvent() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		readSequence(SEQUENCE_1);
		while(CaveExplorer.in.nextLine().toLowerCase().indexOf("yes") < 0){
			CaveExplorer.print("C'mon! You know you like puzzles. Say yes!");
		}
		readSequence(SEQUENCE_2);
		CaveExplorer.inventory.setHasMap(true);
	}
	
	public static void readSequence(String[] seq){
		for(String s : seq){
			CaveExplorer.print(s);
			CaveExplorer.print("- - - press enter - - - ");
			CaveExplorer.in.nextLine();
		}
	}
}
