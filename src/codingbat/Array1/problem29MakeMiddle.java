package codingbat.Array1;

public class problem29MakeMiddle {
//Q. Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. 
//	The original array will be length 2 or more.

//makeMiddle([1, 2, 3, 4]) → [2, 3]
//makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
//makeMiddle([1, 2]) → [1, 2]

	public static void main(String[] args) {
		int[] a = {1,2};
		int[] nums2 = makeMiddle(a);
		for (int i = 0; i < nums2.length; i++) {
			System.out.print(nums2[i] + ",");
		}
	}

	public static int[] makeMiddle(int[] nums) {
		int n =(nums.length/2)-1;
		return new int[] {nums[n],nums[n+1]};
	}
}