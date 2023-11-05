package coreJava;

import java.util.Scanner;

public class FactorialUsingRecursion {
	static int fact = 1;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number for which you want to know the factorial : ");
		int n = s.nextInt();
		FactorialUsingRecursion f = new FactorialUsingRecursion();
		f.calfact(n);

		System.out.println(n + "! = " + fact);
	}
	void calfact(int n) {
		if (n >= 1) {
			fact = fact * n;
			calfact(n - 1);
		}
	}
}
