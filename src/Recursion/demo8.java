package Recursion;

public class demo8 {
//Q. WAP to find the sum of n natural numbers if n=5 : 1,2,3,4,5 : 1+2+3+4+5=15
	// logic by the tech
	static int n = 5;

	public static void main(String[] args) {
		System.out.println(printMe(1));
	}

	public static int printMe(int i) {
		if (i == n) {
			return i;
		}
		return i + printMe(i + 1);
	}

	// 1st logic by me
//	public static void main(String[] args) {
//		System.out.println(sumOfnNaturalNumbers(15));
//	}
//	static int i=1,sum=0;
//	public static int sumOfnNaturalNumbers(int n) {
//		if(n>=1) {
//			sum=sum+i;
//			i+=1;
//			sumOfnNaturalNumbers(n-1);
//		}
//		return sum;
//	}
}