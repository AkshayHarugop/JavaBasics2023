package codingbat.String1;

public class problem17FirstHalf {
//Q. Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

//firstHalf("WooHoo") → "Woo"
//firstHalf("HelloThere") → "Hello"
//firstHalf("abcdef") → "abc"

	public static void main(String[] args) {
		System.out.println(firstHalf("WooHoo"));
		System.out.println(firstHalf("HelloThere"));
		System.out.println(firstHalf("abcdef"));
	}

	public static String firstHalf(String str) {
		int mid = 0;
		String temp = "";
		if (str.length() % 2 == 0) {
			mid = str.length() / 2;
			for (int i = 0; i < mid; i++) {
				temp = temp + str.charAt(i);
			}
			return temp;
		} else {
			return str;
		}
	}
}