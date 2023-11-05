package codingbat.Array1;

public class problem25Double23 {
//Q. Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.

//double23([2, 2]) → true
//double23([3, 3]) → true
//double23([2, 3]) → false

	public static void main(String[] args) {
		int[] nums = { 2, 2 };
		System.out.println(double23(nums));
	}

	public static boolean double23(int[] nums) {
		if (nums.length != 1 && nums.length != 0)
			return ((nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3));
		else
			return false;

//		if(nums.length>1) {
//			if(nums[0]==nums[1]) {
//				return true;
//			}
//			else {
//				return false;
//			}
//		}
//		else {
//			return false;
//		}
	}
}
