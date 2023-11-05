package String2;

public class problem29StarOut {
//Q. Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. 
//	 So "ab*cd" yields "ad" and "ab**cd" also yields "ad".

//starOut("ab*cd") → "ad"
//starOut("ab**cd") → "ad"
//starOut("sm*eilly") → "silly"

	public static void main(String[] args) {
		System.out.println(starOut("ab*cd"));
		System.out.println(starOut("ab**cd"));
		System.out.println(starOut("sm*eilly"));
	}

	public static String starOut(String str) {
		int len = str.length();
		String finalString = "";
		for (int i = 0; i < len; i++) {
			if (i == 0 && str.charAt(i) != '*')
				finalString += str.charAt(i);
			if (i > 0 && str.charAt(i) != '*' && str.charAt(i - 1) != '*')
				finalString += str.charAt(i);
			if (i > 0 && str.charAt(i) == '*' && str.charAt(i - 1) != '*')
				finalString = finalString.substring(0, finalString.length() - 1);
		}
		return finalString;

//		int len = str.length();
//		int f=0;
//		String temp="";
//		for(int i=0;i<len-3;i++) {
//			if(str.charAt(i+1)=='*') {
//				if(str.charAt(i+2)=='*') {
//					temp=temp+str.substring(i-1,i)+str.substring(i+4, i+5);
//					i=i+6;
//				}else {
//					temp=temp+str.substring(i-1,i)+str.substring(i+3, i+4);
//					i=i+4;
//					f=i;
//				}
//			}
//		}
//		if(str.substring(f)==str) {
//			return temp;
//		}else {
//			return temp+str.substring(f);
//		}

	}
}
