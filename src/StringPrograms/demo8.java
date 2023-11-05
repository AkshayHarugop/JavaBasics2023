package StringPrograms;

public class demo8 {
//Q. To reverse all words in the given string
	// ex : "Belagavi is Beautiful city"
	// o/p: "ivagaleB si lufituaeB ytic"
	public static void main(String[] args) {
		String s = "Belagavi is Beautiful city";
		System.out.println(reverseAllWords(s));
	}

	private static String reverseAllWords(String s) {
		String[] s1 = s.split(" ");
		String word1="";
		for(String i:s1) {
			String word = "";
			for (int j = i.length() - 1; j >= 0; j--) {
				word = word + i.charAt(j);
			}
			String word2 = word+" "; 
			word1=word1+word2;
		}
		return word1;
	}
}