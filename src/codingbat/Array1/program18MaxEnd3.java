package codingbat.Array1;

public class program18MaxEnd3 {
//Q. Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. 
//	Return the changed array.

//maxEnd3([1, 2, 3]) → [3, 3, 3]
//maxEnd3([11, 5, 9]) → [11, 11, 11]
//maxEnd3([2, 11, 3]) → [3, 3, 3]

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		int[] nums2 = maxEnd3(nums);
		for (int i = 0; i < nums2.length; i++) {
			System.out.print(nums2[i] + ",");
		}
	}

	public static int[] maxEnd3(int[] nums) {
		int max = Math.max(nums[0], nums[2]);
		return new int[] { max, max, max };
	}
}
