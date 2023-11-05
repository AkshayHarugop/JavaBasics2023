package String2;

public class problem26SameStarChar {
//Q. Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.

//sameStarChar("xy*yzz") → true
//sameStarChar("xy*zzz") → false
//sameStarChar("*xa*az") → true
//sameStarChar("*xa*a*b") → false	
//sameStarChar("*xa*a*") → true	

	public static void main(String[] args) {
		System.out.println(sameStarChar("xy*yzz"));
		System.out.println(sameStarChar("xy*zzz"));
		System.out.println(sameStarChar("*xa*az"));
		System.out.println(sameStarChar("*xa*a*b"));
		System.out.println(sameStarChar("*xa*a*"));
	}

	public static boolean sameStarChar(String str) {
		int temp = 0, starCount = 0;
		// star count in a given string
		for (int i = 1; i < str.length() - 1; i++) {
			if (str.charAt(i) == '*') {
				starCount++;
			}
		}
//		System.out.println(starCount);

		for (int i = 1; i < str.length() - 1; i++) {
			if (str.substring(i, i + 1).equals("*")) {
				if (str.charAt(i - 1) == str.charAt(i + 1)) {
					temp++;
				}
			}
		}
//		System.out.println(temp);
		if (temp == starCount) {
			return true;
		} else {
			return false;
		}
	}
}
