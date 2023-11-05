package codingbat.Array1;

public class problem27Start1 {
//Q. Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.

//start1([1, 2, 3], [1, 3]) → 2
//start1([7, 2, 3], [1]) → 1
//start1([1, 2], []) → 1

	public static void main(String[] args) {
		int[] a = { 1, 2 };
		int[] b = { 1 };
		System.out.println(start1(a, b));
	}

	public static int start1(int[] a, int[] b) {
		if (b.length == 0) {
			if (a.length == 0) {
				return 0;
			} else {
				if (a[0] == 1)
					return 1;
			}
		}

		else if (a.length == 0) {
			if (b.length == 0) {
				return 0;
			} else {
				if (b[0] == 1)
					return 1;
			}
		} else if (a.length > 0 || b.length > 0) {
			if (a[0] == 1 && b[0] == 1) {
				return 2;
			} else if ((a[0] == 1 && b[0] != 1) || (a[0] != 1 && b[0] == 1)) {
				return 1;
			} else {
				return 0;
			}
		}

		return 0;

	}
}
