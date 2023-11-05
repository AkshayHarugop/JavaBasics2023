package String2;

public class problem19MixString {
//Q. Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. 
//	 Any leftover chars go at the end of the result.

//mixString("abc", "xyz") → "axbycz"
//mixString("Hi", "There") → "HTihere"
//mixString("xxxx", "There") → "xTxhxexre"

	public static void main(String[] args) {
		System.out.println(mixString("abc", "xyz"));
		System.out.println(mixString("Hi", "There"));
		System.out.println(mixString("xxxx", "There"));
	}

	public static String mixString(String a, String b) {
		String temp = "";
		int n = ((a.length()) > (b.length())) ? b.length() : a.length();
		for (int i = 0; i < n; i++) {
			temp = temp + a.charAt(i) + b.charAt(i);
		}
		return ((a.length()) > (b.length())) ? (temp + a.substring(b.length())) : (temp + b.substring(a.length()));

//		if(a.length()>b.length()) {
//			return (temp+a.substring(b.length()));
//		}else {
//			return (temp+b.substring(a.length()));
//		}
	}
}
