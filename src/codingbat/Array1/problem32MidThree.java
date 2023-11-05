package codingbat.Array1;

public class problem32MidThree {
//Q. Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. 
//	The array length will be at least 3.

//midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
//midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
//midThree([1, 2, 3]) → [1, 2, 3]

	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		int[] nums2 = midThree(a);
		for (int i = 0; i < nums2.length; i++) {
			System.out.print(nums2[i] + ",");
		}
	}

	public static int[] midThree(int[] nums) {
		int s = nums.length / 2 - 1;
		return new int[] { nums[s], nums[s + 1], nums[s + 2] };
	}
}
