package coreJava;

import java.util.Scanner;

public class TableForAnyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String yn;
		do
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the number for the table : ");
			int num = s.nextInt();
			int multi;
			for(int i=1;i<=10;i++) 
			{
				multi=num*i;
				System.out.println(num+"*"+i+"="+multi);
			}
			System.out.println("Do you want to continue? Y or N");
			yn = s.next().toUpperCase();
		}while(yn.equals("Y"));

	}

}
