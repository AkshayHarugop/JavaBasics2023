package TestPackage;

import java.util.Scanner;

public class Assignment {
	void checkTheNumberisPositiveorNegative(int n){
		if(n>0) {
			System.out.println("The given number "+n+" is positive number");
		}
		else if(n<0) {
			System.out.println("The given number "+n+" is negative number");
		}
		else {
			System.out.println("The given number "+n+" is zero");
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for(int i=1;i<=5;i++) {
		System.out.print(i+") Enter the number for which you want to check +ve or -ve : ");
		int n = scan.nextInt();
		MethodOverloading m = new MethodOverloading();
		m.checkTheNumberisPositiveorNegative(n);
		}
		scan.close();
		System.out.println("End");
	}
}
