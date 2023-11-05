package ClassCastExceptionAndInstanceOf;
import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Cafe c = new Cafe();
		Scanner scan =  new Scanner(System.in);
		System.out.println("Welcome to Coffee shop :) \n1 : for Coffee\n2 : for Tea");
		System.out.print("Enter the choice : ");
		int choice = scan.nextInt();
		Bevarage obj = c.VendingMachine(choice);
		if(obj instanceof Coffee) {
			System.out.println("Coffee is ready !!");
		}
		else if(obj instanceof Tea) {
			System.out.println("Tea is ready !!");
		}
		else {
			System.out.println("Invalid choice");
		}
		
		scan.close();

	}

}
