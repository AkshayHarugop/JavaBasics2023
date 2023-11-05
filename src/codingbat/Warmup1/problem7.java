package codingbat.Warmup1;

public class problem7 {
//Q. Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.

//			nearHundred(93) → true
//			nearHundred(90) → true
//			nearHundred(89) → false

	public static void main(String[] args) {
		System.out.println(nearHundred(93));
	}

	public static boolean nearHundred(int n) {
		return (n >= 90 && n <= 110 || n >= 190 && n <= 210)?true:false;
//		if (n >= 90 && n <= 110 || n >= 190 && n <= 210) {
//			return true;
//		} else {
//			return false;
//		}
	}

}
