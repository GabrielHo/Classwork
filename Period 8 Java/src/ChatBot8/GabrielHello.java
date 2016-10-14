package ChatBot8;

public class GabrielHello implements ChatBot {
	
	private String helloResponse;
	private boolean inHelloLoop;
	private String[] calmResponses = {"We already said hello." +" Let's move the conversation along.", 
									"You said hello already, Did you forget?"};
	private String[] angryResponses= {"Stop saying hello, seriously.", "YOU'RE TRIGGERING ME."};
	private int helloCount;
	
	//public because it's a constructor for another class.
	public GabrielHello(){
		helloCount = 0;
	}

	public void talk() {
		inHelloLoop = true;
		while(inHelloLoop){
			helloCount ++;
			printResponse(); //this is the helper method 
			helloResponse = GabrielMain.promptInput();
			//when negating, use !
			if(!isTriggered(helloResponse)){
				inHelloLoop = false;
				GabrielMain.promptForever();
			}
		}
	}
	
	private void printResponse(){
		if(helloCount > 4){
			int responseSelection = (int)(Math.random()*angryResponses.length);
			GabrielMain.print(angryResponses[responseSelection]);
		}
		else{
			int responseSelection = (int)(Math.random()*calmResponses.length);
			GabrielMain.print(calmResponses[responseSelection]);
		}
	}

	public boolean isTriggered(String userInput) {
		if(GabrielMain.findKeyword(userInput, "hello", 0) >= 0){
			return true;
		}
		if(GabrielMain.findKeyword(userInput, "hey", 0) >= 0){
			return true;
		}
		if(GabrielMain.findKeyword(userInput, "hi", 0) >= 0){
			return true;
		}
		return false;
	}

}
