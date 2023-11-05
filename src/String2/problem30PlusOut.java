package String2;

public class problem30PlusOut {
//Q. Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"), 
//	 except for appearances of the word string which are preserved unchanged.

//plusOut("12xy34", "xy") → "++xy++"
//plusOut("12xy34", "1") → "1+++++"
//plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
	public static void main(String[] args) {
		System.out.println(plusOut("12xy34", "xy"));
		System.out.println(plusOut("12xy34", "1"));
		System.out.println(plusOut("12xy34xyabcxy", "xy"));
	}

	public static String plusOut(String str, String word) {
		int slen = str.length();
		int wlen = word.length();
		String fin = "";

		for (int i = 0; i < slen; i++) {
			if (i <= slen - wlen) {
				String tmp = str.substring(i, i + wlen);
				if (tmp.equals(word)) {
					fin += word;
					i += wlen - 1;
				} else
					fin += "+";
			} else
				fin += "+";
		}

		return fin;

//		String temp = "";
//		int n = word.length();
//		for (int i = 0; i < str.length()-1; i++) {
//			if (str.substring(i, n).equals(word)) {
//				temp = temp + word;
//				n++;
//			} else {
//				temp = temp + "+";
//				n++;
//			}
//		}
//		return temp;
	}
}
