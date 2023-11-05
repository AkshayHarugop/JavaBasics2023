package codingbat.Warmup2;

public class problem1StringTimes {
//Q. Given a string and a non-negative int n, return a larger string that is n copies of the original string.

//stringTimes("Hi", 2) → "HiHi"
//stringTimes("Hi", 3) → "HiHiHi"
//stringTimes("Hi", 1) → "Hi"

	public static void main(String[] args) {
		System.out.println(stringTimes("Hi", 2));
		System.out.println(stringTimes("Hi", 3));
		System.out.println(stringTimes("Hi", 1));
	}

	public static String stringTimes(String str, int n) {
		String temp = "";
		for (int i = 0; i < n; i++) {
			temp = temp + str;
		}
		return temp;
	}
}
