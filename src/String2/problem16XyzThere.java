package String2;

public class problem16XyzThere {
//Q. Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). 
//	So "xxyz" counts but "x.xyz" does not.

//xyzThere("abcxyz") → true
//xyzThere("abc.xyz") → false
//xyzThere("xyz.abc") → true

	public static void main(String[] args) {
		System.out.println(xyzThere("abcxyz"));
		System.out.println(xyzThere("abc.xyz"));
		System.out.println(xyzThere("xyz.abc"));
	}

	public static boolean xyzThere(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 2; i++) {
			if (i != 0) {
				if (str.subSequence(i - 1, i).equals(".")) {
					if (str.substring(i, i + 3).equals("xyz")) {
					}
				} else {
					if (str.substring(i, i + 3).equals("xyz"))
						count++;
				}

			} else {
				if (str.substring(i, i + 3).equals("xyz"))
					count++;
			}
		}

		return (count == 0) ? false : true;

	}
}
