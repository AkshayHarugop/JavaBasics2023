package codingbat.Logic1;

public class problem32LastDigit {
//Q. Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative. 
//	 Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.

//lastDigit(23, 19, 13) → true
//lastDigit(23, 19, 12) → false
//lastDigit(23, 19, 3) → true
	
	public static void main(String[] args) {
		System.out.println(lastDigit(23, 19, 13));
		System.out.println(lastDigit(23, 19, 12));
		System.out.println(lastDigit(23, 19, 3));
	}
	public static boolean lastDigit(int a, int b, int c) {
		int a1=a%10,b1=b%10,c1=c%10;
		if(a1==b1||b1==c1||a1==c1)
		  return true;
		else
			return false;
	}
}
