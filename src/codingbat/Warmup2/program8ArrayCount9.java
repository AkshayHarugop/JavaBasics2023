package codingbat.Warmup2;

public class program8ArrayCount9 {
//Q. Given an array of ints, return the number of 9's in the array.

//arrayCount9([1, 2, 9]) → 1
//arrayCount9([1, 9, 9]) → 2
//arrayCount9([1, 9, 9, 3, 9]) → 3

	public static void main(String[] args) {
		int[] nums = { 1, 9, 9, 3, 9 };
		System.out.println(arrayCount9(nums));
	}

	public static int arrayCount9(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 9) {
				count++;
			}
		}
		return count;
	}
}