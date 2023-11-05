package codingbat.String1;

public class problem41StartWord {
//Q. Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, 
//	except its first char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string. 
//	So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.

//	startWord("hippo", "hi") → "hi"
//	startWord("hippo", "xip") → "hip"
//	startWord("hippo", "i") → "h"

//	didn't get need to analyse
//	startWord("hippo", "hi") → "hi"	"hi"	OK	
//	startWord("hippo", "xip") → "hip"	"hip"	OK	
//	startWord("hippo", "i") → "h"	"h"	OK	
//	startWord("hippo", "ix") → ""	""	OK	
//	startWord("h", "ix") → ""	""	OK	
//	startWord("", "i") → ""	""	OK	
//	startWord("hip", "zi") → "hi"	"hi"	OK	
//	startWord("hip", "zip") → "hip"	"hip"	OK	
//	startWord("hip", "zig") → ""	""	OK	
//	startWord("h", "z") → "h"	"h"	OK	
//	startWord("hippo", "xippo") → "hippo"	"hippo"	OK	
//	startWord("hippo", "xyz") → ""	""	OK	
//	startWord("hippo", "hip") → "hip"	"hip"	OK	
//	startWord("kitten", "cit") → "kit"	"kit"	OK	
//	startWord("kit", "cit") → "kit"	"kit"	OK

	public static void main(String[] args) {
		System.out.println(startWord("hippo", "hi"));
		System.out.println(startWord("hippo", "xip"));
		System.out.println(startWord("hippo", "i"));
	}

	public static String startWord(String str, String word) {
		int lenStr = str.length(), lenWord = word.length();
		if (lenStr == 0)
			return "";
		if (lenWord > lenStr)
			return "";

		if (word.length() == 1)
			return str.substring(0, 1);
		else if (str.substring(1, lenWord).equals(word.substring(1, lenWord)))
			return str.substring(0, lenWord);
		else
			return "";
	}
}