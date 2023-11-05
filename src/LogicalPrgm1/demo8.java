package LogicalPrgm1;

public class demo8 {
	public static void main(String[] args) {
//Q. Write a program for total number of digit in a given number
		/*
		 * n=123456789
		 * O/P : Total number of digit in a given number is 9
		 */
		
		int n=1234567891,count=0;
		while(n>=1) {
			n=n/10;
			count++;
		}
		System.out.println(count);
	}
}
