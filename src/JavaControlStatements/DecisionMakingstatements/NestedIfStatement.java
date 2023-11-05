package JavaControlStatements.DecisionMakingstatements;

import java.util.Scanner;

public class NestedIfStatement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Value of x = ");
		int x = s.nextInt();
		System.out.print("Enter the Value of y = ");
		int y = s.nextInt();
		System.out.println("Check Summation of 2 number is gratter than 20 ?");
		System.out.println("Check x and y are Even or Odd numbers : ");
		if (x + y > 20) {
			System.out.println("x+y is grater than 20");
			if(x%2==0) {
				System.out.println("x is even number ");
			}
			else {
				System.out.println("x is odd number ");
			}
			if(y%2==0) {
				System.out.println("y is even number ");
			}
			else {
				System.out.println("y is odd number ");
			}
		}
		else {
			System.out.println("x+y is lesser than 20");
			if(x%2==0) {
				System.out.println("x is even number ");
			}
			else {
				System.out.println("x is odd number ");
			}
			if(y%2==0) {
				System.out.println("y is even number ");
			}
			else {
				System.out.println("y is odd number ");
			}
		}
		System.out.println("======================");
	}

}
