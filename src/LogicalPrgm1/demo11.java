package LogicalPrgm1;

public class demo11 {
	public static void main(String[] args) {
//Q. Write a program to reverse a given number
		/*
		 * n=987654321;
		 * Reversing the given number is : 123456789
		 */
		
		int n=987654321,m;
		while(n>=1) {
			m=n%10;
			System.out.print(m);
			n=n/10;
		}
	}
}
