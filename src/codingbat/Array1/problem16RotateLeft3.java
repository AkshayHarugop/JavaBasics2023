package codingbat.Array1;

public class problem16RotateLeft3 {
//Q. Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.

//			rotateLeft3([1, 2, 3]) → [2, 3, 1]
//			rotateLeft3([5, 11, 9]) → [11, 9, 5]
//			rotateLeft3([7, 0, 0]) → [0, 0, 7]

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		int[] nums2 = rotateLeft3(nums);
		for (int i = 0; i < nums2.length; i++) {
			System.out.print(nums2[i] + ",");
		}
	}

	public static int[] rotateLeft3(int[] nums) {
		int[] nums2 = {nums[1],nums[2],nums[0]};
		return nums2;
//		int temp = nums[0];
//		nums[0] = nums[1];
//		nums[1] = nums[2];
//		nums[2] = temp;
//		return nums;
	}
}
