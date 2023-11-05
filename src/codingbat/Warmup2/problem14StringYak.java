package codingbat.Warmup2;

public class problem14StringYak {
//Q. Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. 
//	The "yak" strings will not overlap.

//			stringYak("yakpak") → "pak"
//			stringYak("pakyak") → "pak"
//			stringYak("yak123ya") → "123ya"

	public static void main(String[] args) {
		System.out.println(stringYak("yakpak"));
		System.out.println(stringYak("pakyak"));
		System.out.println(stringYak("yak123ya"));
	}

	public static String stringYak(String str) {
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) == 'y')) {
				if ((i + 1) < str.length() && (str.charAt(i + 1) == 'a')) {
					if ((i + 2) < str.length() && (str.charAt(i + 2) == 'k')) {
						i = i + 2;
					} else {
						temp = temp + str.charAt(i);
					}
				} else {
					temp = temp + str.charAt(i);
				}

			} else {
				temp = temp + str.charAt(i);
			}
		}
		return temp;
	}
}
