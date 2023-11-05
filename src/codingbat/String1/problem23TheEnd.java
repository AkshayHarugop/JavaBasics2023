package codingbat.String1;

public class problem23TheEnd {
//Q. Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. 
//	The string will be non-empty.

//theEnd("Hello", true) → "H"
//theEnd("Hello", false) → "o"
//theEnd("oh", true) → "o"

	public static void main(String[] args) {
		System.out.println(theEnd("Hello", true));
		System.out.println(theEnd("Hello", false));
		System.out.println(theEnd("oh", true));
	}

	public static String theEnd(String str, boolean front) {
		return (front == true) ? (str.substring(0, 1)) : (str.substring(str.length() - 1));
//		if(front==true) {
//			return str.substring(0,1);
//		}else {
//		return str.substring(str.length()-1);
//		}
	}
}