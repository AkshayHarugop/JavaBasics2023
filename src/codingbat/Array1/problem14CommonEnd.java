package codingbat.Array1;

public class problem14CommonEnd {
//Q. Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. 
//	Both arrays will be length 1 or more.

//			commonEnd([1, 2, 3], [7, 3]) → true
//			commonEnd([1, 2, 3], [7, 3, 2]) → false
//			commonEnd([1, 2, 3], [1, 3]) → true

	public static void main(String[] args) {
		int[] a = { 1, 2, 3 }, b = { 1, 3 };
		System.out.println(commonEnd(a, b));
	}

	public static boolean commonEnd(int[] a, int[] b) {
		if (a.length >= 1 || b.length >= 1) {
			int al = a.length - 1, bl = b.length - 1;
			if (a[0] == b[0] || a[al] == b[bl]) {
				return true;
			}
			return false;
		}
		return false;
	}
}