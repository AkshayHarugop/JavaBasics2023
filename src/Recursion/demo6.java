package Recursion;

public class demo6 {
//Q. WPF fibonacci series 
	/*
	 * n=10 O/P : 1,2,3,5,8,13,21,34,55,89
	 * i=0,j=1;
	 * 0+1=1;
	 * 1+1=2;
	 * 1+2=3;
	 * 2+3=5;
	 * 
	 */
	public static void main(String[] args) {
		nFibonacciSeries(20);
	}
	static int i=0,j=1,l;
	public static void nFibonacciSeries(int k) {
		if(k==0)
			return;
		l= i+j;
		System.out.print(l+",");
		i=j;j=l;
		nFibonacciSeries(--k);
	}
}
