package codingbat.Logic1;

public class problem18In1To10 {
//Q. Given a number n, return true if n is in the range 1..10, inclusive. 
//	Unless outsideMode is true, in which case return true if the number is less or equal to 1, or greater or equal to 10.

//			in1To10(5, false) → true
//			in1To10(11, false) → false
//			in1To10(11, true) → true

	public static void main(String[] args) {
		System.out.println(in1To10(5, false));
		System.out.println(in1To10(11, false));
		System.out.println(in1To10(11, true));
		System.out.println(in1To10(9, true));
	}

	public static boolean in1To10(int n, boolean outsideMode) {
		if (!outsideMode) {
			return (n >= 1 && n <= 10) ? true : false;
//		    if (n >= 1 && n <= 10) {
//		      return true;
//		    } else {
//		        return false;
//		      }
		} else {
			return (n <= 1 || n >= 10) ? true : false;
//		      if (n <= 1 || n >= 10) {
//		        return true;
//		      } else {
//		          return false;
//		        }
		}
	}
}
