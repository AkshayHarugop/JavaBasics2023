package codingbat.Warmup2;

public class problem12stringX {
//Q. Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.

//stringX("xxHxix") → "xHix"
//stringX("abxxxcd") → "abcd"
//stringX("xabxxxcdx") → "xabcdx"

	public static void main(String[] args) {
		System.out.println(stringX("x"));
		System.out.println(stringX("xxHxix"));
		System.out.println(stringX("abxxxcd"));
		System.out.println(stringX("xabxxxcdx"));
	}

	public static String stringX(String str) {
		String temp = "";
		for (int i = 1; i < str.length() - 1; i++) {
			if (str.charAt(i) == 'x') {
			} else {
				temp = temp + str.charAt(i);
			}
		}

		if (str.length() == 1) {
			return str.charAt(0) + temp;
		} else if (str.length() == 0) {
			return "";
		} else {
			return str.charAt(0) + temp + str.charAt(str.length() - 1);
		}
	}
}