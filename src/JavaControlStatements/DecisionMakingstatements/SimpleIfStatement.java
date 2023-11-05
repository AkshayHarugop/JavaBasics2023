package JavaControlStatements.DecisionMakingstatements;

import java.util.Scanner;

public class SimpleIfStatement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Value of x = ");
		int x = s.nextInt();
		System.out.print("Enter the Value of y = ");
		int y = s.nextInt();
		if (x + y > 20) {
			System.out.println("x+y is grater than 20");
		}
	}
}
