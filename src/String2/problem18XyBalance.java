package String2;

public class problem18XyBalance {
//Q. We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string. 
//	 So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.

//xyBalance("aaxbby") → true
//xyBalance("aaxbb") → false
//xyBalance("yaaxbb") → false

	public static void main(String[] args) {
		System.out.println(xyBalance("yaaxbby"));
		System.out.println(xyBalance("aaxbb"));
		System.out.println(xyBalance("yaaxbb"));
	}

	public static boolean xyBalance(String str) {
		// Find the rightmost y
		int y = -1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'y')
				y = i;
		}

		// Look at the x's, return false if one is after y
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'x' && i > y)
				return false;
		}
		return true;

		// Solution notes: this solution uses two loops, each written the simple
		// 0..length way. You could do it with a single reverse loop, noticing
		// if you see an x before a y. Or use lastIndexOf().

//		Boolean x = false;
//		Boolean y = false;
//		int len = str.length();
//
//		for (int i = 0; i < len; i++) {
//			if (str.charAt(i) == 'x' && y == true) {
//				x = true;
//				y = false;
//			} else if (str.charAt(i) == 'x') {
//				x = true;
//			}
//			if (str.charAt(i) == 'y' && x == true)
//				y = true;
//		}
//		if (x == false)
//			y = true;
//		return y;

//		String temp = "";
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) == 'x' || str.charAt(i) == 'y') {
//				temp = temp + str.charAt(i);
//			}
//		}
//		
////		return (temp.equals("xy")||temp.equals("xxy")||temp.equals("yxy"))?true:false;
//		if (temp.contains("x")&&temp.contains("y")) {
//			if(temp.equals("xyx")||temp.equals("yx")) {
//				return false;
//			}
//			return true;
//		} else {
//			return false;
//		}
	}
}
