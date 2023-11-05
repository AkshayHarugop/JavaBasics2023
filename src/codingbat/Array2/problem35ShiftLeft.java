package codingbat.Array2;

public class problem35ShiftLeft {
//Q. Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and return the given array, or return a new array.

//shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
//shiftLeft([1, 2]) → [2, 1]
//shiftLeft([1]) → [1]

	public static void main(String[] args) {
		int[] nums = { 1 };
		int[] nums2 = shiftLeft(nums);
		for (int i = 0; i < nums2.length; i++) {
			System.out.print(nums2[i] + ",");
		}
	}

	public static int[] shiftLeft(int[] nums) {
		int[] a = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if (i > 0) {
				a[i - 1] = nums[i];
			}
			if (i == 0) {
				a[nums.length - 1] = nums[i];
			}
		}

		return a;
	}
}
