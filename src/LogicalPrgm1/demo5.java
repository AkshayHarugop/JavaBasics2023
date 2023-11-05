package LogicalPrgm1;

public class demo5 {
	public static void main(String[] args) {
//Q. check the given number is prime or not
		/*
		 * n=7;
		 * 5 is divisible by 1 and 5 so its prime number
		 * 7 is divisible by 1 and 7 so its prime number
		 * 10 is divisible by 1, 2,5,10 so it's not prime number
		 */
		
		int n=8,count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(n+" the given number is prime number.");
		}
		else {
			System.out.println(n+" the given number is not prime number.");
		}
		
		
//optimizing the program
		count=0;
		int loopcount=0;
		for(int i=2;i<n;i++) {
			loopcount++;
			if(n%i==0) {
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println(n+" is prime number.");
		}
		else {
			System.out.println(n+" is not prime number.");
		}
		System.out.println("loop count : "+loopcount);
		
	}
}
