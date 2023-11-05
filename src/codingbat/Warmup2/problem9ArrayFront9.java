package codingbat.Warmup2;

public class problem9ArrayFront9 {
//Q. Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.

//			arrayFront9([1, 2, 9, 3, 4]) → true
//			arrayFront9([1, 2, 3, 4, 9]) → false
//			arrayFront9([1, 2, 3, 4, 5]) → false
	public static void main(String[] args) {
		int[] nums = {1, 2, 3};
		System.out.println(arrayFront9(nums));
	}
	public static boolean arrayFront9(int[] nums) {
		int count=0;
		for(int i=0;i<nums.length;i++) {
			if(i<4) {
				if(nums[i]==9) {
					count++;
				}
			}else {
				break;
			}
		}
		return (count==0)?false:true;
	}
}