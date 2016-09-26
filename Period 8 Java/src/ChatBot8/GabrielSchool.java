package ChatBot8;

public class GabrielSchool implements ChatBot {
	
	private boolean inSchoolLoop;
	private String schoolResponse;
	
	public void talk() {
		inSchoolLoop = true;
		//static call on promptInput method from GabrielMain class
		while(inSchoolLoop){
			GabrielMain.print("(Type 'quit' to go back)");
			schoolResponse = GabrielMain.promptInput();
			if(schoolResponse.indexOf("quit") >= 0){
				inSchoolLoop = false;
				GabrielMain.promptForever();
			}
			GabrielMain.print("That's my least favorite part of school");
		}
	}

}
