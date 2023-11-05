package coreJava;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		String yn;
		do
		{
			Scanner s =new Scanner(System.in);
			System.out.println("Enter the number for which you want to check the prime : ");
			int n=s.nextInt(), rem, count=0;
			for (int i=2;i<n;i++)
			{
				rem= n%i; if(rem==0)
				{
					count++;
				}
			}
			if(count==0) {System.out.println("the given number is prime number");}
			else {System.out.println(n+" the given number is not prime number");}
			System.out.println("If you want to continue the reversing number prosess click on 'Y' else click on 'N'");
			yn = s.next().toUpperCase();
		} while (yn.equals("Y"));
	}
}
