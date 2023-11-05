package coreJava;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		String yn;
		do {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the number which you want to reverse : ");
			int n = s.nextInt(), rev = 0, rem;
			// int n =123456789, rev=0, rem;
			while (n != 0) {
				rem = n % 10;
				rev = rev * 10 + rem;
				n = n / 10;
			}
			System.out.println("Given number after revering becomes : " + rev);
			System.out.println("If you want to continue the reversing number prosess click on 'Y' else click on 'N'");
			yn = s.next().toUpperCase();
		} while (yn.equals("Y"));
	}
}