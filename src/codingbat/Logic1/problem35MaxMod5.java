package codingbat.Logic1;

public class problem35MaxMod5 {
//Q. Given two int values, return whichever value is larger.
//	 However if the two values have the same remainder when divided by 5, then the return the smaller value. 
//	 However, in all cases, if the two values are the same, return 0. Note: the % "mod" operator computes the remainder, e.g. 7 % 5 is 2.

//			maxMod5(2, 3) → 3
//			maxMod5(6, 2) → 6
//			maxMod5(3, 2) → 3

	public static void main(String[] args) {
		System.out.println(maxMod5(2, 3));
		System.out.println(maxMod5(6, 2));
		System.out.println(maxMod5(3, 2));
		System.out.println(maxMod5(7, 12));
		System.out.println(maxMod5(7, 7));
	}

	public static int maxMod5(int a, int b) {
		if (a == b) {
			return 0;
		} else if (a % 5 == b % 5) {
			return (a > b) ? b : a;
		} else {
			return (a > b) ? a : b;
		}
	}
}
