package coreJava;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the value to check Even or Odd");
		int A = s.nextInt();
		if(A%2==0) {System.out.println(A+" is even number");}
		else {System.out.println(A+" is odd number");}
		

	}

}
