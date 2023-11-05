package String2;

public class problem11DoubleChar {
//Q. Given a string, return a string where for every char in the original, there are two chars.

//doubleChar("The") → "TThhee"
//doubleChar("AAbb") → "AAAAbbbb"
//doubleChar("Hi-There") → "HHii--TThheerree"

	public static void main(String[] args) {
		System.out.println(doubleChar("The"));
		System.out.println(doubleChar("AAbb"));
		System.out.println(doubleChar("Hi-There"));
	}

	public static String doubleChar(String str) {
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			temp = temp + str.charAt(i) + str.charAt(i);
		}
		return temp;

//		we can write it with help of converting char []

	}
}
