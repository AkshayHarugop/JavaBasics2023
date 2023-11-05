package Recursion;

public class demo3 {
	static int m=5;
	public static void printNNumbers(int n) {
		if(n<=m) {
			System.out.print(n+",");
			printNNumbers(++n);
		}
	}
	public static void printNReverseNumbers(int n) {
		if(n>=1) {
			System.out.print(n+",");
			printNReverseNumbers(--n);
		}
	}
	
	public static void main(String[] args) {
//Q. Write a program for list of n numbers 
		/*
		 * n=5
		 * O/P : 1,2,3,4,5.
		 */
		printNNumbers(1);
		System.out.println();
		printNReverseNumbers(5);
	}

}
