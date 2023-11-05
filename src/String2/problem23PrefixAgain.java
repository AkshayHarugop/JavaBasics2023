package String2;

public class problem23PrefixAgain {
//Q. Given a string, consider the prefix string made of the first N chars of the string. 
//	 Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().

//prefixAgain("abXYabc", 1) → true
//prefixAgain("abXYabc", 2) → true
//prefixAgain("abXYabc", 3) → false

	public static void main(String[] args) {
		System.out.println(prefixAgain("abXYabc", 1));
		System.out.println(prefixAgain("abXYabc", 2));
		System.out.println(prefixAgain("abXYabc", 3));
	}

	public static boolean prefixAgain(String str, int n) {
		String a = str.substring(0, n);
		String b = str.substring(a.length());
		return (b.contains(a)) ? true : false;

//		if (b.contains(a)) {
//			return true;
//		} else {
//			return false;
//		}

//		System.out.println(a);
//		System.out.println(b);

	}
}
