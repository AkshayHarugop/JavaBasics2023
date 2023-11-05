package codingbat.Array1;

public class problem33MaxTriple {
//Q. Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.

//maxTriple([1, 2, 3]) → 3
//maxTriple([1, 5, 3]) → 5
//maxTriple([5, 2, 3]) → 5
//maxTriple([5, 1, 3, 7, 1]) → 5
	
	public static void main(String[] args) {
		int[] a = { 5, 1, 3, 7, 1 };
		System.out.println(maxTriple(a));
	}
	public static int maxTriple(int[] nums) {
		int temp=0;
		for(int i=0;i<nums.length;i++) {
			if(i==0||i==nums.length-1||i==nums.length/2) {
				if(nums[i]>temp) {
					temp=nums[i];
				}
			}
		}
		return temp;
	}
}
