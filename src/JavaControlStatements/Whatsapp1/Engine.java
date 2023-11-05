package JavaControlStatements.Whatsapp1;

import java.util.Scanner;

public class Engine {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Whelcome to whatsapp!!");
		System.out.println("Enter the command text and img");
		char c = sc.next().toLowerCase().charAt(0);
		sendImg u1 = new sendImg("Shariq", 8217879614L, "<Coding world!>");
		switch(c) {
		case 'i' : u1.sndIMg("Budda", "C:\\Users\\aha5\\Pictures\\Screenshots\\Screenshot.png");
					break;
					
		case 't' : char r; 
					do{
						u1.sendTxt("Ismail", "Hello Mav!! where are you !!");
						System.out.print("Response : ");
						r = sc.next().toLowerCase().charAt(0);
//						Thread.sleep(5000);
					}while(r!='y');
					break;
					
		default : System.out.println("Invalid choice !!");

		}
		sc.close();
		
	}

}
