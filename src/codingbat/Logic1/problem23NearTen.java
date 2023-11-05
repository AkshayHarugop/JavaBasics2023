package codingbat.Logic1;

public class problem23NearTen {
//Q. Given a non-negative number "num", return true if num is within 2 of a multiple of 10. 
//	Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod

//nearTen(12) → true
//nearTen(17) → false
//nearTen(19) → true
	
	public static void main(String[] args) {
		System.out.println(nearTen(12));
		System.out.println(nearTen(17));
		System.out.println(nearTen(19));
	}
	public static boolean nearTen(int num) {
		System.out.println(num%10);
		if(num%10==0||num%10==1||num%10==2||num%10==8||num%10==9) {
		  return true;
		}else {
			return false;
		}
	}
}
