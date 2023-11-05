package codingbat.Array1;

public class program17Reverse3 {
//Q. Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.

//reverse3([1, 2, 3]) → [3, 2, 1]
//reverse3([5, 11, 9]) → [9, 11, 5]
//reverse3([7, 0, 0]) → [0, 0, 7]

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		int[] nums2 = reverse3(nums);
		for (int i = 0; i < nums2.length; i++) {
			System.out.print(nums2[i] + ",");
		}
	}

	public static int[] reverse3(int[] nums) {
		return new int[] { nums[2], nums[1], nums[0] };
	}
}
