package TestPackage;

import java.util.Scanner;

public class PositiveOrNegativeNumber {
	
	String CheckTheGivenNumberIsPositiveOrNegative(int n){
		if(n>0) {
			return "Given Number is Positive";
		}
		else if(n<0) {
			return "Given Number is Negative";
		}
		else {
			return "Given Number is Zero";
		}
	}

	public static void main(String[] args) {
		System.out.println("Start");
		Scanner scan = new Scanner(System.in);
		System.out.print("Select the number of iteration you want to check : ");
		int it = scan.nextInt();
		
		for(int i=0;i<it;i++) {
		System.out.print("Enter the Number to check the given number is positive or negative : ");
		int n = scan.nextInt();
		PositiveOrNegativeNumber pn = new PositiveOrNegativeNumber();
		System.out.println(pn.CheckTheGivenNumberIsPositiveOrNegative(n));
		}
		scan.close();
		System.out.println("End");
	}

}
