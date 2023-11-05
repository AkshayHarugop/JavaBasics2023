package codingbat.Warmup2;

public class problem4DoubleX {
//Q. Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

//doubleX("axxbb") → true
//doubleX("axaxax") → false
//doubleX("xxxxx") → true

	public static void main(String[] args) {
		System.out.println(doubleX("axxbb"));
		System.out.println(doubleX("axaxax"));
		System.out.println(doubleX("xaxxx"));
	}

	static boolean doubleX(String str) {
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == 'x') {
				if (str.substring(i, i + 2).equals("xx")) {
					return true;
				} else {
					break;
				}
			}
		}
		return false;
	}
}
