package coreJava;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String yn;
		do
		{
		int C;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the 1st value : ");
		int A = s.nextInt();
		System.out.println("Provide the arithmatic expression : ");
		String Sym = s.next();
		System.out.println("Enter the 2nd value : ");
		int B = s.nextInt();
		switch(Sym)
		{
		case "+" : C=A+B; System.out.println("Sum of given number is : "+C); break; 
		//case "+" : C=A+B; System.out.println("Addition of "+A+" and "+B+" are : "+C); break;
		case "-" : C=A-B; System.out.println("Substraction of "+A+" and "+B+" are : "+C); break;
		case "*" : C=A*B; System.out.println("Multiplication of "+A+" and "+B+" are : "+C); break;
		case "/" : C=A/B; System.out.println("Division of "+A+" and "+B+" are : "+C); break;
		case "%" : C=A%B; System.out.println("Reminder of "+A+" and "+B+" are : "+C); break;
		default : System.out.println("The Arithmatic expression you provided is invalid : "+Sym); break;
		}
		System.out.println("Do you want to continue calculation ? 'Y' or 'N'");
		yn = s.next().toUpperCase();
		}while(yn.equals("Y"));
	}
}
