package com;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Calculator c = new Calci();
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Calculator");
		while (true) {
			System.out.println(
					"Select 1 for Addition\nSelect 2 for Substraction\nSelect 3 for Mulitiplication\nSelect 4 for Division\nSelect 5 for Exit");
			System.out.print("Enter your choice : ");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				
				System.out.print("Enter the 1st number");
				int a = scan.nextInt();
				System.out.print("Enter the 2nd number");
				int b = scan.nextInt();
				c.Add(a, b);
				break;

			case 2:
				System.out.println("Enter the 1st number");
				int d = scan.nextInt();
				System.out.println("Enter the 2nd number");
				int e = scan.nextInt();
				c.Substract(d, d);
				break;

			case 3:
				System.out.println("Enter the 1st number");
				int f = scan.nextInt();
				System.out.println("Enter the 2nd number");
				int g = scan.nextInt();
				c.Multiply(f, g);
				break;

			case 4:
				System.out.println("Enter the 1st number");
				int h = scan.nextInt();
				System.out.println("Enter the 2nd number");
				int i = scan.nextInt();
				c.Devide(h, i);
				break;

			case 5:
				System.out.println("Thank you!!");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid choice");

			}
		}
	}
}
