package codingbat.Warmup1;

public class problem11 {
//Q. Given a string, return a new string where the first and last chars have been exchanged.

//frontBack("code") → "eodc"
//frontBack("a") → "a"
//frontBack("ab") → "ba"

	public static void main(String[] args) {
		System.out.println(frontBack("code"));
	}

	public static String frontBack(String str) {
		char[] a = str.toCharArray();
		char temp = 0;
		String sen = "";
		for (int i = 0; i < a.length; i++) {
			if (i == 0) {
				temp = a[i];
				a[i] = a[a.length - 1];
				sen = sen + a[i];
			} else if (i == (a.length - 1)) {
				a[i] = temp;
				sen = sen + a[i];
			} else {
				sen = sen + a[i];
			}
		}
		return sen;
	}

}
