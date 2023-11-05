package Recursion;

public class demo9 {
//Q. WAP to for factorial on n.. Ex : n=5! =>>5*4*3*2*1=120; =>> n=6; 6*5!=720;
	static int n = 5;

	public static void main(String[] args) {
		System.out.println(factOfN());
	}

	public static int factOfN() {
		if (n == 1) {
			return 1;
		}
		return n-- * factOfN();
	}

//	static int i = 1, fact = 1;
//	public static int factOfN(int m) {
//		if (i > n) {
//			return fact;
//		} else {
//			fact = fact * i;
//			i += 1;
//			factOfN(i);
//		}
//		return fact;
//	}
}