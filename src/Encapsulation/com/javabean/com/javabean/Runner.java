package Encapsulation.com.javabean.com.javabean;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the index to accept for array : ");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the values follwed by enter key : ");
		for (int i = 0; i < size; i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("Number Accepting got completed");
		
		for(int i=0;i<size;i++) {
			System.out.println("The entered number is : "+a[i]);
		}

		scan.close();
	}

}
