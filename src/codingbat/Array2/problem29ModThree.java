package codingbat.Array2;

public class problem29ModThree {
//Q. Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.

//modThree([2, 1, 3, 5]) → true
//modThree([2, 1, 2, 5]) → false
//modThree([2, 4, 2, 5]) → true

	public static void main(String[] args) {
		int[] nums = { 1, 2, 1, 2, 1 };
//		int[] nums2 = countEvens(nums);
		System.out.println(modThree(nums));
//		for (int i = 0; i < nums2.length; i++) {
//			System.out.print(nums2[i] + ",");
//		}
	}

	public static boolean modThree(int[] nums) {
		int counteven = 0, countodd = 0;
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] % 2 == 0) {
				if (nums[i + 1] % 2 == 0) {
					if (nums[i + 2] % 2 == 0) {
						counteven++;
					}
				}
			}
			if (nums[i] % 2 != 0) {
				if (nums[i + 1] % 2 != 0) {
					if (nums[i + 2] % 2 != 0) {
						countodd++;
					}
				}
			}
		}

		if (counteven == 1 || countodd == 1) {
			return true;
		} else {
			return false;
		}
	}
}
