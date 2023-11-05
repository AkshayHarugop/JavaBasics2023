package codingbat.Array2;

public class problem28Has12 {
//Q. Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.

//has12([1, 3, 2]) → true
//has12([3, 1, 2]) → true
//has12([3, 1, 4, 5, 2]) → true

	public static void main(String[] args) {
		int[] nums = { 2, 1, 4, 1, 6 };
//		int[] nums2 = countEvens(nums);
		System.out.println(has12(nums));
//		for (int i = 0; i < nums2.length; i++) {
//			System.out.print(nums2[i] + ",");
//		}
	}

	public static boolean has12(int[] nums) {
		boolean temp = true;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1 && temp == true) {
				for (int j = i; j < nums.length; j++) {
					if (nums[j] == 2) {
						return true;
					}
				}
			}
			if (nums[i] == 2 && temp == false) {
				return false;
			}
		}
		return false;
	}
}
