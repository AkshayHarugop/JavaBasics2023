package LogicalPrgm1;

public class demo13 {
	public static void main(String[] args) {
//Q. Write a program to find the largest digit of the given number
		/*
		 * n=123456
		 * O/P : The largest digit of the given number is : 6 
		 */
		int n=827456,l,m=0;
		while(n>=1) {
			l=n%10;
			if(l>m) {
				m=l;
			}
			System.out.print(n%10);
			n=n/10;
		}
		System.out.println("\n"+m);
	}
}
