package codingbat.Warmup1;

public class problem22 {
//Q. Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.

//mixStart("mix snacks") → true
//mixStart("pix snacks") → true
//mixStart("piz snacks") → false

	public static void main(String[] args) {
		System.out.println(mixStart("mix snacks"));
		System.out.println(mixStart("pix snacks"));
		System.out.println(mixStart("piz snacks"));
		System.out.println(mixStart("ni"));
	}

	public static boolean mixStart(String str) {
		if (str.length() >= 3) {
			if (str.substring(1, 3).equals("ix")) {
				return true;
			}
		}
		return false;
	}

}
