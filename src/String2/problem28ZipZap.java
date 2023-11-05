package String2;

public class problem28ZipZap {
//Q. Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. 
//	 Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".

//zipZap("zipXzap") → "zpXzp"
//zipZap("zopzop") → "zpzp"
//zipZap("zzzopzop") → "zzzpzp"
//zipZap("abcppp") → "abcppp"		
//zipZap("zi") → "zi"
//zipZap("azbcppp") → "azbcppp"	

	public static void main(String[] args) {
		System.out.println(zipZap("zipXzap"));
		System.out.println(zipZap("zopzop"));
		System.out.println(zipZap("zzzopzop"));
		System.out.println(zipZap("abcppp"));
		System.out.println(zipZap(""));
		System.out.println(zipZap("azbcppp"));
	}

	public static String zipZap(String str) {
		String temp = "";
		if (str.contains("z") && str.contains("p")) {
			for (int i = 0; i < str.length() - 2; i++) {
				if (str.substring(i, i + 1).equals("z") && str.substring(i + 2, i + 3).equals("p")) {
					temp = temp + str.substring(i, i + 1) + str.substring(i + 2, i + 3);
					i = i + 2;
				} else if (i == str.length() - 3) {
					temp = temp + str.substring(i);
				} else {
					temp = temp + str.charAt(i);
				}
			}
		} else {
			return temp = str;
		}
		return temp;
	}
}
