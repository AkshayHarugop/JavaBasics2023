package JavaControlStatements.Whatsapp1;

public class sendImg extends sendText {

	sendImg(String name, long mob, String bio) {
		super(name, mob, bio);
		// TODO Auto-generated constructor stub
	}
	
	public void sndIMg(String to, String img) {
		System.out.println(name+"sent img to "+to);
		System.out.println(img);
	}

}
