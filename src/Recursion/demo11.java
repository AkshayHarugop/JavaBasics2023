package Recursion;

public class demo11 {
//Q. Write a program to convert decimal value to binary value
			/*
			 * n=15;
			 * O/P : Binary number for 15 is 1111
			 * logic
			 * 15/2 =7  reminder =1
			 * 7/2 =3 reminder =1
			 * 3/2 =1 reminder =1
			 * 1/2 =0 reminder =1
			 * reminder from back side we should see = 1111
			 * 
			 * n=14
			 * O/P : Binary number for 14 is 1110
			 * 	div			rem			temp	bin=0
			 * 14/2 =7 		14%2 =0		1		bin=bin+(rem*temp);
			 *  7/2 =3 		7%2 =1 		10		temp=temp*10;
			 *  3/2 =1 		3%2 =1		100		n=n/2; //add in loop
			 *  1/2 =0 		1%2 =1		1000
			 *  reminder from back side we should see = 1110
			 */
			
	static int temp=1,bin=0;
	public static void main(String[] args) {
		System.out.println(decimalTOBinary(14));
	}

	public static int decimalTOBinary(int n) {
		if(n!=0) {
			bin=bin+(temp*(n%2));
			temp=temp*10;
			decimalTOBinary(n/2);
		}
		return bin;
	}

}
