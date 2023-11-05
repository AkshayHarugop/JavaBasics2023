package JavaControlStatements.DecisionMakingstatements;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Value of x = ");
		int x = s.nextInt();
		System.out.print("Enter the Value of y = ");
		int y = s.nextInt();
		System.out.println("Check Summation of 2 number is gratter than 20 ?");
		if (x + y > 20) {
			System.out.println("x+y is grater than 20");
		}
		else {
			System.out.println("x+y is lesser than 20");
		}
		System.out.println("======================");
		System.out.println("Check x and y are Even or Odd numbers : ");
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
		
		System.out.println("======================");
		System.out.println("Check the year is leap year or not : ");
		System.out.print("Enter the year = ");
		int year = s.nextInt();
		if(((year%4==0)&&(year%100==0))||(year%400==0)) {
			System.out.println("The provided year is leap year!");
		}else {
			System.out.println("The provided year is not a leap year! its a common year :)");
		}
		
	}

}
