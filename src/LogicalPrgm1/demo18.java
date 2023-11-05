package LogicalPrgm1;

public class demo18 {

	public static void main(String[] args) {
//Q. Write program to check the given number is strong number or not ...
		/*
		 * What is strong number : 
		 * Strong number is a special number whose sum of the factorial of digits is equal to the original number. 
		 * For Example: 145 is strong number. Since, 1! + 4! + 5! =1+24+120=145
		 */
//My logic : 
		/*
		 * 1. n=145 : take each digit out from the number by n%10 and find the factorial for that and add in the sum variable
		 * and finally compare it with actual n
		 * if n==sum then it's Strong number else not strong number.
		 */
		int n=146;
//		System.out.println(145%10); //5
//		System.out.println(145/10); //14
//		System.out.println(14%10); //4
//		System.out.println(14/10); //1
//		System.out.println(1%10); //1
//		System.out.println(1/10); //0
		int fact,sum=0,m=n;
		
//		System.out.println("=================");
		while(n!=0) {
			fact=1;
			int c=n%10;
			for(int i=c;i>=1;i--) {
				fact=fact*i;
			}
			n=n/10;
			sum=sum+fact;
		}
		if(sum==m) {
			System.out.println("The given number: "+m+" is Strong number");
		}
		else {
			System.out.println("The given number : "+m+" is not Strong number");
		}
		
		
	}

}
