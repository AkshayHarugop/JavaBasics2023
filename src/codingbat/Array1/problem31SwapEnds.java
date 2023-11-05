package codingbat.Array1;

public class problem31SwapEnds {
//Q. Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.

//swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
//swapEnds([1, 2, 3]) → [3, 2, 1]
//swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]

//	reverse the array 
//	int[] num = new int[nums.length];
//	int j = 0;
//	for (int i = nums.length - 1; i >= 0; i--) {
//		num[j] = nums[i];
//		j++;
//	}

	public static void main(String[] args) {
		int[] a = { 8, 6, 7, 9, 5 };
		int[] nums2 = swapEnds(a);
		for (int i = 0; i < nums2.length; i++) {
			System.out.print(nums2[i] + ",");
		}
	}

	public static int[] swapEnds(int[] nums) {
//		int[] num = new int[nums.length];
		int temp=0;
		for (int i = 0; i < nums.length; i++) {
			if(i==0) {
				temp = nums[i];
				nums[i]=nums[nums.length-1];
				nums[nums.length-1]=temp;
			}
		}
		return nums;
	}
}
