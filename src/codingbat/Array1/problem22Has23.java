package codingbat.Array1;

public class problem22Has23 {
//Q. Given an int array length 2, return true if it contains a 2 or a 3.

//has23([2, 5]) → true
//has23([4, 3]) → true
//has23([4, 5]) → false

	public static void main(String[] args) {
		int[] nums = { 4,3 };
		System.out.println(has23(nums));
	}

	public static boolean has23(int[] nums) {
		if(nums[0]==2||nums[1]==2||nums[0]==3||nums[1]==3) {
			return true;
		}else {
		return false;
		}

	}
}