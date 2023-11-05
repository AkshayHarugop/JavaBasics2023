package Recursion;

public class demo12 {
//Q. Write a program to convert binary to decimal number..
			/*
			 * n=1110;
			 * div				rem				temp=1	deci=0
			 * 1110/10=111		1110%10=0		1		deci=deci+(rem*temp);
			 * 111/10 =11		111%10 =1		2		temp=temp*2;
			 * 11/10  =1		11%10  =1		4		div; // add in loop
			 * 1/10   =0		1%10   =1		8
			 */
	static int n=1110,deci=0,temp=1;
	public static void main(String[] args) {
		System.out.println(binaryToDecimal(n));
	}
	public static int binaryToDecimal(int n) {
		if(n!=0) {
			deci=deci+(temp*(n%10));
			temp=temp*2;
			binaryToDecimal(n/10);
		}
		return deci;
	}

}
