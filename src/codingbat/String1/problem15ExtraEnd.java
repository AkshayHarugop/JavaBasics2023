package codingbat.String1;

public class problem15ExtraEnd {
//Q. Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.

//extraEnd("Hello") → "lololo"
//extraEnd("ab") → "ababab"
//extraEnd("Hi") → "HiHiHi"

	public static void main(String[] args) {
		System.out.println(extraEnd("Hello"));
		System.out.println(extraEnd("abc"));
		System.out.println(extraEnd("Hi"));
	}

	public static String extraEnd(String str) {
		return (str.length() >= 2)
				? str.substring(str.length() - 2) + str.substring(str.length() - 2) + str.substring(str.length() - 2)
				: str;
//		if(str.length()>=2) {
//			return str.substring(str.length()-2)+str.substring(str.length()-2)+str.substring(str.length()-2);
//		}else {
//		  return str;
//		}
	}
}