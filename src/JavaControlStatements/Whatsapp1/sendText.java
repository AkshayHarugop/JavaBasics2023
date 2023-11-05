package JavaControlStatements.Whatsapp1;

public class sendText extends user {
	sendText(String name, long mob, String bio) {
		super(name, mob, bio);
		
	}

	public void sendTxt(String to, String msg) {
		System.out.println(name+" sent text to "+to);
		
		System.out.println(msg);
	}
	
}