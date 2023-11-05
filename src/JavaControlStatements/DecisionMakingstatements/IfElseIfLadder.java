package JavaControlStatements.DecisionMakingstatements;

import java.util.Scanner;

public class IfElseIfLadder {

	public static void main(String[] args) {
		System.out.println("check the state name based on city name : ");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the city name : ");
		String city=s.next();
		if(city=="Bangalore") {System.out.println("Karnataka state :)");}
		else if(city =="Mumbai") {System.out.println("Maharastra state :)");}
		else if(city =="Chanai") {System.out.println("Hydrabad state :)");}
		else {System.out.println("Invalid state try again ");}
	}

}
