package codingbat.Warmup2;

public class problem6StringSplosion {
//Q. Given a non-empty string like "Code" return a string like "CCoCodCode".

//stringSplosion("Code") → "CCoCodCode"
//stringSplosion("abc") → "aababc"
//stringSplosion("ab") → "aab"

	public static void main(String[] args) {
		System.out.println(stringSplosion("Code"));
		System.out.println(stringSplosion("abc"));
		System.out.println(stringSplosion("ab"));
	}

	public static String stringSplosion(String str) {
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			temp = temp + str.subSequence(0, i + 1);
		}
		return temp;
	}
}
