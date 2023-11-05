package codingbat.Warmup1;

public class problem2 {
//Q. We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each are smiling. 
//	We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

//monkeyTrouble(true, true) → true
//monkeyTrouble(false, false) → true
//monkeyTrouble(true, false) → false

	public static void main(String[] args) {
		System.out.println(monkeyTrouble(false, false));
	}

	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		if (aSmile == true && bSmile == true || aSmile == false && bSmile == false) {
			return true;
		}
		return false;
	}

}
