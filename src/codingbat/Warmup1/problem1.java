package codingbat.Warmup1;

public class problem1 {
//Q. The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
//	We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

//sleepIn(false, false) → true
//sleepIn(true, false) → false
//sleepIn(false, true) → true
	
	public static void main(String[] args) {
		System.out.println(sleepIn(false,true));
	}

	public static boolean sleepIn(boolean weekday, boolean vacation) {
		if(vacation==true) {
			return true;
		}
		if(weekday==false) {
			return true;
		}
		return false;
	}

}
