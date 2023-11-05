package LogicalPrgm1;

public class demo10 {
	public static void main(String[] args) {
//Q. Write a program to find the sum of digit for given number
		/*
		 * n=123456
		 * O/P : sum of digits of given number is : 
		 * 1+2+3+4+5+6=21
		 */
		
		int n=203456,sum=0;
		while(n>=1) {
			sum=sum+(n%10);
			n=n/10;
		}
		System.out.println(sum);
	}
}
