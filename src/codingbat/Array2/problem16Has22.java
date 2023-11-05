package codingbat.Array2;

public class problem16Has22 {
//Q. Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.

//has22([1, 2, 2]) → true
//has22([1, 2, 1, 2]) → false
//has22([2, 1, 2]) → false

	public static void main(String[] args) {
		int[] nums = { 2, 1, 2 };
//		int[] nums2 = countEvens(nums);
		System.out.println(has22(nums));
//		for (int i = 0; i < nums2.length; i++) {
//			System.out.print(nums2[i] + ",");
//		}
	}

	public static boolean has22(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 2 && nums[i + 1] == 2) {
				count++;
			}
		}

		return (count == 0) ? false : true;

	}
}
