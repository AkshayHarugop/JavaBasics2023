package codingbat.String1;

public class problem37MinCat {
//Q. Given two strings, append them together (known as "concatenation") and return the result. 
//	However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. 
//	So "Hello" and "Hi" yield "loHi". The strings may be any length.

//			minCat("Hello", "Hi") → "loHi"
//			minCat("Hello", "java") → "ellojava"
//			minCat("java", "Hello") → "javaello"

	public static void main(String[] args) {
		System.out.println(minCat("Hello", "Hi"));
		System.out.println(minCat("Hello", "java"));
		System.out.println(minCat("java", "Hello"));
	}
	public static String minCat(String a, String b) {
		int al = a.length(), bl=b.length();
		return (al>bl)?(a.substring(al-bl)+b):(a+b.substring(bl-al));
//		if(al>bl) {
//			return a.substring(al-bl)+b;
//		}else {
//			return a+b.substring(bl-al);
//		}
	}
}