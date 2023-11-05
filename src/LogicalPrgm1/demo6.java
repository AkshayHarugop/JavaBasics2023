package LogicalPrgm1;

public class demo6 {
	public static void main(String[] args) {
// find  the factorial of n
		/*
		 * n=5;
		 * factorial of n is : 
		 * 5*4*3*2*1=120
		 */
		int n=6,fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("factorial of "+n+" is : "+fact);
		System.out.println("==============================");
		fact=1;
		for(int i=n;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println("factorial of "+n+" is : "+fact);
		
	}
}
