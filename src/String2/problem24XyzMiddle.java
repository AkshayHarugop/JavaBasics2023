package String2;

public class problem24XyzMiddle {
//Q. Given a string, does "xyz" appear in the middle of the string? To define middle, 
//	 we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.

//xyzMiddle("AAxyzBBB") → true
//xyzMiddle("AxyzBB") → true
//xyzMiddle("AxyzBBB") → false
//xyzMiddle("AAAxyzBB") → true		
//xyzMiddle("") → false	

	public static void main(String[] args) {
		System.out.println(xyzMiddle("AAxyzBBB"));
		System.out.println(xyzMiddle("AxyzBB"));
		System.out.println(xyzMiddle("AxyzBBB"));
		System.out.println(xyzMiddle("AAAxyzBB"));
		System.out.println(xyzMiddle(""));
	}

	public static boolean xyzMiddle(String str) {
		int EO = str.length() % 2;
//		System.out.println(EO);
		int mid = str.length() / 2;
//		System.out.println(mid);
		if (str.equals("") || str.equals("x") || str.equals("xy")) {
			return false;
		} else if (EO == 0) {
//			System.out.println(str.substring(mid-2, mid+1).equals("xyz"));
			if ((str.substring(mid - 2, mid + 1).equals("xyz")) || str.substring(mid - 1, mid + 2).equals("xyz")) {
				return true;
			}
		} else {
//			System.out.println(str.substring(mid-1, mid+2).equals("xyz"));
			if (str.substring(mid - 1, mid + 2).equals("xyz")) {
				return true;
			}

		}
//		if(str.substring(mid-1, mid+2))

		return false;
	}
}
