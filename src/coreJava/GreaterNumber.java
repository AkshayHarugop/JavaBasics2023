package coreJava;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the 1st number : ");
		int a = s.nextInt();
		System.out.println("Enter the 2nd number : ");
		int b = s.nextInt();
		//int a=100,b=200,c=300;
		if(a>b) {System.out.println("in the entered number that is "+a+" & "+b+", 1st number that is "+a+" greater");}
		//else if(b>a && b>c){System.out.println("b is greater");}
		else{System.out.println("in the entered number that is "+a+" & "+b+", 2nd number that is "+b+" greater");}


	}

}
