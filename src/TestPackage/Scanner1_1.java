package TestPackage;

import java.util.Scanner;

public class Scanner1_1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the employee name : ");
		String name = scan.next().toLowerCase();
		System.out.print("Enter the Company name : ");
		String CompanyName = scan.next().toUpperCase();
		System.out.println("The entered name is : "+name);
		System.out.println("The entered CompanyName is : "+CompanyName);
		scan.close();
	}

}