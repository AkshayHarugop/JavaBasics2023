package coreJava;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the year you want to check : ");
		int year = s.nextInt();
		if(((year%4==0)&&(year%100!=0))||(year%400==0))
		{System.out.println("The entered year is : "+year+" is leap year");}
		else {System.out.println("The entered year is : "+year+" is not leap year");}

	}

}
