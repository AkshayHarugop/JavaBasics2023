package codingbat.String1;

public class problem14MakeOutWord {
//Q. Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. 
//	"<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.

//makeOutWord("<<>>", "Yay") → "<<Yay>>"
//makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
//makeOutWord("[[]]", "word") → "[[word]]"

	public static void main(String[] args) {
		System.out.println(makeOutWord("<<>>", "Yay"));
		System.out.println(makeOutWord("<<>>", "WooHoo"));
		System.out.println(makeOutWord("[[]]", "word"));
	}

	public static String makeOutWord(String out, String word) {
		int mid = 0;
		String temp = "";
		if (out.length() % 2 == 0) {
			mid = out.length() / 2;
		} else {
		}

		if (mid > 0) {
			for (int i = 0; i < mid; i++) {
				temp = temp + out.charAt(i);
			}
			temp = temp + word;
			for (int i = mid; i < out.length(); i++) {
				temp = temp + out.charAt(i);
			}
		}
		return temp;
	}
}
