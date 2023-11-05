package codingbat.String1;

public class problem25MiddleTwo {
//Q. Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.

//middleTwo("string") → "ri"
//middleTwo("code") → "od"
//middleTwo("Practice") → "ct"

	public static void main(String[] args) {
		System.out.println(middleTwo("string"));
		System.out.println(middleTwo("cod"));
		System.out.println(middleTwo("Practice"));

	}

	public static String middleTwo(String str) {
		return (str.length() % 2 == 0) ? (str.substring(((str.length() / 2) - 1), ((str.length() / 2) + 1)))
				: (str.substring(((str.length() / 2)), ((str.length() / 2) + 1)));
//		if(str.length()%2==0) {
//			return str.substring(((str.length()/2)-1), ((str.length()/2)+1));
//		}else {
//			return str.substring(((str.length()/2)),((str.length()/2)+1));
//		}

	}
}