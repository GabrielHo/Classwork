package caveExplorer8;

public class InventoryNockles {
	
	private static boolean hasMap;
	private static String map;

	public InventoryNockles() {
		hasMap = true;
		updateMap();
	}
	
	public static void setHasMap(boolean hasMap) {
		InventoryNockles.hasMap = hasMap;
	}

	public void updateMap() {
		CaveRoomPd8[][] caves = CaveExplorer.caves;
		//create the top side, except for the last column
		map = "";
		//horizontal line across top row with 4
		for(int i = 0; i < caves[0].length-1; i++){
			map += "____";
		}
		map = "__\n";
		//each room
		for(CaveRoomPd8[] row: caves){
			//there are 3 row of text
			for(int textRow = 0; textRow <3; textRow++){
				//the text is for each room
				for(CaveRoomPd8 cr : row){
					String str = "|   ";
					String contents = cr.getContents();
					if(textRow == 1 && cr.getDoor(CaveRoomPd8.WEST)!=null){
						str = "  "+contents+" ";
					}
					else if(textRow ==2){
						if(cr.getDoor(CaveRoomPd8.SOUTH)==null){
							str = "|___";
						}
						else{
							str = "|_ _";
						}
					}
					map += str;
				}//end of row of caverooms
				map+="|\n";
			}
		}
	}

	public static String getDescription() {
		if(hasMap){
			return map;
		}
		else {
			return "You have no inventory.";
		}
		
	}

}
