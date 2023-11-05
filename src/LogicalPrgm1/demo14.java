package LogicalPrgm1;

public class demo14 {
	public static void main(String[] args) {
//Q. Write a program to check the given number is perfect square or not..
		/*
		 * n=4;
		 * √4=2
		 * ex : √9=3, √16=4, √25=5
		 */
		
//1st Logic		
		int n=1,m=16,o=m/2,sq;
		while(n<=o) {
			sq=n*n;
			if(sq==m) {
				System.out.println("The given number is the perfect square root of : "+n);
				break;
			}
			n++;
		}
		
//2nd logic
		int sqrt = (int) Math.sqrt(m);
		if(m==(sqrt*sqrt)) {
			System.out.println("The given number is the perfect square root of : "+sqrt);
		}
		else {
			System.out.println("The given number is not the perfect square root of : "+sqrt);
		}
	}
}
