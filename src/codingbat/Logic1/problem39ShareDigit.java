package codingbat.Logic1;

public class problem39ShareDigit {
//Q. Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23. 
//	(Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)

//			shareDigit(12, 23) → true
//			shareDigit(12, 43) → false
//			shareDigit(12, 44) → false

	public static void main(String[] args) {
		System.out.println(shareDigit(12, 23));
		System.out.println(shareDigit(12, 43));
		System.out.println(shareDigit(12, 44));
	}

	public static boolean shareDigit(int a, int b) {
		int la = a / 10, ra = a % 10, lb = b / 10, rb = b % 10;
		if ((la == lb || la == rb))
			return true;
		else if ((ra == lb || ra == rb))
			return true;
		else
			return false;

	}
}