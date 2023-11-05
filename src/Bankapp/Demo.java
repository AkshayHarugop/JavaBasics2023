package Bankapp;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("Enter the choice : ");
			int choice = scan.nextInt();
			switch(choice) {
			case 1: 
				System.out.println("Hai Dinga");
				break;
			case 2: 
				System.out.println("Bye Dinga");
				break;
			case 3: 
				System.out.println("Thank you");
				scan.close();
				System.exit(0);
			default :
				System.out.println("Invalid Choice");			
			}
		}
	}
}
