package Recursion;

public class demo10 {
//Q. Find the given number is even or odd
	public static void main(String[] args) {
		System.out.println(checkEvenOrOdd(11));
	}

	public static String checkEvenOrOdd(int n) {
		String result= (n%2==0)?n+" is Even Number":n+" is Odd Number";
		return result;
	}

}
