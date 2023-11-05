package codingbat.String1;

public class problem24WithouEnd2 {
//Q. Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.

//withouEnd2("Hello") → "ell"
//withouEnd2("abc") → "b"
//withouEnd2("ab") → ""
	
	public static void main(String[] args) {
		System.out.println(withouEnd2("Hello"));
		System.out.println(withouEnd2("abc"));
		System.out.println(withouEnd2("ab"));
		System.out.println(withouEnd2("a"));
		System.out.println(withouEnd2(""));
	}
	public static String withouEnd2(String str) {
		return (str.length()>2)?(str.substring(1, str.length()-1)):("");
//		if(str.length()>2) {
//			return str.substring(1, str.length()-1);
//		}else {
//		  return "";
//		}
	}	
}