package LogicalPrgm1;

public class demo12 {
	public static void main(String[] args) {
//Q. Write a program to check the given number is palindrome or not...
		/*
		 * n=12321
		 * 1st we need to reverse the number and we need to store that and
		 * compare it, if the comparison is true its palindrome else not palindrome number
		 */
		
		int n=12321,rev=0,m=n;
		while(n!=0) {
			rev=(rev*10)+(n%10);
			n=n/10;
		}
		System.out.println(rev);
		if(m==rev) {
			System.out.println("The given number is a Palindrome!");
		}
		else {
			System.out.println("The given number is not Palindrome!");
		}
		
	}
}
