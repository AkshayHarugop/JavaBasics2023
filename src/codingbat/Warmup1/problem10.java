package codingbat.Warmup1;

public class problem10 {
//Q. Given a non-empty string and an int n, return a new string where the char at index n has been removed. 
//	The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).

//missingChar("kitten", 1) → "ktten"
//missingChar("kitten", 0) → "itten"
//missingChar("kitten", 4) → "kittn"

	public static void main(String[] args) {
		System.out.println(missingChar("kitten", 0));
	}

	public static String missingChar(String str, int n) {
		char[] a = str.toCharArray();
		String sam = "";
		for (int i = 0; i < a.length; i++) {
			if (i == n) {

			} else {
				sam = sam + a[i];
			}
		}
		return sam;

//		String front = str.substring(0, n);
//
//		// Start this substring at n+1 to omit the char.
//		// Can also be shortened to just str.substring(n+1)
//		// which goes through the end of the string.
//		String back = str.substring(n + 1, str.length());
//
//		return front + back;
	}

}
