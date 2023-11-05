package codingbat.Logic1;

public class problem17Love6 {
//Q. The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their sum or difference is 6. 
//	Note: the function Math.abs(num) computes the absolute value of a number.

//love6(6, 4) → true
//love6(4, 5) → false
//love6(1, 5) → true

	public static void main(String[] args) {
		System.out.println(love6(6, 4));
		System.out.println(love6(4, 5));
		System.out.println(love6(1, 5));
	}

	public static boolean love6(int a, int b) {
		if(a==6||b==6||a+b==6||a-b==6||b-a==6) {
			return true;
		}
		return false;
//		return true a||b==6
//		return true a+b||a-b||b-a==6 
//		
	}
}
