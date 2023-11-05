package codingbat.String1;

public class problem43WithoutX2 {
//Q. Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. 
//	This is a little harder than it looks.

//withoutX2("xHi") → "Hi"
//withoutX2("Hxi") → "Hi"
//withoutX2("Hi") → "Hi" 

	public static void main(String[] args) {
		System.out.println(withoutX2("xHi"));
		System.out.println(withoutX2("Hxi"));
		System.out.println(withoutX2("Hi"));
	}

	public static String withoutX2(String str) {
		if (str.length() >= 2) {
			if (str.substring(0, 1).equals("x") && str.substring(1, 2).equals("x")) {
				return str.substring(2);
			} else if (str.substring(0, 1).equals("x")) {
				return str.substring(1);
			} else if (str.substring(1, 2).equals("x")) {
				return str.substring(0, 1) + str.substring(2);
			} else {
				return str;
			}
		} else {
			return "";
		}
	}
}