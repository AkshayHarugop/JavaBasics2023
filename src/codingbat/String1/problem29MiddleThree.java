package codingbat.String1;

public class problem29MiddleThree {
//Q. Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.

//middleThree("Candy") → "and"
//middleThree("and") → "and"
//middleThree("solving") → "lvi"

	public static void main(String[] args) {
		System.out.println(middleThree("Candy"));
		System.out.println(middleThree("and"));
		System.out.println(middleThree("solving"));
	}

	public static String middleThree(String str) {
		return (str.length() % 2 != 0) ? (str.substring(((str.length() / 2) - 1), ((str.length() / 2) + 2))) : str;
//		if(str.length()%2!=0) {
//			return str.substring(((str.length()/2)-1), ((str.length()/2)+2));
//		}
//		  return str;
	}
}