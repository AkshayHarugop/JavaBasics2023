package LogicalPrgm1;

public class demo3 {
	public static void main(String[] args) {
//Q. write a factor for given number
		/*
		 * for ex n=20;
		 * 20 is divisible by : 1,2,4,5,10,20
		 */
		int n=20;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+", ");
			}
		}
		
//Q. write a factor count for given number
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		System.out.println("\n"+count);
	}
}
