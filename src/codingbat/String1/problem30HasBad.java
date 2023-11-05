package codingbat.String1;

public class problem30HasBad {
//Q. Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". 
//	 The string may be any length, including 0. Note: use .equals() to compare 2 strings.

//hasBad("badxx") → true
//hasBad("xbadxx") → true
//hasBad("xxbadxx") → false
//hasBad("ba") → false
//hasBad("xba") → false
//hasBad("bad") → true
//(str.substring(i, i + 3).equals("bad"))
	public static void main(String[] args) {
		System.out.println(hasBad("badxx"));
		System.out.println(hasBad("xbadxx"));
		System.out.println(hasBad("xxbadxx"));
		System.out.println(hasBad("ba"));
		System.out.println(hasBad("xba"));
		System.out.println(hasBad("bad"));
	}

	public static boolean hasBad(String str) {
		if (str.length() > 3) {
			for (int i = 0; i < 2; i++) {
				if ((str.substring(i, i + 3).equals("bad"))) {
					return true;
				}
			}
		} else if (str.substring(0).equals("bad")) {
			return true;
		}
		return false;
	}
}
