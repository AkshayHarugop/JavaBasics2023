package JavaControlStatements.DecisionMakingstatements;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("Enter the choice : ");
			int choice = s.nextInt();
			switch(choice) {
			case 1: System.out.println("inside the case 1");
					break;
					
			case 2: System.out.println("inside the case 2");
					break;
					
			case 3: System.out.println("inside the case 3");
					break;
					
			default : System.out.println("inside the default case");
					System.exit(0);
					break;
			}
		}
	}

}
