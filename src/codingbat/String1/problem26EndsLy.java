package codingbat.String1;

public class problem26EndsLy {
//Q. Given a string, return true if it ends in "ly".

//endsLy("oddly") → true
//endsLy("y") → false
//endsLy("oddy") → false

	public static void main(String[] args) {
		System.out.println(endsLy("oddly"));
		System.out.println(endsLy("y"));
		System.out.println(endsLy("oddy"));
	}

	public static boolean endsLy(String str) {
		if (str.length() < 2) {
			return false;
		} else {
			if (str.substring(str.length() - 2, str.length()).equals("ly")) {
				return true;
			} else {
				return false;
			}
		}
	}
}