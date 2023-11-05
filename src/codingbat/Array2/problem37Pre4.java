package codingbat.Array2;

public class problem37Pre4 {
//Q. Given a non-empty array of ints, return a new array containing the elements from the original array that come before the first 4 in the original array. 
//	 The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.

//pre4([1, 2, 4, 1]) → [1, 2]
//pre4([3, 1, 4]) → [3, 1]
//pre4([1, 4, 4]) → [1]

	public static void main(String[] args) {
		int[] nums = { 1, 2, 4, 1 };
		int[] nums2 = pre4(nums);
		for (int i = 0; i < nums2.length; i++) {
			System.out.print(nums2[i] + ",");
		}
	}

	public static int[] pre4(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 4 && i > 0) {
				int[] foo;
				foo = new int[i];
				for (int j = 0; j < foo.length; j++) {
					foo[j] = nums[j];
				}
				if (nums[0] != 4)
					return foo;
			}
		}
		int[] bar;
		bar = new int[0];
		return bar;

	}
}
