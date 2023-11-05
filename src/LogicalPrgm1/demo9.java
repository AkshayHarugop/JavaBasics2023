package LogicalPrgm1;

public class demo9 {
	public static void main(String[] args) {
//Q. write a program for first and last digit of the a number
		
		int n=22345,m=n,o = 0;
		while(n!=0) {
			n=n/10;
			System.out.println(n);
			if(n!=0) {
				o=n;
			}
		}
		System.out.println("First digit of given number is : "+o);
		System.out.println("Last digit of given number is : "+m%10);
	}
}
