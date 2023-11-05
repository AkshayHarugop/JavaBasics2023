package codingbat.Array2;

public class problem32SameEnds {
//Q. Return true if the group of N numbers at the start and end of the array are the same. 
//	 For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for n=1 and n=3. 
//	 You may assume that n is in the range 0..nums.length inclusive.

//sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → false
//sameEnds([5, 6, 45, 99, 13, 5, 6], 2) → true
//sameEnds([5, 6, 45, 99, 13, 5, 6], 3) → false

	public static void main(String[] args) {
		int[] nums = { 5, 6, 7, 45, 99, 13, 5, 6, 7 };
		System.out.println(sameEnds(nums, 3));
	}

	public static boolean sameEnds(int[] nums, int len) {
		int j = len, count = 0;
		for (int i = 0; i < len; i++) {
			if (nums[i] == nums[nums.length - j]) {
				j--;
				count++;
			}
		}

		if (count == len) {
			return true;
		} else {
			return false;
		}
	}
}
