package String2;

public class problem15EndOther {
//Q. Given two strings, return true if either of the strings appears at the very end of the other string, 
//	 ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). 
//	 Note: str.toLowerCase() returns the lowercase version of a string.

//endOther("Hiabc", "abc") → true
//endOther("AbC", "HiaBc") → true
//endOther("abc", "abXabc") → true

	public static void main(String[] args) {
		System.out.println(endOther("Hiabc", "abc"));
		System.out.println(endOther("AbC", "HiaBc"));
		System.out.println(endOther("abc", "abXabc"));
	}

	public static boolean endOther(String a, String b) {
		String a1 = a.toLowerCase(), b1 = b.toLowerCase();
		if (a1.length() > b1.length()) {
			if (a1.endsWith(b1)) {
				return true;
			} else {
				return false;
			}

		} else {
			if (b1.endsWith(a1))
				return true;
			else
				return false;

		}

	}
}
