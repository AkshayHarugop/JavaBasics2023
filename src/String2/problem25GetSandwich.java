package String2;

public class problem25GetSandwich {
//Q. A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, 
//	 or return the empty string "" if there are not two pieces of bread.

//getSandwich("breadjambread") → "jam"
//getSandwich("xxbreadjambreadyy") → "jam"
//getSandwich("xxbreadyy") → ""

	public static void main(String[] args) {
		System.out.println(getSandwich("breadjambread"));
		System.out.println(getSandwich("xxbreadjambreadyy"));
		System.out.println(getSandwich("xxbreadyy"));
	}

	public static String getSandwich(String str) {
		String tmpString = "";
		boolean found = true;
		int len = str.length(), finish = 0, start = 0;
		for (int i = 0; i < len - 4; i++) {
			tmpString = str.substring(i, i + 5);

			if (tmpString.equals("bread") && found == true) {
				i += 5;
				start = i;
				found = false;
			}

			if (tmpString.equals("bread") && found == false) {
				finish = i;
			}
		}

		return str.substring(start, finish);
	}
}
