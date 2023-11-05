package coreJava;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		String yn;
		do
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the number for which you want to know the factorial : ");
			int n = s.nextInt(), fact = 1;
			for(int i=1;i<=n;i++)
			{
				fact=fact*i;
			}
			System.out.println(n+"! = "+fact);
			System.out.println("Do you want to continue? Y or N");
			yn = s.next().toUpperCase();
		}while(yn.equals("Y"));
	}
}
